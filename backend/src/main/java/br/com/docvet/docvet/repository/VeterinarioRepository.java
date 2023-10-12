package br.com.docvet.docvet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.docvet.docvet.domain.Veterinario;

public interface VeterinarioRepository extends JpaRepository<Veterinario, Integer>{
    
}
