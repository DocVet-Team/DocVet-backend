package br.com.docvet.docvet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.docvet.docvet.domain.Veterinario;
import java.util.List;


public interface VeterinarioRepository extends JpaRepository<Veterinario, Integer>{

    List<Veterinario> findByNome(String nome);
    List<Veterinario> findByCrmv(String crmv);

}
