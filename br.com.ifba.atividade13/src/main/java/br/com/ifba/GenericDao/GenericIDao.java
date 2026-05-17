/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.GenericDao;
import java.util.List;
/**
 *
 * @author inaci
 */

public interface GenericIDao<T> {

    void salvar(T entity);

    void atualizar(T entity);

    void deletar(Long id);

    T buscarPorId(Long id);

    List<T> listarTodos();
}