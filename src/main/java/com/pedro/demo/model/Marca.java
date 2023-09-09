package com.pedro.demo.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "marca")
public class Marca {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "nome", nullable = false)
    private String nome;
    @Column(name = "codigo_denatran", nullable = false)
    private String codigoDenatran;
    private boolean ativo;
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "marca")
    private List<Modelo> modelos = new ArrayList<Modelo>();

    public Marca() {
    }

    public Marca(Long id, String nome, String codigoDenatran, boolean ativo, List<Modelo> modelos) {
        this.id = id;
        this.nome = nome;
        this.codigoDenatran = codigoDenatran;
        this.ativo = ativo;
        this.modelos = modelos;
    }

    public Long getId() {
        return id;
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

    public String getCodigoDenatran() {
        return codigoDenatran;
    }

    public void setCodigoDenatran(String codigoDenatran) {
        this.codigoDenatran = codigoDenatran;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public List<Modelo> getModelos() {
        return modelos;
    }

    public void setModelos(List<Modelo> modelos) {
        this.modelos = modelos;
    }
}
