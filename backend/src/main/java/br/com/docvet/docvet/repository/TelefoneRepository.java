package br.com.docvet.docvet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.docvet.docvet.domain.Telefone;

public interface TelefoneRepository extends JpaRepository<Telefone, Integer>{
    
}
