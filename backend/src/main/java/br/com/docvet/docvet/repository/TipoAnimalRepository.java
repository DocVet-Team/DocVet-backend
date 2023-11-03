package br.com.docvet.docvet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.docvet.docvet.domain.TipoAnimal;

public interface TipoAnimalRepository extends JpaRepository<TipoAnimal, Integer>{
    
}
