package com.SistemaBlog.Blog.service;

import com.SistemaBlog.Blog.model.Comentario;
import com.SistemaBlog.Blog.respository.IcomentarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceComentario implements IserviceComentario {

    private IcomentarioRepository icomentarioRepository;

    @Autowired
    public ServiceComentario(IcomentarioRepository icomentarioRepository) {
        this.icomentarioRepository = icomentarioRepository;
    }

    @Override
    public List<Comentario> obtenerComentarios() {
        return icomentarioRepository.findAll();
    }

    @Override
    public Optional<Comentario> obtenerComentarioPorId(Long id) {
        return icomentarioRepository.findById(id);
    }

    @Override
    public void guardarComentario(Comentario comentario) {
        icomentarioRepository.save(comentario);
    }

    @Override
    public void eliminarComentario(Long id) {
        icomentarioRepository.deleteById(id);
    }

    @Override
    public void actualizarComentario(Long id, Comentario comentarioActualizado) {
        comentarioActualizado.setId(id);
        icomentarioRepository.save(comentarioActualizado);
    }


}
