package com.SistemaBlog.Blog.service;

import com.SistemaBlog.Blog.model.Autor;

import java.util.List;
import java.util.Optional;

public interface IserviceAutor {
    List<Autor> obtenerAutores();
    Optional<Autor> obtenerAutorPorId(Long id);
    void guardarAutor(Autor autor);
    void eliminarAutor(Long id);
    void actualizarAutor(Long id, Autor autorActualizado);

}
