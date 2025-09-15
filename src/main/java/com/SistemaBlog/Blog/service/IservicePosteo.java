package com.SistemaBlog.Blog.service;

import com.SistemaBlog.Blog.model.Posteo;

import java.util.List;
import java.util.Optional;

public interface IservicePosteo {
    List<Posteo> obtenerPosteos();
    Optional<Posteo> obtenerPosteoPorId(Long id);
    void guardarPosteo(Posteo posteo);
    void eliminarPosteo(Long id);
    void actualizarPosteo(Posteo posteo);

}
