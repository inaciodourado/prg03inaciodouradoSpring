package br.com.ifba.atividade14.curso.service;

import br.com.ifba.atividade14.curso.entity.Curso;
import java.util.List;

public interface CursoIService {

    Curso salvar(Curso curso);

    Curso atualizar(Curso curso);

    void deletar(Long id);

    Curso buscarPorId(Long id);

    List<Curso> listarTodos();
}