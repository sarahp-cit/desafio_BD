package com.totalshakes.wstotalshakes.service.interfaces;

import com.totalshakes.wstotalshakes.model.Ingrediente;

public interface IIngredienteService {
    Ingrediente salvarIngrediente (Ingrediente ingrediente);
    void editarIngrediente (Ingrediente ingrediente);
    Ingrediente buscarIngrediente (Integer id);
    void excluirIngrediente (Integer id);
}
