package br.com.ifba.atividade14.curso.controller;

import br.com.ifba.atividade14.curso.entity.Curso;
import br.com.ifba.atividade14.curso.service.CursoIService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cursos")
public class CursoController {

    @Autowired
    private CursoIService service;

    @PostMapping
    public Curso salvar(@RequestBody Curso curso) {
        return service.salvar(curso);
    }

    @PutMapping
    public Curso atualizar(@RequestBody Curso curso) {
        return service.atualizar(curso);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }

    @GetMapping("/{id}")
    public Curso buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @GetMapping
    public List<Curso> listarTodos() {
        return service.listarTodos();
    }
}