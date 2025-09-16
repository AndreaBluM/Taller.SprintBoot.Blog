package com.SistemaBlog.Blog.controller;

import com.SistemaBlog.Blog.model.Autor;
import com.SistemaBlog.Blog.service.IserviceAutor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class AutorController {

    private IserviceAutor serviceAutor;

    @Autowired
    public AutorController(IserviceAutor serviceAutor) {
        this.serviceAutor = serviceAutor;
    }

    @GetMapping("/autores")
    public List<Autor> getAllAutores() {
        return serviceAutor.obtenerAutores();
    }

    @GetMapping("/autores/{id}")
    public Optional<Autor> getAutorById(@PathVariable Long id) {
        return serviceAutor.obtenerAutorPorId(id);
    }

    @PostMapping("/autores/crear")
    public void createAutor(@RequestBody Autor autor) {
        serviceAutor.guardarAutor(autor);
    }

    @PostMapping("/autores/editar")
    public void updateAutor(@RequestBody Autor autor) {
        serviceAutor.actualizarAutor(autor.getId(), autor);
    }

    @DeleteMapping("/autores/eliminar/{id}")
    public void deleteAutor(@PathVariable Long id) {
        serviceAutor.eliminarAutor(id);
    }
}
