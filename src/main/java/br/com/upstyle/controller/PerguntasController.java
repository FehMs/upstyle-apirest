package br.com.upstyle.controller;


import br.com.upstyle.DTO.DadosPerguntasDTO;
import br.com.upstyle.model.Perguntas;
import br.com.upstyle.repository.PerguntasRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/perguntas")
public class PerguntasController {

    @Autowired
    private PerguntasRepository repository;

    @PostMapping
    @Transactional
    public void pergunta(@RequestBody DadosPerguntasDTO dados){
        repository.save(new Perguntas(dados));
    }



}
