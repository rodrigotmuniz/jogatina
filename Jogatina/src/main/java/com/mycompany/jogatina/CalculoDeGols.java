/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jogatina;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rodrigo Muniz
 */
public class CalculoDeGols {
    
    public static void main(String[] args) throws IOException {
        List<Media> mediaDeGols = criarListMediaGols(5);
        List<Partida> partidasDaRodada = criarListaDePartidasDaRodada();
        Media mediaCasa = new Media();
        Media mediaVisitante = new Media();
        
        for(Partida partida: partidasDaRodada) {
            for(Media media: mediaDeGols) {
                if(media.getNomeDotime().equals(partida.getCasa())) {
                    mediaCasa = media;
                    break;
                }
            }
            for(Media media: mediaDeGols) {
                if(media.getNomeDotime().equals(partida.getVisitante())) {
                    mediaVisitante = media;
                    break;
                }
            }
            Float mediaFinal = (mediaCasa.getMediaGolsMarcados()+ mediaVisitante.getMediaGolsSofridos()) / 2 + (mediaVisitante.getMediaGolsMarcados() + mediaCasa.getMediaGolsSofridos()) / 2 ;
            System.out.println(mediaFinal);
//            System.out.println(mediaCasa.getNomeDotime() + "\t" + mediaVisitante.getNomeDotime() + "\t" + mediaFinal);
        }
//        for(Media media: mediaDeGols) {
//            System.out.println(media.toString());
//        }
        
    }
    
    public static List<Media> criarListMediaGols(int qtdeRodadas) throws FileNotFoundException, IOException {
        BufferedReader br = new BufferedReader(new FileReader("media-gols.txt"));
        List<Media> mediaDeGols = new ArrayList<>();

        String line = br.readLine();
        while (line != null) {
            String [] lineParts = line.split("\t");
            
            Media media = new Media();
            media.setNomeDotime(lineParts[0]);
            
            boolean golSofrido = true;
            for(int i = lineParts.length - 1; i > lineParts.length - qtdeRodadas * 4; i = i - 2) {
                
                if(golSofrido) {
                    media.setQtdeGolsSofridos(media.getQtdeGolsSofridos() + Float.parseFloat(lineParts[i]));
                    golSofrido = false;
                }
                else {
                    media.setQtdeGolsMarcados(media.getQtdeGolsMarcados()+ Float.parseFloat(lineParts[i]));
                    golSofrido = true;
                }
            }
            media.setMediaGolsMarcados(media.getQtdeGolsMarcados() / qtdeRodadas);
            media.setMediaGolsSofridos(media.getQtdeGolsSofridos()/ qtdeRodadas);
            mediaDeGols.add(media);
            line = br.readLine();
        }
        br.close();
        return mediaDeGols;
    }
    
    public static List<Partida> criarListaDePartidasDaRodada() throws FileNotFoundException, IOException {
        BufferedReader br = new BufferedReader(new FileReader("rodada.txt"));
        List<Partida> partidasDaRodada = new ArrayList<>();

        String line = br.readLine();
        while (line != null) {
            String casa = line.substring(0, line.indexOf("\t"));
            String visitante = line.substring(line.lastIndexOf("\t") + 1);
            int placarCasa = Integer.parseInt(line.substring(line.lastIndexOf("\t") - 3, line.lastIndexOf("\t") - 2));
            int placarVisitante = Integer.parseInt(line.substring(line.lastIndexOf("\t") - 1, line.lastIndexOf("\t")));
            Partida partida = new Partida(casa, visitante, placarCasa, placarVisitante);
            partidasDaRodada.add(partida);
            line = br.readLine();
        }
        br.close();
        return partidasDaRodada;
    }
    
}
