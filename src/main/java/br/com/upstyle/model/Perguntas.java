package br.com.upstyle.model;
import br.com.upstyle.DTO.DadosPerguntasDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "perguntas")
@Entity(name = "Perguntas")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Perguntas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String produtos;
    private String meta;
    private String canais;
    private String desafio;
    private String estilo;
    private String meses;
    private String estrategias;

    public Perguntas(DadosPerguntasDTO dados){
        this.produtos = dados.produtos();
        this.meta = dados.meta();
        this.canais = dados.canais();
        this.desafio = dados.desafio();
        this.estilo = dados.estilo();
        this.meses = dados.meses();
        this.estrategias = dados.estrategias();
    }


}
