package br.com.upstyle.DTO;

import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoDTO(
        @NotNull Long id,
        String usuario,
        String cnpj,
        String senha ) {
}
