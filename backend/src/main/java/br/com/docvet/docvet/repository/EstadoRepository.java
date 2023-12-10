package br.com.docvet.docvet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.docvet.docvet.domain.Estado;

public interface EstadoRepository extends JpaRepository<Estado, Integer>{
}
