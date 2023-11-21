package br.com.docvet.docvet.domain;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name = "tb_atendimento")
public class EndAtendimento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter@Setter
    private Integer id;
    @Getter@Setter
    private String clinica;
    @Getter@Setter
    private String logadouro;
    @Getter@Setter
    private String numero;
    @Getter@Setter
    private String complemento;
    @Getter@Setter
    private String bairro;
    @Getter@Setter
    private String cep;

//  private List<String> cidade;

}
