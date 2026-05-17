/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.controller;
import br.com.ifba.curso.entity.Curso;
import br.com.ifba.service.CursoService;
import java.util.List;
/**
 *
 * @author inaci
 */
public class CursoController {

    private CursoService service;

    public void salvar(Curso curso) {
        service.salvar(curso);
    }

    public void atualizar(Curso curso) {
        service.atualizar(curso);
    }

    public void deletar(Long id) {
        service.deletar(id);
    }

    public List<Curso> listarTodos() {
        return service.listarTodos();
    }
}