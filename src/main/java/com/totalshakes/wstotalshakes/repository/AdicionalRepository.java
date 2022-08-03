package com.totalshakes.wstotalshakes.repository;

import com.totalshakes.wstotalshakes.model.Adicional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdicionalRepository extends CrudRepository<Adicional, Integer> {
}
