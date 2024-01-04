package com.beltsys.demo.repositories;


import com.beltsys.demo.entities.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
    // Métodos adicionais se necessário
}