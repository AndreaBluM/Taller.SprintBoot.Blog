package com.SistemaBlog.Blog.controller;

import com.SistemaBlog.Blog.service.IserviceAutor;
import org.springframework.web.bind.annotation.GetMapping;

public class AutorController {

    private IserviceAutor serviceAutor;

    public AutorController(IserviceAutor serviceAutor) {
        this.serviceAutor = serviceAutor;
    }

    @GetMapping("/autores")
    public String getAllAutores() {
        return "Lista de autores";
    }

    @GetMapping("/autores/{id}")
    public String getAutorById() {
        return "Autor por ID";
    }
}
