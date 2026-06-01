package com.clinicaveterinaria.prof_atend.model;
import com.clinicaveterinaria.prof_atend.model.Funcionario;
public class Veterinario extends Funcionario {

    private String crmv;
    private String especialidade;

    public Veterinario() {
    }

    public Veterinario(Long id,
                       String nome,
                       String cpf,
                       String crmv,
                       String especialidade) {

        super(id, nome, cpf);

        this.crmv = crmv;
        this.especialidade = especialidade;
    }

    public String getCrmv() {
        return crmv;
    }

    public void setCrmv(String crmv) {
        this.crmv = crmv;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}