
package com.mycompany.calculasalario;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


public class CalcularSalario {

    public static void main(String[] args) {
        
        String arquivoSalBruto = "salbruto.dat";
        String arquivoDesc = "desc.dat";
        String arquivoSalLiq = "salliq.txt";

        Map<String, Double> salBrutoMap = lerArquivoSalBruto(arquivoSalBruto);
        Map<String, Double> descMap = lerArquivoDesc(arquivoDesc);
        Map<String, Double> salLiqMap = calcularSalariosLiquidos(salBrutoMap, descMap);

        gravarArquivoSalLiq(salLiqMap, arquivoSalLiq);

        System.out.println("Todos os salarios liquidos foram calculados e foram gravados no arquivo " + arquivoSalLiq);
    }

    public static Map<String, Double> lerArquivoSalBruto(String arquivo) {
        Map<String, Double> salBrutoMap = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(arquivo))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(" ");
                if (parts.length == 2) {
                    String cpf = parts[0];
                    double salBruto = Double.parseDouble(parts[1]);
                    salBrutoMap.put(cpf, salBruto);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return salBrutoMap;
    }

    public static Map<String, Double> lerArquivoDesc(String arquivo) {
        Map<String, Double> descMap = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(arquivo))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(" ");
                if (parts.length == 2) {
                    String cpf = parts[0];
                    double desc = Double.parseDouble(parts[1]);
                    descMap.put(cpf, desc);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return descMap;
    }

    public static Map<String, Double> calcularSalariosLiquidos(Map<String, Double> salBrutoMap, Map<String, Double> descMap) {
        Map<String, Double> salLiqMap = new HashMap<>();

        for (String cpf : salBrutoMap.keySet()) {
            if (descMap.containsKey(cpf)) {
                double salBruto = salBrutoMap.get(cpf);
                double desc = descMap.get(cpf);
                double salLiq = salBruto - desc;
                salLiqMap.put(cpf, salLiq);
            }
        }

        return salLiqMap;
    }

    public static void gravarArquivoSalLiq(Map<String, Double> salLiqMap, String arquivo) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(arquivo))) {
            for (String cpf : salLiqMap.keySet()) {
                double salLiq = salLiqMap.get(cpf);
                writer.write(cpf + " " + salLiq);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
