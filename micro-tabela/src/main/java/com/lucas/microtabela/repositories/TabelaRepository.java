package com.lucas.microtabela.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucas.microtabela.model.Tabela;

public interface TabelaRepository extends JpaRepository<Tabela, Long> {

}
