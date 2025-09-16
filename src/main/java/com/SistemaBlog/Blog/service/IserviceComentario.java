package com.SistemaBlog.Blog.service;

import com.SistemaBlog.Blog.model.Comentario;

import java.util.List;
import java.util.Optional;

public interface IserviceComentario {
    List<Comentario> obtenerComentarios();
    Optional<Comentario> obtenerComentarioPorId(Long id);
    void guardarComentario(Comentario comentario);
    void eliminarComentario(Long id);
    void actualizarComentario(Long id, Comentario comentarioActualizado);

}
