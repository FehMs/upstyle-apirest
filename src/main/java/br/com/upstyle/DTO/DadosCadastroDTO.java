package br.com.upstyle.DTO;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record DadosCadastroDTO(
        @NotBlank
        String usuario,
        @NotBlank
        String senha,
        @NotBlank
        @Pattern(regexp = "\\d{14}")
        String cnpj,
        @NotBlank
        String empresa,
        @NotBlank
        String contato) {
}

;