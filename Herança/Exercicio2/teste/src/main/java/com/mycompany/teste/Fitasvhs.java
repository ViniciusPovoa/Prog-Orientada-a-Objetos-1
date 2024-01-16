
package com.mycompany.teste;

public class Fitasvhs {
    
    
    private String videos;
    private boolean rodando;
    
    public Fitasvhs(String videos, boolean rodando){
        this.videos = videos;
        this.rodando = rodando;
    }
    
    public String getVideos(){
        return videos;
    }
    
    public boolean rodando(){
        return rodando;
    }
}

