package com.totalshakes.wstotalshakes.repository;

import com.totalshakes.wstotalshakes.model.Ingrediente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface IngredienteRepository extends CrudRepository<Ingrediente, Integer> {
}
