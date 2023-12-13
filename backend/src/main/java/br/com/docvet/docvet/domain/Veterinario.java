package br.com.docvet.docvet.domain;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import br.com.docvet.docvet.domain.enumerador.Porte;
import jakarta.persistence.CascadeType;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

import jakarta.persistence.OneToMany;

import jakarta.persistence.Table;

@Entity
@Table(name = "tb_veterinario")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Veterinario extends Pessoa{

    private String crmv;

    @OneToMany(mappedBy = "veterinario", fetch = FetchType.LAZY, cascade = {CascadeType.DETACH})
    private Set<EndAtendimento> endAtendimentos;

    @ManyToMany(mappedBy = "veterinarios", cascade = {CascadeType.MERGE})
    private Set<Especialidade> especialidades;

    @ElementCollection
    private Set<Porte> portes;

    @ManyToMany
    @JoinTable(name = "tb_veterinario_tipoPet", joinColumns = @JoinColumn(name = "veterinario_id"), inverseJoinColumns = @JoinColumn(name = "tipo_animal_id"))
    private Set<TipoAnimal> tipoPetsAtendido;

    private String descricao;

    Veterinario(){}

    Veterinario(String nome, String cpf, String email, String foto, String crmv, Set<Especialidade> especialidades, Set<Porte> portes, Set<TipoAnimal> tipoPetsAtendido, String descricao){
        this.setNome(nome);
        this.setCpf(cpf);
        this.setEmail(email);
        this.setFoto(foto);
        this.crmv = crmv;
        this.especialidades = especialidades;
        this.tipoPetsAtendido = tipoPetsAtendido;
        this.descricao = descricao;
    }

    public String getCrmv() {
        return crmv;
    }

    public void setCrmv(String crmv) {
        this.crmv = crmv;
    }

    public Set<Especialidade> getEspecialidades() {
        return especialidades;
    }

    public void setEspecialidades(Set<Especialidade> especialidades) {
        this.especialidades = especialidades;
    }

    public void setPortes(Set<Porte> portes){
        this.portes = portes;
    }

    public Set<Porte> getPortes(){
        return this.portes;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao(){
        return descricao;
    }

    public Set<EndAtendimento> getEnderecos(){
        return this.endAtendimentos;
    }

    public void setEnderecos(Set<EndAtendimento> enderecos){
        this.endAtendimentos = enderecos;
    }

}