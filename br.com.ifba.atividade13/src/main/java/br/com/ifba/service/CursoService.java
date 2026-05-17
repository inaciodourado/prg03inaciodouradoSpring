/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.service;

import br.com.ifba.curso.dao.CursoDAO;
import br.com.ifba.curso.entity.Curso;
import br.com.ifba.GenericlDao.StringUtil;
import java.util.List;

/**
 *
 * @author inaci
 */
public class CursoService implements CursoIService {

    private CursoDAO cursoDao;

    @Override
    public void salvar(Curso curso) {

        if (StringUtil.isNullOrEmpty(curso.getNome())) {
            throw new RuntimeException("Nome obrigatório.");
        }

        cursoDao.salvar(curso);
    }

    @Override
    public void atualizar(Curso curso) {

        if (StringUtil.isNullOrEmpty(curso.getNome())) {
            throw new RuntimeException("Nome obrigatório.");
        }

        cursoDao.atualizar(curso);
    }

    @Override
    public void deletar(Long id) {
        cursoDao.deletar(id);
    }

    @Override
    public List<Curso> listarTodos() {
        return cursoDao.listarTodos();
    }
}