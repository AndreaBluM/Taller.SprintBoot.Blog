package com.SistemaBlog.Blog.service;

import com.SistemaBlog.Blog.model.Posteo;
import com.SistemaBlog.Blog.respository.IposteoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServicePosteo implements IservicePosteo{
    private IposteoRepository iposteoRepository;

    @Autowired
    public ServicePosteo(IposteoRepository iposteoRepository) {
        this.iposteoRepository = iposteoRepository;
}

    @Override
    public List<Posteo> obtenerPosteos() {
        return iposteoRepository.findAll();
    }

    @Override
    public Optional<Posteo> obtenerPosteoPorId(Long id) {
        return iposteoRepository.findById(id);
    }

    @Override
    public void guardarPosteo(Posteo posteo) {
        iposteoRepository.save(posteo);
    }

    @Override
    public void eliminarPosteo(Long id) {

    }

    @Override
    public void actualizarPosteo(Posteo posteo) {

    }
}
