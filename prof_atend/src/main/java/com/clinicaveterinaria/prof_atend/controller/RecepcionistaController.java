package com.clinicaveterinaria.prof_atend.controller;

import com.clinicaveterinaria.prof_atend.model.Recepcionista;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/recepcionistas")
public class RecepcionistaController {

    private List<Recepcionista> recepcionistas =
            new ArrayList<>();

    @PostMapping
    public Recepcionista salvar(
            @RequestBody Recepcionista recepcionista) {

        recepcionistas.add(recepcionista);

        return recepcionista;
    }

    @GetMapping
    public List<Recepcionista> listarTodos() {

        return recepcionistas;
    }

    @DeleteMapping("/{id}")
    public String remover(
            @PathVariable Long id) {

        recepcionistas.removeIf(
                r -> r.getId().equals(id));

        return "Recepcionista removido!";
    }
}