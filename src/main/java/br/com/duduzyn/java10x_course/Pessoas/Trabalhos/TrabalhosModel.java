package br.com.duduzyn.java10x_course.Pessoas.Trabalhos;
import br.com.duduzyn.java10x_course.Pessoas.Controller.PessoaModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Entity
@Table(name = "tb_trabalhos")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class TrabalhosModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String tipoDeTrabalho;
    private String dificuldade;
    //Um trabalho pode ter varias pessoas.
    @OneToMany(mappedBy = "trabalho")
    private List<PessoaModel> pessoas;

    public TrabalhosModel(String tipoDeTrabalho, String dificuldade) {
        this.tipoDeTrabalho = tipoDeTrabalho;
        this.dificuldade = dificuldade;
    }
}
