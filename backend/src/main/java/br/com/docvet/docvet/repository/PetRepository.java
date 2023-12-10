package br.com.docvet.docvet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.docvet.docvet.domain.Pet;

public interface PetRepository extends JpaRepository<Pet, Integer>{
}
