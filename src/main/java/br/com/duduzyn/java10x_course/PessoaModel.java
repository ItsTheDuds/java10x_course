package br.com.duduzyn.java10x_course;
import jakarta.persistence.*;
import org.hibernate.annotations.processing.SQL;

@Entity
@Table(name = "tb_cadastro")
public class PessoaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    private int idade;
    private String nome;
    private String email;


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
