package com.SistemaBlog.Blog.respository;

import com.SistemaBlog.Blog.model.Posteo;

import java.util.List;

public interface IposteoRepository {
    List<Posteo> findAll();
    Posteo findById(Long id);
    void save(Posteo posteo);
}
