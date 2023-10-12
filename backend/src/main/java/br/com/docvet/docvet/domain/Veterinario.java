package br.com.docvet.docvet.domain;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tb_veterinario")
public class Veterinario extends PessoaFisica{

    @Setter @Getter
    private String foto;

    @Setter @Getter
    private String crmv;

    Veterinario(){
        
    }

    Veterinario(String nome, String cpf, String endereco, String email, String telefone, String foto){
        this.setNome(nome);
        this.setCpf(cpf);
        this.setEndereco(endereco);
        this.setEmail(email);
        this.setTelefone(telefone);
        this.setFoto(foto);
    }

    // @Setter @Getter
    // private List<String> especialidades;

    // @Setter @Getter
    // private List<String> tiposAnimal;

    // @Setter @Getter
    // private List<String> portes;

}
