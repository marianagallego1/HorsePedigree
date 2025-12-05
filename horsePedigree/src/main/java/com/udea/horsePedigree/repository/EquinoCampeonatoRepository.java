package com.udea.horsePedigree.repository;

import com.udea.horsePedigree.entity.EquinoCampeonato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EquinoCampeonatoRepository extends JpaRepository<EquinoCampeonato, Integer> {
}
