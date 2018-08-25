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
public class Main {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        List<Partida> partidasDaRodada = criarListaDePartidasDaRodada();
        List<ForcasDoTime> forcasDosTimes = criarListaDeForcasDosTimes();
        List<ForcasDoTime> forcasDosTimesAtualizadas = atualizarForcas(forcasDosTimes, partidasDaRodada);
        for(ForcasDoTime ft: forcasDosTimesAtualizadas) {
            System.out.println(ft);
        }
        

    }

    public static List<ForcasDoTime> atualizarForcas(List<ForcasDoTime> forcasDosTimes, List<Partida> partidasDaRodada) {
        List<ForcasDoTime> forcasDosTimesAtualizadas = new ArrayList<>();
        
        for (ForcasDoTime forcasDoTime : forcasDosTimes) {
            String nomeTimeEmEstudo = forcasDoTime.getNomeDoTime();
            Partida partidaEmEstudo = localizarPartida(nomeTimeEmEstudo, partidasDaRodada);
            String nomeTimeAdversario = partidaEmEstudo.getCasa().equals(nomeTimeEmEstudo) ? partidaEmEstudo.getVisitante() : partidaEmEstudo.getCasa();
            
            ForcasDoTime forcasDotimeAdversario = buscarForcasDoTimeAdversario(nomeTimeAdversario, forcasDosTimes);
            forcasDosTimesAtualizadas.add(calcularNovaForcaDoTime(forcasDoTime, forcasDotimeAdversario, partidaEmEstudo));
        }
        return forcasDosTimesAtualizadas;
    }
    
    public static ForcasDoTime calcularNovaForcaDoTime(ForcasDoTime timeEmEstudo, ForcasDoTime timeAdversario, Partida partida) {
        ForcasDoTime timeEmEstudoAtualizado = new ForcasDoTime(timeEmEstudo.getNomeDoTime(), 0, 0);
        
        if(partida.getCasa().equals(timeEmEstudo.getNomeDoTime())) {
            timeEmEstudoAtualizado.setQtdeGolsAtaque(partida.getPlacarCasa());
            timeEmEstudoAtualizado.setQtdeGolsDefesa(partida.getPlacarVisitante());
            
            if(partida.getPlacarCasa() == 0) {
                timeEmEstudoAtualizado.setForcaDeAtaque(timeEmEstudo.getForcaDeAtaque() - (100 - timeAdversario.getForcaDeDefesa()) / 10);
            }
            else {
                timeEmEstudoAtualizado.setForcaDeAtaque(timeEmEstudo.getForcaDeAtaque() + partida.getPlacarCasa() * (timeAdversario.getForcaDeDefesa()) / 10);
            }
            
            if(partida.getPlacarVisitante() == 0) {
                timeEmEstudoAtualizado.setForcaDeDefesa(timeEmEstudo.getForcaDeDefesa() + (timeAdversario.getForcaDeAtaque()) / 10);
            }
            else {
                timeEmEstudoAtualizado.setForcaDeDefesa(timeEmEstudo.getForcaDeDefesa() - partida.getPlacarVisitante() * (100 - timeAdversario.getForcaDeAtaque()) / 10);
            }
        }
        else {
            timeEmEstudoAtualizado.setQtdeGolsAtaque(partida.getPlacarVisitante());
            timeEmEstudoAtualizado.setQtdeGolsDefesa(partida.getPlacarCasa());
            
            if(partida.getPlacarVisitante() == 0) {
                timeEmEstudoAtualizado.setForcaDeAtaque(timeEmEstudo.getForcaDeAtaque() - (100 - timeAdversario.getForcaDeDefesa()) / 10);
            }
            else {
                timeEmEstudoAtualizado.setForcaDeAtaque(timeEmEstudo.getForcaDeAtaque() + partida.getPlacarVisitante() * (timeAdversario.getForcaDeDefesa()) / 10);
            }
            
            if(partida.getPlacarCasa() == 0) {
                timeEmEstudoAtualizado.setForcaDeDefesa(timeEmEstudo.getForcaDeDefesa() + (timeAdversario.getForcaDeAtaque()) / 10);
            }
            else {
                timeEmEstudoAtualizado.setForcaDeDefesa(timeEmEstudo.getForcaDeDefesa() - partida.getPlacarCasa() * (100 - timeAdversario.getForcaDeAtaque()) / 10);
            }
        }
        
        timeEmEstudoAtualizado.setForcaDeAtaque(timeEmEstudoAtualizado.getForcaDeAtaque() > 99 ? 99 : timeEmEstudoAtualizado.getForcaDeAtaque());
        timeEmEstudoAtualizado.setForcaDeAtaque(timeEmEstudoAtualizado.getForcaDeAtaque() < 1 ? 1 : timeEmEstudoAtualizado.getForcaDeAtaque());
        timeEmEstudoAtualizado.setForcaDeDefesa(timeEmEstudoAtualizado.getForcaDeDefesa() > 99 ? 99 : timeEmEstudoAtualizado.getForcaDeDefesa());
        timeEmEstudoAtualizado.setForcaDeDefesa(timeEmEstudoAtualizado.getForcaDeDefesa() < 1 ? 1 : timeEmEstudoAtualizado.getForcaDeDefesa());
        return timeEmEstudoAtualizado;
    }
    
    public static ForcasDoTime buscarForcasDoTimeAdversario(String nomeTimeAdversario, List<ForcasDoTime> forcasDosTimes) {
        for(ForcasDoTime forcasDoTime: forcasDosTimes) {
            if(forcasDoTime.getNomeDoTime().equals(nomeTimeAdversario)) {
                return forcasDoTime;
            }
        }
        return null;
    }

    public static Partida localizarPartida(String nomeTimeEmEstudo, List<Partida> partidasDaRodada) {
        for (Partida partida : partidasDaRodada) {
            if (nomeTimeEmEstudo.equals(partida.getCasa())) {
                return partida;
            }
            if (nomeTimeEmEstudo.equals(partida.getVisitante())) {
                return partida;
            }
        }
        return null;
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

    public static List<ForcasDoTime> criarListaDeForcasDosTimes() throws FileNotFoundException, IOException {
        BufferedReader br = new BufferedReader(new FileReader("forcas.txt"));
        List<ForcasDoTime> forcasDosTimes = new ArrayList<>();

        String line = br.readLine();
        while (line != null) {
            String [] lineParts = line.split("\t");
            String nomeDoTime = lineParts[0];
            float forcaDeAtaque = Float.parseFloat(lineParts[1]);
            float forcaDeDefesa = Float.parseFloat(lineParts[3]);

            ForcasDoTime forcasDoTime = new ForcasDoTime(nomeDoTime, forcaDeAtaque, forcaDeDefesa);
            forcasDosTimes.add(forcasDoTime);
            line = br.readLine();
        }
        br.close();
        return forcasDosTimes;
    }
}
