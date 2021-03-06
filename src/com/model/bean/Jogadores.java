/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model.bean;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author fabricio
 */
@Entity
public class Jogadores implements Serializable{

    /**
     * @return the nick
     */
    public String getNick() {
        return nick;
    }

    /**
     * @param nick the nick to set
     */
    public void setNick(String nick) {
        this.nick = nick;
    }

    /**
     * @return the cadastro
     */
    public String getCadastro() {
        return cadastro;
    }

    /**
     * @param cadastro the cadastro to set
     */
    public void setCadastro(String cadastro) {
        this.cadastro = cadastro;
    }

    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idjogador;
    private String nome;
    @Column(unique = true)
    private String nick;
    private String cadastro;
    private Integer pontuacao;

    public Integer getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(Integer pontuacao) {
        this.pontuacao = pontuacao;
    }
    private boolean estadoatual;

    public Integer getidjogador() {
        return idjogador;
    }

    public void setidjogador(Integer idjogador) {
        this.idjogador = idjogador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public boolean isEstadoatual() {
        return estadoatual;
    }

    public void setEstadoatual(boolean estadoatual) {
        this.estadoatual = estadoatual;
    }

    @Override
    public String toString() {
        return getNome(); //To change body of generated methods, choose Tools | Templates.
    }
}
