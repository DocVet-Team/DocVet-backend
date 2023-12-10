package br.com.docvet.docvet.domain;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "tb_donoDoPet")
public class DonoDoPet extends Pessoa{

    @OneToMany(mappedBy = "donoDoPet", fetch = FetchType.LAZY, cascade = {CascadeType.DETACH})
    private Set<Pet> pets;

    DonoDoPet(String nome, String cpf, String email, String foto){
        this.setNome(nome);
        this.setCpf(cpf);
        this.setEmail(email);
        this.setFoto(foto);
    }

    DonoDoPet(){};
}
