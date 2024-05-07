package br.com.upstyle.DTO;

import br.com.upstyle.model.Cadastro;

public record DadosListagemCadastroDTO(Long id, String usuario, String cnpj, String senha) {

    public DadosListagemCadastroDTO (Cadastro cadastro){
        this(cadastro.getId(), cadastro.getUsuario(), cadastro.getCnpj(), cadastro.getSenha());
    }

}
