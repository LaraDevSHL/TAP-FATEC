package com.clinicaveterinaria.prof_atend.model;

import java.util.Date;

public class Atendimento {

    private Long id;
    private Date data;
    private String descricao;

    private Veterinario veterinario;

    public Atendimento() {
    }

    public Atendimento(Long id,
                       Date data,
                       String descricao,
                       Veterinario veterinario) {

        this.id = id;
        this.data = data;
        this.descricao = descricao;
        this.veterinario = veterinario;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Veterinario getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(Veterinario veterinario) {
        this.veterinario = veterinario;
    }
}