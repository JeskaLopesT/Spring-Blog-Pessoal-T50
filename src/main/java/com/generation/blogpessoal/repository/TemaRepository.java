package com.generation.blogpessoal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.blogpessoal.model.Tema;

@Repository
public interface TemaRepository extends JpaRepository<Tema, Long> {

}
