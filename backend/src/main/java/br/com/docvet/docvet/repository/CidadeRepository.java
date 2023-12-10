package br.com.docvet.docvet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.docvet.docvet.domain.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, Integer>{
}
