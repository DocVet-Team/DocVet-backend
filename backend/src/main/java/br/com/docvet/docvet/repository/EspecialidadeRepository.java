package br.com.docvet.docvet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.docvet.docvet.domain.Especialidade;

public interface EspecialidadeRepository extends JpaRepository<Especialidade, Integer>{
    
}
