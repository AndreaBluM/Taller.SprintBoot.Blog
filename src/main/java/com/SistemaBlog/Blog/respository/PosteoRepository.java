//package com.SistemaBlog.Blog.respository;
//
//import com.SistemaBlog.Blog.model.Posteo;
//import org.springframework.stereotype.Repository;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Repository
//public class PosteoRepository implements IposteoRepository {
//    List<Posteo> posteos = new ArrayList<>();
//
//    public PosteoRepository() {
//        posteos.add(new Posteo(1L, "Primer Posteo", "Juan Perez"));
//        posteos.add(new Posteo(2L, "Segundo Posteo", "Maria Gomez"));
//        posteos.add(new Posteo(3L, "Tercer Posteo", "Carlos Lopez"));
//        posteos.add(new Posteo(4L, "Cuarto Posteo", "Ana Torres"));
//        posteos.add(new Posteo(5L, "Quinto Posteo", "Luis Martinez"));
//    }
//
//    @Override
//    public List<Posteo> findAll() {
//        return posteos;
//    }
//
//    @Override
//    public Posteo findById(Long id) {
//        for (Posteo posteo : posteos) {
//            if (posteo.getId().equals(id)) {
//                return posteo;
//            }
//        }
//        return null;
//    }
//
//    @Override
//    public void save(Posteo posteo) {
//        posteos.add(posteo);
//    }
//
//    @Override
//    public void deleteById(Long id) {
//        posteos.removeIf(posteo -> posteo.getId().equals(id));
//    }
//
//    @Override
//    public void update(Posteo posteo) {
//        for (int i = 0; i < posteos.size(); i++) {
//            if (posteos.get(i).getId().equals(posteo.getId())) {
//                posteos.set(i, posteo);
//                return;
//            }
//        }
//    }
//
//
//}
