package com.totalshakes.wstotalshakes.service;

import com.totalshakes.wstotalshakes.model.Adicional;
import com.totalshakes.wstotalshakes.model.Ingrediente;
import com.totalshakes.wstotalshakes.repository.AdicionalRepository;
import com.totalshakes.wstotalshakes.service.interfaces.IAdicionalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdicionalService implements IAdicionalService {
    @Autowired
    private AdicionalRepository repository;

    @Override
    public Adicional salvarAdicional (Adicional adicional){
        return repository.save(adicional);
    }
    @Override
    public void editarAdicional (Adicional adicional){
        repository.save(adicional);
    }
    @Override
    public Adicional buscarAdicional (Integer id){
        if(repository.findById(id).isPresent()) {
            return repository.findById(id).get();
        }
        return null;
    }
    @Override
    public void excluirAdicional (Integer id){
        repository.deleteById(id);
    }
}
