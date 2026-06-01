package com.clinicaveterinaria.prof_atend.controller;
import com.clinicaveterinaria.prof_atend.model.Atendimento;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/atendimentos")
public class AtendimentoController {

    private List<Atendimento> atendimentos =
            new ArrayList<>();

    @PostMapping
    public Atendimento salvar(
            @RequestBody Atendimento atendimento) {

        atendimentos.add(atendimento);

        return atendimento;
    }

    @GetMapping
    public List<Atendimento> listarTodos() {

        return atendimentos;
    }

    @DeleteMapping("/{id}")
    public String remover(
            @PathVariable Long id) {

        atendimentos.removeIf(
                a -> a.getId().equals(id));

        return "Atendimento removido!";
    }
}
