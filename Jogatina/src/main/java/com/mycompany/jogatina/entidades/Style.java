/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jogatina.entidades;

/**
 *
 * @author Rodrigo Muniz
 */
public class Style {
    
    private String color;
    private String fontSize;

    public Style() {
    }

    public Style(String color, String fontSize) {
        this.color = color;
        this.fontSize = fontSize;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFontSize() {
        return fontSize;
    }

    public void setFontSize(String fontSize) {
        this.fontSize = fontSize;
    }
    
    
    
}
