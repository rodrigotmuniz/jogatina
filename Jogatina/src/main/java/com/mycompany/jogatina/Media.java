/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jogatina;

/**
 *
 * @author Rodrigo Muniz
 */
public class Media {
    
    private String nomeDotime;
    private float qtdeGolsMarcados;
    private float qtdeGolsSofridos;
    private float mediaGolsMarcados;
    private float mediaGolsSofridos;

    public Media() {
    }
    
    

    public Media(String nomeDotime, float qtdeGolsMarcados, float qtdeGolsSofridos, float mediaGolsMarcados, float mediaGolsSofridos) {
        this.nomeDotime = nomeDotime;
        this.qtdeGolsMarcados = qtdeGolsMarcados;
        this.qtdeGolsSofridos = qtdeGolsSofridos;
        this.mediaGolsMarcados = mediaGolsMarcados;
        this.mediaGolsSofridos = mediaGolsSofridos;
    }

    public String getNomeDotime() {
        return nomeDotime;
    }

    public void setNomeDotime(String nomeDotime) {
        this.nomeDotime = nomeDotime;
    }

    public float getQtdeGolsMarcados() {
        return qtdeGolsMarcados;
    }

    public void setQtdeGolsMarcados(float qtdeGolsMarcados) {
        this.qtdeGolsMarcados = qtdeGolsMarcados;
    }

    public float getQtdeGolsSofridos() {
        return qtdeGolsSofridos;
    }

    public void setQtdeGolsSofridos(float qtdeGolsSofridos) {
        this.qtdeGolsSofridos = qtdeGolsSofridos;
    }

    public float getMediaGolsMarcados() {
        return mediaGolsMarcados;
    }

    public void setMediaGolsMarcados(float mediaGolsMarcados) {
        this.mediaGolsMarcados = mediaGolsMarcados;
    }

    public float getMediaGolsSofridos() {
        return mediaGolsSofridos;
    }

    public void setMediaGolsSofridos(float mediaGolsSofridos) {
        this.mediaGolsSofridos = mediaGolsSofridos;
    }
    
    @Override
    public String toString() {
        return getNomeDotime() + "\t" + getMediaGolsMarcados() + "\t" + getMediaGolsSofridos();
    }
    
    
    
}
