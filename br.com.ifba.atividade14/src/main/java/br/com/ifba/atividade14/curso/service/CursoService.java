package br.com.ifba.atividade14.curso.service;

import br.com.ifba.atividade14.curso.entity.Curso;
import br.com.ifba.atividade14.curso.repository.CursoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CursoService implements CursoIService {
    
    //Inserção de dependencias
    @Autowired
    private CursoRepository repository;

    @Override
    public Curso salvar(Curso curso) {

        if(curso.getNome() == null || curso.getNome().trim().isEmpty()){
            throw new RuntimeException("Nome obrigatório.");
        }

        return repository.save(curso);
    }

    @Override
    public Curso atualizar(Curso curso) {
        return repository.save(curso);
    }

    @Override
    public void deletar(Long id) {
        repository.deleteById(id);
    }

    @Override
    public Curso buscarPorId(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<Curso> listarTodos() {
        return repository.findAll();
    }
}