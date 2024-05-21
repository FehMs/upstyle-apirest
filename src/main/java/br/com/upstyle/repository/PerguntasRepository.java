package br.com.upstyle.repository;

import br.com.upstyle.model.Perguntas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PerguntasRepository extends JpaRepository<Perguntas, Long> {
}
