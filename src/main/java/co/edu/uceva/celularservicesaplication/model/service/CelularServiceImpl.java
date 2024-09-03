package co.edu.uceva.celularservicesaplication.model.service;

import co.edu.uceva.celularservicesaplication.model.dao.CelularDao;
import co.edu.uceva.celularservicesaplication.model.entities.Celular;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CelularServiceImpl implements ICelularService {

    @Autowired
    CelularDao celularDao;

    /*Listar celular*/
    @Override
    public List<Celular> listarCelular(){return(list<Celular>) celularDao.findAll();}

    /*eliminar celular*/
    public void delete(Celular celular){celularDao.delete(celular);}

    /*guardar celular*/
    @Override
    public Celular save(Celular celular) {return celularDao.save(celular);}

    /*buscar celular*/
    @Override
    public Celular findById(Long id) {return celularDao.findById(id).orElse(null);}

    /*actualizar celular*/
    @Override
    public Celular update(Celular celular) {return celularDao.save(celular)}
}
