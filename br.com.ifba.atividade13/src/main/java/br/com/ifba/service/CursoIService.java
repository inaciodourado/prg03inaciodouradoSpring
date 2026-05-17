/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.service;
import br.com.ifba.curso.entity.Curso;
import java.util.List;
/**
 *
 * @author inaci
 */
public interface CursoIService {

    void salvar(Curso curso);

    void atualizar(Curso curso);

    void deletar(Long id);

    List<Curso> listarTodos();
}