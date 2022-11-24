/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jhuliogabriel.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author alunolab10
 */
@Entity
@Table(name="Rodada")
public class RodadaModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(nullable = false)
    private PartidaModel partida;
    
    @Column(nullable = false)
    private String tempo;

    public RodadaModel() {
    }
  
    public RodadaModel(PartidaModel partida, String tempo) {
        this.partida = partida;
        this.tempo = tempo;
    }

    public PartidaModel getPartida() {
        return partida;
    }

    public void setPartida(PartidaModel partida) {
        this.partida = partida;
    }

    public String getTempo() {
        return tempo;
    }

    public void setTempo(String tempo) {
        this.tempo = tempo;
    }

    public Long getId() {
        return id;
    }
    
    
}
