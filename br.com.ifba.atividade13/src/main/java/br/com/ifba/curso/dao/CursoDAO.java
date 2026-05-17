package br.com.ifba.curso.dao;

import br.com.ifba.GenericDao.GenericDao;
import br.com.ifba.curso.entity.Curso;
import org.springframework.stereotype.Repository;

/**
 *
 * @author inaci
 */

@Repository
public class CursoDAO extends GenericDao<Curso> implements CursoIDao {

    public CursoDAO() {
        super(Curso.class);
    }
}