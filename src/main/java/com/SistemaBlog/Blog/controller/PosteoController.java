package com.SistemaBlog.Blog.controller;

import com.SistemaBlog.Blog.model.Posteo;
import com.SistemaBlog.Blog.service.IservicePosteo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    public Posteo getPosteoById(@PathVariable Long id) {
        return servicePosteo.obtenerPosteoPorId(id);
    }

    @PostMapping("/posteos/crear")
    public void createPosteo( @RequestBody Posteo posteo) {
        servicePosteo.guardarPosteo(posteo);
    }

}
