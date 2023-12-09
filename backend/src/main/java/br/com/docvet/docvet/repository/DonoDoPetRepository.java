package br.com.docvet.docvet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.docvet.docvet.domain.DonoDoPet;

public interface DonoDoPetRepository extends JpaRepository<DonoDoPet, Integer>{
}
