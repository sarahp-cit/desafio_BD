package com.totalshakes.wstotalshakes.service;

import com.totalshakes.wstotalshakes.model.Ingrediente;
import com.totalshakes.wstotalshakes.repository.IngredienteRepository;
import com.totalshakes.wstotalshakes.service.interfaces.IIngredienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IngredienteService implements IIngredienteService {
    @Autowired
    private IngredienteRepository repository;

    @Override
    public Ingrediente salvarIngrediente (Ingrediente ingrediente){
        return repository.save(ingrediente);
    }
    @Override
    public void editarIngrediente (Ingrediente ingrediente){
        repository.save(ingrediente);
    }
    @Override
    public Ingrediente buscarIngrediente (Integer id){
        if(repository.findById(id).isPresent()) {
            return repository.findById(id).get();
        }
        return null;
    }
    @Override
    public void excluirIngrediente (Integer id){
        repository.deleteById(id);
    }
}
