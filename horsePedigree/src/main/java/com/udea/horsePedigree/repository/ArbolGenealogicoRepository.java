package com.udea.horsePedigree.repository;

import com.udea.horsePedigree.entity.ArbolGenealogico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArbolGenealogicoRepository extends JpaRepository<ArbolGenealogico,Integer> {
}
