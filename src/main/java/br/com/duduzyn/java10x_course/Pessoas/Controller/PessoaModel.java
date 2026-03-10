package br.com.duduzyn.java10x_course.Pessoas.Controller;
import br.com.duduzyn.java10x_course.Pessoas.Trabalhos.TrabalhosModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_cadastro")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class PessoaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int idade;
    private String nome;
    @Column(unique = true)
    private String email;
    @Column(unique = true)
    private String cpf;
    //Muitos para um, ou seja, muitas pessoas podem ajudar no trabalho,
    //porem uma pessoa pode fazer so um trabalho!
    @ManyToOne()
    @JoinColumn(name = "trabalhos_id") //Foreing Key ou Chave Estrangeira
    private TrabalhosModel trabalho;

}
