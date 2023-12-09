package br.com.docvet.docvet.domain;

import br.com.docvet.docvet.domain.enumerador.Porte;
import br.com.docvet.docvet.domain.enumerador.Sexo;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Pet {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String nome;
    private String raca;
    private Sexo sexo;
    private Porte porte;
    private boolean castrado;
    private Double peso;
    public boolean isCastrado() {
        return castrado;
    }
    public void setCastrado(boolean castrado) {
        this.castrado = castrado;
    }
    public DonoDoPet getDonoDoPet() {
        return donoDoPet;
    }
    public void setDonoDoPet(DonoDoPet donoDoPet) {
        this.donoDoPet = donoDoPet;
    }
    public TipoAnimal getTipoAnimal() {
        return tipoAnimal;
    }
    public void setTipoAnimal(TipoAnimal tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }
    private double tamanho;
    private int idade;
    private String foto;

    @ManyToOne(optional = true)
    @JoinColumn(name = "donoDoPet_id", referencedColumnName = "id", nullable = true)
    private DonoDoPet donoDoPet;

    @ManyToOne(optional = true)
    @JoinColumn(name = "TipoAnimal_id", referencedColumnName = "id", nullable = true)
    private TipoAnimal tipoAnimal;


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
    public String getRaca() {
        return raca;
    }
    public void setRaca(String raca) {
        this.raca = raca;
    }
    public Sexo getSexo() {
        return sexo;
    }
    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }
    public Porte getPorte() {
        return porte;
    }
    public void setPorte(Porte porte) {
        this.porte = porte;
    }

    public Double getPeso() {
        return peso;
    }
    public void setPeso(Double peso) {
        this.peso = peso;
    }
    public double getTamanho() {
        return tamanho;
    }
    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getFoto() {
        return foto;
    }
    public void setFoto(String foto) {
        this.foto = foto;
    }
    
    
}
