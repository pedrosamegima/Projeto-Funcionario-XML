package com.gerenciamentoFuncionario.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gerenciamentoFuncionario.entities.Funcionario;

public interface FuncionarioRepository extends JpaRepository <Funcionario, Long> {

}
