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
public class Partida {
    
    private String casa;
    private String visitante;
    private int placarCasa;
    private int placarVisitante;

    public Partida() {
    }

    public Partida(String casa, String visitante, int placarCasa, int placarVisitante) {
        this.casa = casa;
        this.visitante = visitante;
        this.placarCasa = placarCasa;
        this.placarVisitante = placarVisitante;
    }

    public String getCasa() {
        return casa;
    }

    public void setCasa(String casa) {
        this.casa = casa;
    }

    public String getVisitante() {
        return visitante;
    }

    public void setVisitante(String visitante) {
        this.visitante = visitante;
    }

    public int getPlacarCasa() {
        return placarCasa;
    }

    public void setPlacarCasa(int placarCasa) {
        this.placarCasa = placarCasa;
    }

    public int getPlacarVisitante() {
        return placarVisitante;
    }

    public void setPlacarVisitante(int placarVisitante) {
        this.placarVisitante = placarVisitante;
    }
    
    @Override
    public String toString() {
        return getCasa() + " " + getPlacarCasa() + "-" + getPlacarVisitante() + " " + getVisitante();
    }
    
    
    
}
