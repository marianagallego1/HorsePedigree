package com.udea.horsePedigree.repository;

import com.udea.horsePedigree.entity.Campeonato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CampeonatoRepository extends JpaRepository<Campeonato,Integer> {
}
