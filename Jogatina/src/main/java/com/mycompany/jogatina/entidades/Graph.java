/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jogatina.entidades;

import java.util.List;

/**
 *
 * @author Rodrigo Muniz
 */
public class Graph {
    
    private String name;
    private String color;
    private String type;
    private Long pointStart;
    private List<Data> data;

    public Graph() {
    }

    public Graph(String name, String color, String type, Long pointStart, List<Data> data) {
        this.name = name;
        this.color = color;
        this.type = type;
        this.pointStart = pointStart;
        this.data = data;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Long getPointStart() {
        return pointStart;
    }

    public void setPointStart(Long pointStart) {
        this.pointStart = pointStart;
    }

    public List<Data> getData() {
        return data;
    }

    public void setData(List<Data> data) {
        this.data = data;
    }
    
    
    
}
