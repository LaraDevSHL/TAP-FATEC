package com.clinicaveterinaria.prof_atend.model;
import com.clinicaveterinaria.prof_atend.model.Funcionario;
public class Recepcionista extends Funcionario {

    private String setor;

    public Recepcionista() {
    }

    public Recepcionista(Long id,
                         String nome,
                         String cpf,
                         String setor) {

        super(id, nome, cpf);

        this.setor = setor;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }
}
