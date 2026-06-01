package com.clinicaveterinaria.prof_atend.controller;
import com.clinicaveterinaria.prof_atend.model.Veterinario;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/veterinarios")
public class VeterinarioController {

    private List<Veterinario> veterinarios =
            new ArrayList<>();

    @PostMapping
    public Veterinario salvar(
            @RequestBody Veterinario veterinario) {

        veterinarios.add(veterinario);

        return veterinario;
    }

    @GetMapping
    public List<Veterinario> listarTodos() {

        return veterinarios;
    }

    @DeleteMapping("/{id}")
    public String remover(
            @PathVariable Long id) {

        veterinarios.removeIf(
                v -> v.getId().equals(id));

        return "Veterinário removido!";
    }
}
