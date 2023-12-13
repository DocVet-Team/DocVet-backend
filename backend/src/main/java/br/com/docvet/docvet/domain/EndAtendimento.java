package br.com.docvet.docvet.domain;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name = "tb_atendimento")
public class EndAtendimento {

    @OneToOne(cascade = {CascadeType.DETACH})
    @JoinColumn(name = "cidade_id")
    @Getter@Setter
    private Cidade cidade;

    @ManyToOne
    @JoinColumn(name = "veterinario_id", referencedColumnName = "id", nullable = true)
    @Getter@Setter
    private Veterinario veterinario;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter@Setter
    private Integer id;
    @Getter@Setter
    private String clinica;
    @Getter@Setter
    private String logradouro;
    @Getter@Setter
    private String numero;
    @Getter@Setter
    private String complemento;
    @Getter@Setter
    private String bairro;
    @Getter@Setter
    private String cep;




}
