package com.SistemaBlog.Blog.service;

import com.SistemaBlog.Blog.model.Posteo;

import java.util.List;

public interface IservicePosteo {
    List<Posteo> obtenerPosteos();
    Posteo obtenerPosteoPorId(Long id);
    void guardarPosteo(Posteo posteo);

}
