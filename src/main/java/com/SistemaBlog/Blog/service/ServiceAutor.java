package com.SistemaBlog.Blog.service;

import com.SistemaBlog.Blog.model.Autor;
import com.SistemaBlog.Blog.respository.IautorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceAutor implements IserviceAutor{
    private IautorRepository iautorRepository;

    @Autowired
    public ServiceAutor(IautorRepository iautorRepository) {
        this.iautorRepository = iautorRepository;
    }

    @Override
    public List<Autor> obtenerAutores() {
        return iautorRepository.findAll();
    }

    @Override
    public Optional<Autor> obtenerAutorPorId(Long id) {
        return iautorRepository.findById(id);
    }

    @Override
    public void guardarAutor(Autor autor) {
        iautorRepository.save(autor);
    }

    @Override
    public void eliminarAutor(Long id) {
        iautorRepository.deleteById(id);
    }

    @Override
    public void actualizarAutor(Long id, Autor autorActualizado) {
        autorActualizado.setId(id);
        iautorRepository.save(autorActualizado);
    }


}
