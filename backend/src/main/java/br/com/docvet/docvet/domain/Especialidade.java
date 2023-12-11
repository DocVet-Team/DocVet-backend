package br.com.docvet.docvet.domain;

import java.util.List;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_especialidade")
public class Especialidade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String especialidade;


    @ManyToMany(cascade = {CascadeType.MERGE})
    @JoinTable(name = "tb_vet_esp", joinColumns = @JoinColumn(name = "vet_id"), inverseJoinColumns = @JoinColumn(name = "esp_id"))
    private Set<Veterinario> veterinarios;


    // private Set<Veterinario> veterinarios;


    public Especialidade() {}

    public Especialidade(Integer id, String especialidade, Set<Veterinario> veterinarios) {
        this.id = id;
        this.especialidade = especialidade;
        this.veterinarios = veterinarios;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Set<Veterinario> getVeterinarios() {
        return veterinarios;
    }

    public void setVeterinarios(Set<Veterinario> veterinarios) {
        this.veterinarios = veterinarios;
    }
}
