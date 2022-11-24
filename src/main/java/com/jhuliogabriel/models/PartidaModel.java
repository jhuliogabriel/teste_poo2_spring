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
@Table(name="Partida")
public class PartidaModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(nullable = false)
    private SelecaoModel mandante;

    @Column(nullable = false)
    private SelecaoModel visitante;    
    
    @Column(nullable = false)
    private int golsMandante;

    @Column(nullable = false)
    private int golsVisitante;
    
    @Column(nullable = false)
    private String tempo;

    public PartidaModel() {
    }

    public PartidaModel(SelecaoModel mandante, SelecaoModel visitante, int golsMandante, int golsVisitante, String tempo) {
        this.mandante = mandante;
        this.visitante = visitante;
        this.golsMandante = golsMandante;
        this.golsVisitante = golsVisitante;
        this.tempo = tempo;
    }

    public SelecaoModel getMandante() {
        return mandante;
    }

    public void setMandante(SelecaoModel mandante) {
        this.mandante = mandante;
    }

    public SelecaoModel getVisitante() {
        return visitante;
    }

    public void setVisitante(SelecaoModel visitante) {
        this.visitante = visitante;
    }

    public int getGolsMandante() {
        return golsMandante;
    }

    public void setGolsMandante(int golsMandante) {
        this.golsMandante = golsMandante;
    }

    public int getGolsVisitante() {
        return golsVisitante;
    }

    public void setGolsVisitante(int golsVisitante) {
        this.golsVisitante = golsVisitante;
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
