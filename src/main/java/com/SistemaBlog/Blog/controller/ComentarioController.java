package com.SistemaBlog.Blog.controller;

import com.SistemaBlog.Blog.model.Comentario;
import com.SistemaBlog.Blog.service.IserviceComentario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class ComentarioController {

    private IserviceComentario serviceComentario;

    @Autowired
    public ComentarioController(IserviceComentario serviceComentario) {
        this.serviceComentario = serviceComentario;
    }

    @GetMapping("/comentarios")
    public List<Comentario> getAllComentarios() {
        return serviceComentario.obtenerComentarios();
    }

    @GetMapping("/comentarios/{id}")
    public Optional<Comentario> getComentarioById(@PathVariable Long id) {
        return serviceComentario.obtenerComentarioPorId(id);
    }

    @PostMapping("/comentarios/crear")
    public void createComentario(Comentario comentario) {
        serviceComentario.guardarComentario(comentario);
    }

    @PostMapping("/comentarios/editar")
    public void updateComentario(Comentario comentario) {
        serviceComentario.actualizarComentario(comentario.getId(), comentario);
    }

    @PostMapping("/comentarios/eliminar/{id}")
    public void deleteComentario(@PathVariable Long id) {
        serviceComentario.eliminarComentario(id);
    }
}
