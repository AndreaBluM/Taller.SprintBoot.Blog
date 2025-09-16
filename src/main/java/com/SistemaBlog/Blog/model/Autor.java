package com.SistemaBlog.Blog.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Autor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String email;

    @JsonManagedReference
    @OneToMany(mappedBy = "autor", cascade = CascadeType.ALL)
    private List<Posteo> posteos = new ArrayList<>();

    public Autor() {
    }

    public Autor(Long id, String nombre, String email, List<Posteo> posteos) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.posteos = posteos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Posteo> getPosteos() {
        return posteos;
    }

    public void setPosteos(List<Posteo> posteos) {
        this.posteos = posteos;
    }
}
