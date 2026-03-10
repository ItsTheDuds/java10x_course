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
    @Column(name = "ID")
    private Long id;

    @Column(name = "idade")
    private int idade;

    @Column(name = "nome")
    private String nome;


    @Column(unique = true, name = "email")
    private String email;

    @Column(unique = true, name = "cpf")
    private String cpf;


    //Muitos para um, ou seja, muitas pessoas podem ajudar no trabalho,
    //porem uma pessoa pode fazer so um trabalho!
    @ManyToOne()
    @JoinColumn(name = "trabalhos_id") //Foreing Key ou Chave Estrangeira
    private TrabalhosModel trabalho;

}
