/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jogatina;

import java.beans.Transient;

/**
 *
 * @author Rodrigo Muniz
 */
public class ForcasDoTime {
    
    private String nomeDoTime;
    private float forcaDeAtaque;
    private float forcaDeDefesa;
    private int qtdeGolsAtaque;
    private int qtdeGolsDefesa;

    public ForcasDoTime() {
    }

    public ForcasDoTime(String nomeDoTime, float forcaDeAtaque, float forcaDeDefesa) {
        this.nomeDoTime = nomeDoTime;
        this.forcaDeAtaque = forcaDeAtaque;
        this.forcaDeDefesa = forcaDeDefesa;
    }

    public String getNomeDoTime() {
        return nomeDoTime;
    }

    public void setNomeDoTime(String nomeDoTime) {
        this.nomeDoTime = nomeDoTime;
    }

    public float getForcaDeAtaque() {
        return forcaDeAtaque;
    }

    public void setForcaDeAtaque(float forcaDeAtaque) {
        this.forcaDeAtaque = forcaDeAtaque;
    }

    public float getForcaDeDefesa() {
        return forcaDeDefesa;
    }

    public void setForcaDeDefesa(float forcaDeDefesa) {
        this.forcaDeDefesa = forcaDeDefesa;
    }

    public int getQtdeGolsAtaque() {
        return qtdeGolsAtaque;
    }

    public void setQtdeGolsAtaque(int qtdeGols) {
        this.qtdeGolsAtaque = qtdeGols;
    }

    public int getQtdeGolsDefesa() {
        return qtdeGolsDefesa;
    }

    public void setQtdeGolsDefesa(int qtdeGolsDefesa) {
        this.qtdeGolsDefesa = qtdeGolsDefesa;
    }
    
    @Override
    public String toString() {
        return getForcaDeAtaque() + "\t" + getQtdeGolsAtaque() + "\t" + getForcaDeDefesa() + "\t" + getQtdeGolsDefesa();
    }
    
    
    
}
