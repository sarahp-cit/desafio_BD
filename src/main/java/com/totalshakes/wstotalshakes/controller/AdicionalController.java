package com.totalshakes.wstotalshakes.controller;

import com.totalshakes.wstotalshakes.model.Adicional;
import com.totalshakes.wstotalshakes.model.Ingrediente;
import com.totalshakes.wstotalshakes.service.interfaces.IAdicionalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/adicional")
public class AdicionalController {
    @Autowired
    private IAdicionalService service;

    @PostMapping
    public Adicional salvarAdicional(@RequestBody Adicional adicional){
        return service.salvarAdicional(adicional);
    }
    @PutMapping
    public void editarAdicional(@RequestBody Adicional adicional){
        service.editarAdicional(adicional);
    }
    @GetMapping("/{id}")
    public Adicional buscarAdicional(@PathVariable Integer id){
        return service.buscarAdicional(id);
    }
    @DeleteMapping("/{id}")
    public void excluirAdicional(@PathVariable Integer id){
        service.excluirAdicional(id);
    }
}
