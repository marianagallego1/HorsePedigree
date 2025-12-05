package com.udea.horsePedigree.repository;

import com.udea.horsePedigree.entity.Equino;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EquinoRepository extends JpaRepository<Equino, Integer> {
}
