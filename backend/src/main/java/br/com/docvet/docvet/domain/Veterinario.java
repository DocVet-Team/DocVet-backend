package br.com.docvet.docvet.domain;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_veterinario")
public class Veterinario extends Pessoa{

    private String crmv;

    // private List<Especialidade> especialidades;

    @OneToMany(mappedBy = "veterinario", fetch = FetchType.LAZY, cascade = {CascadeType.DETACH})
    private Set<EndAtendimento> endAtendimentos; 


    Veterinario(){}

    Veterinario(String nome, String cpf, String email, String foto, String crmv){
        this.setNome(nome);
        this.setCpf(cpf);
        this.setEmail(email);
        this.setFoto(foto);
        this.crmv = crmv;
    }

    public String getCrmv() {
        return crmv;
    }

    public void setCrmv(String crmv) {
        this.crmv = crmv;
    }



}