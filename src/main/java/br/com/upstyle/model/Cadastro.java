package br.com.upstyle.model;
import br.com.upstyle.DTO.DadosAtualizacaoDTO;
import br.com.upstyle.DTO.DadosCadastroDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Table(name = "cadastrados")
@Entity(name = "Cadastro")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Cadastro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String usuario;
    private String senha;
    private String cnpj;
    private String empresa;
    private String contato;


    public Cadastro(DadosCadastroDTO dados) {
        this.usuario = dados.usuario();
        this.senha = dados.senha();
        this.cnpj = dados.cnpj();
        this.empresa = dados.empresa();
        this.contato = dados.contato();
    }

    public void atualizarInformacoes(DadosAtualizacaoDTO dados) {
        if (dados.usuario() != null){
            this.usuario = dados.usuario();
        }
        if (dados.cnpj() != null){
            this.cnpj = dados.cnpj();
        }
        if (dados.senha() != null){
            this.senha = dados.senha();
        }
    }
}
