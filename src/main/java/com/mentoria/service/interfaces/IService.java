package com.mentoria.service.interfaces;

import java.util.List;

public interface IService<T, Long> {
    T findById(Long id);
    List<T> findAll();
    T create(T object);
    T update(T object, Long id);
    void delete(Long id);
}
