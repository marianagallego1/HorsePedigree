package com.udea.horsePedigree.repository;

import com.udea.horsePedigree.entity.Equino_Campeonato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Equino_CampeonatoRepository extends JpaRepository<Equino_Campeonato,Integer> {
}
