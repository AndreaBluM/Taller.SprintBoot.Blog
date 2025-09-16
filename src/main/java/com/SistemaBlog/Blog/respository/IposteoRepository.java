package com.SistemaBlog.Blog.respository;

import com.SistemaBlog.Blog.model.Posteo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IposteoRepository extends JpaRepository<Posteo, Long> {
//    List<Posteo> findAll();
//    Posteo findById(Long id);
//    void save(Posteo posteo);
//    void deleteById(Long id);
//    void update(Posteo posteo);
}
