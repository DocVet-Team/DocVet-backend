package br.com.docvet.docvet.domain;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_tipo_animal")
public class TipoAnimal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;

    @OneToMany(mappedBy = "tipoAnimal", fetch = FetchType.LAZY, cascade = {CascadeType.DETACH})
    private Set<Pet> pets;

    @ManyToMany(mappedBy = "tipoPetsAtendido")
    private Set<Veterinario> veterinarios;

    TipoAnimal(){}

    TipoAnimal(Integer id, String nome){
        this.id = id;
        this.nome = nome;
    }

    public TipoAnimal(Integer id, String nome, Set<Pet> pets, Set<Veterinario> veterinarios) {
        this.id = id;
        this.nome = nome;
        this.pets = pets;
        this.veterinarios = veterinarios;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Pet> getPets() {
        return pets;
    }

    public void setPets(Set<Pet> pets) {
        this.pets = pets;
    }

    public Set<Veterinario> getVeterinarios() {
        return veterinarios;
    }

    public void setVeterinarios(Set<Veterinario> veterinarios) {
        this.veterinarios = veterinarios;
    }

    



}
