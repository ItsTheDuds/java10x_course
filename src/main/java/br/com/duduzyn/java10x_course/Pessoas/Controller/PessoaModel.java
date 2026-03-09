package br.com.duduzyn.java10x_course.Pessoas.Controller;
import br.com.duduzyn.java10x_course.Pessoas.Trabalhos.TrabalhosModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_cadastro")
public class PessoaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int idade;
    private String nome;
    private String email;
    //Muitos para um, ou seja, muitas pessoas podem ajudar no trabalho,
    //porem uma pessoa pode fazer so um trabalho!
    @ManyToOne()
    @JoinColumn(name = "trabalhos_id") //Foreing Key ou Chave Estrangeira
    private TrabalhosModel trabalho;

    public PessoaModel() {
    }

    public PessoaModel(int idade, String nome, String email) {
        this.idade = idade;
        this.nome = nome;
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }
}
