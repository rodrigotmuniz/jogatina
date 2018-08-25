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
public class Response {
    private List<Graph> graph;
    private List<X_Labels> x_labels;
    private List<GraphBand> graph_bands;
    private String view;
    private String status;

    public Response() {
    }

    public List<Graph> getGraph() {
        return graph;
    }

    public void setGraph(List<Graph> graph) {
        this.graph = graph;
    }

    public List<X_Labels> getX_labels() {
        return x_labels;
    }

    public void setX_labels(List<X_Labels> x_labels) {
        this.x_labels = x_labels;
    }

    public List<GraphBand> getGraph_bands() {
        return graph_bands;
    }

    public void setGraph_bands(List<GraphBand> graph_bands) {
        this.graph_bands = graph_bands;
    }

    public String getView() {
        return view;
    }

    public void setView(String view) {
        this.view = view;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
    
    

    
    
    
}
