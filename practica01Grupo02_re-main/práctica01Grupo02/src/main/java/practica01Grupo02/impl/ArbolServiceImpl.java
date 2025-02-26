package practica01Grupo02.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import practica01Grupo02.dao.ArbolDao;
import practica01Grupo02.domain.Arbol;
import practica01Grupo02.service.ArbolService;

import java.util.List;

@Service
public class ArbolServiceImpl implements ArbolService {

    @Autowired
    private ArbolDao arbolDao;

    @Override
    @Transactional(readOnly = true)
    public List<Arbol> getArboles(boolean activos) {
        var lista = arbolDao.findAll();
        if (activos) {
            lista.removeIf(e -> !e.isActivo());
        }
        return lista;
    }

    @Override
    @Transactional(readOnly = true)
    public Arbol getArbol(Long id) {
        return arbolDao.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public void save(Arbol arbol) {
        arbolDao.save(arbol);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        arbolDao.deleteAll();
    }
}