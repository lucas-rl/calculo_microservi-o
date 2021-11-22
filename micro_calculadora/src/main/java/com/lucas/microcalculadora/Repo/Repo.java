package com.lucas.microcalculadora.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucas.microcalculadora.model.Calculadora;
import com.lucas.microcalculadora.model.Tabela;

public interface Repo extends JpaRepository<Calculadora, Long>{

}
