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
public class Data {
    
    private Long x;
    private Long y;
    private String name;

    public Data() {
    }

    public Data(Long x, Long y, String name) {
        this.x = x;
        this.y = y;
        this.name = name;
    }

    public Long getX() {
        return x;
    }

    public void setX(Long x) {
        this.x = x;
    }

    public Long getY() {
        return y;
    }

    public void setY(Long y) {
        this.y = y;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    
}
