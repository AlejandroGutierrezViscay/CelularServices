package co.edu.uceva.celularservicesaplication.model.service;

import co.edu.uceva.celularservicesaplication.model.entities.Celular;
import java.util.List;

public interface ICelularService {

    List<Celular> listarCelular();
    void delete(Celular celular);   /*elimina celular de la base de datos*/
    Celular save(Celular celular);  /*guarda celular y lo retorna*/
    Celular findById(int id);       /*busca celular por id*/
    Celular update(Celular celular);/*actualiza celular*/
}
