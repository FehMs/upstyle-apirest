package br.com.upstyle.controller;

import br.com.upstyle.DTO.DadosAtualizacaoDTO;
import br.com.upstyle.DTO.DadosCadastroDTO;
import br.com.upstyle.DTO.DadosListagemCadastroDTO;
import br.com.upstyle.model.Cadastro;
import br.com.upstyle.repository.CadastroRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cadastro")
public class CadastroController {

    @Autowired
    private CadastroRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastroDTO dados){
        repository.save(new Cadastro(dados));
    }

    @GetMapping
    public Page<DadosListagemCadastroDTO> listar(@PageableDefault(size = 10, sort = {"usuario"}) Pageable paginacao){
        return repository.findAll(paginacao).map(DadosListagemCadastroDTO::new);
    }

    @PutMapping
    @Transactional
    public void atualizar(@RequestBody @Valid DadosAtualizacaoDTO dados){
        var cadastro = repository.getReferenceById(dados.id());
        cadastro.atualizarInformacoes(dados);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public void excluir(@PathVariable Long id){
        repository.deleteById(id);
    }
}
