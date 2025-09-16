package com.SistemaBlog.Blog.model;

import jakarta.persistence.*;

@Entity
public class Comentario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String texto;
    private String createdAt;

    @ManyToOne
    @JoinColumn(name = "posteo_id")
    private Posteo posteo;

    public Comentario() {
    }

    public Comentario(Long id, String texto, String createdAt, Posteo posteo) {
        this.id = id;
        this.texto = texto;
        this.createdAt = createdAt;
        this.posteo = posteo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public Posteo getPosteo() {
        return posteo;
    }

    public void setPosteo(Posteo posteo) {
        this.posteo = posteo;
    }
}
