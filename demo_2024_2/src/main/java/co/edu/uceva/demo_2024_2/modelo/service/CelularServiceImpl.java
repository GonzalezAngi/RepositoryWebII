package co.edu.uceva.demo_2024_2.modelo.service;

import co.edu.uceva.demo_2024_2.modelo.dao.CelularDao;
import co.edu.uceva.demo_2024_2.modelo.entities.Celular;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CelularServiceImpl implements ICelularService {
    @Autowired
    CelularDao celularDao;

    @Override
    public List<Celular> listar() {
        return (List<Celular>) celularDao.findAll();
    }

    @Override
    public void delete(Celular celular) {
        celularDao.delete(celular);
    }

    @Override
    public Celular save(Celular celular) {
        return celularDao.save(celular);
    }

    @Override
    public Celular findById(Long id){
        return celularDao.findById(id).orElse(null);
    }

    @Override
    public Celular update(Celular celular) {
        return celularDao.save(celular);
    }
}
