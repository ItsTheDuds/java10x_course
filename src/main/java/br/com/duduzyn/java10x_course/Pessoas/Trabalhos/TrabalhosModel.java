package br.com.duduzyn.java10x_course.Pessoas.Trabalhos;

import br.com.duduzyn.java10x_course.Pessoas.Controller.PessoaModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_trabalhos")
public class TrabalhosModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String tipoDeTrabalho;
    private String dificuldade;
    //Um trabalho pode ter varias pessoas.
    @OneToMany(mappedBy = "trabalho")
    private List<PessoaModel> pessoas;

    public TrabalhosModel() {
    }

    public TrabalhosModel(String tipoDeTrabalho, String dificuldade) {
        this.tipoDeTrabalho = tipoDeTrabalho;
        this.dificuldade = dificuldade;
    }

    public String getTipoDeTrabalho() {
        return tipoDeTrabalho;
    }

    public String getDificuldade() {
        return dificuldade;
    }

    public void setTipoDeTrabalho(String tipoDeTrabalho) {
        this.tipoDeTrabalho = tipoDeTrabalho;
    }

    public void setDificuldade(String dificuldade) {
        this.dificuldade = dificuldade;
    }
}
