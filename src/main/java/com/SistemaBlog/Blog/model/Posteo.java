package com.SistemaBlog.Blog.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Posteo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "autor_id")
    private Autor autor;

    @OneToMany(mappedBy = "posteo", cascade = CascadeType.ALL)
    private List<Comentario> comentarios = new ArrayList<>();

    public Posteo() {
    }

    public Posteo(Long id, String titulo, Autor autor, List<Comentario> comentarios) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.comentarios = comentarios;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public List<Comentario> getComentarios() {
        return comentarios;
    }

    public void setComentarios(List<Comentario> comentarios) {
        this.comentarios = comentarios;
    }
}
