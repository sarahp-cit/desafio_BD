package com.totalshakes.wstotalshakes.controller;

import com.totalshakes.wstotalshakes.model.Ingrediente;
import com.totalshakes.wstotalshakes.service.interfaces.IIngredienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/ingrediente")
public class IngredienteController {
    @Autowired
    private IIngredienteService service;

    @PostMapping
    public Ingrediente salvarIngrediente(@RequestBody Ingrediente ingrediente){
        return service.salvarIngrediente(ingrediente);
    }
    @PutMapping
    public void editarIngrediente(@RequestBody Ingrediente ingrediente){
        service.editarIngrediente(ingrediente);
    }
    @GetMapping("/{id}")
    public Ingrediente buscarIngrediente(@PathVariable Integer id){
        return service.buscarIngrediente(id);
    }
    @DeleteMapping("/{id}")
    public void excluirIngrediente(@PathVariable Integer id){
        service.excluirIngrediente(id);
    }
}
