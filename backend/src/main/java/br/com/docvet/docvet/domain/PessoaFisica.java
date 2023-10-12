package br.com.docvet.docvet.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.Getter;
import lombok.Setter;

// @Entity
@MappedSuperclass
// @Inheritance(strategy = InheritanceType.JOINED)
// @Table(uniqueConstraints = @UniqueConstraint(columnNames = "cpf"), name = "tb_pessoaF")
public class PessoaFisica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter @Getter
    private Integer id;

    @Setter @Getter
    private String nome;

    @Setter @Getter
    private String cpf;

    @Setter @Getter
    private String endereco;

    @Setter @Getter
    private String email;

    @Setter @Getter
    private String telefone;

    @Setter @Getter
    private String foto;
}