package com.pedro.demo.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "modelo")
public class Modelo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "nome", nullable = false)
    private String nome;
    @Temporal(TemporalType.DATE)
    @Column(name = "ano", nullable = false)
    private Date ano;
    private boolean ativo;
    @ManyToOne
    private Marca marca;

    public Long getId() {
        return id;
    }

    public Modelo() {

    }

    public Modelo(Long id, String nome, Date ano, boolean ativo, Marca marca) {
        this.id = id;
        this.nome = nome;
        this.ano = ano;
        this.ativo = ativo;
        this.marca = marca;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getAno() {
        return ano;
    }

    public void setAno(Date ano) {
        this.ano = ano;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }
}
