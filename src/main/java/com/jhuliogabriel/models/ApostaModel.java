/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jhuliogabriel.models;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author alunolab10
 */
public class ApostaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(nullable = false)
    RodadaModel rodada;

    public ApostaModel() {
    }
    
    public ApostaModel(RodadaModel rodada) {
        this.rodada = rodada;
    }

    public RodadaModel getRodada() {
        return rodada;
    }

    public void setRodada(RodadaModel rodada) {
        this.rodada = rodada;
    }

    public Long getId() {
        return id;
    }
    
    
    
}
