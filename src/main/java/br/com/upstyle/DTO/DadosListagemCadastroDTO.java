package br.com.upstyle.DTO;

import br.com.upstyle.model.Cadastro;

public record DadosListagemCadastroDTO(Long id, String usuario, String cnpj, String password) {

    public DadosListagemCadastroDTO (Cadastro cadastro){
        this(cadastro.getId(), cadastro.getUsuario(), cadastro.getCnpj(), cadastro.getPassword());
    }

}
