package co.edu.uceva.demo_2024_2.modelo.service;

import co.edu.uceva.demo_2024_2.modelo.entities.Celular;

import java.util.List;

public interface ICelularService {
    List<Celular> listar();

    void delete(Celular celular);

    Celular save(Celular celular);

    Celular findById(Long id);

    Celular update(Celular celular);
}
