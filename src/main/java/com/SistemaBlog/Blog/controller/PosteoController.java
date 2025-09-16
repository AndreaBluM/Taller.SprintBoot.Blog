package com.SistemaBlog.Blog.controller;

import com.SistemaBlog.Blog.model.Posteo;
import com.SistemaBlog.Blog.service.IservicePosteo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class PosteoController {

    private IservicePosteo servicePosteo;

   @Autowired
    public PosteoController(IservicePosteo servicePosteo) {
        this.servicePosteo = servicePosteo;
    }

    @GetMapping("/posteos")
    public List<Posteo> getAllPosteos() {
        return servicePosteo.obtenerPosteos();
    }

    @GetMapping("/posteos/{id}")
    public Optional<Posteo> getPosteoById(@PathVariable Long id) {
        return servicePosteo.obtenerPosteoPorId(id);
    }

    @PostMapping("/posteos/crear")
    public void createPosteo( @RequestBody Posteo posteo) {
        servicePosteo.guardarPosteo(posteo);
    }

    @PostMapping("/posteos/editar")
    public void updatePosteo( @RequestBody Posteo posteo) {
        servicePosteo.actualizarPosteo(posteo.getId(), posteo);
    }

    @DeleteMapping("/posteos/eliminar/{id}")
    public void deletePosteo(@PathVariable Long id) {
        servicePosteo.eliminarPosteo(id);
    }

}
