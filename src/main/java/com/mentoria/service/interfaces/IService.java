package com.mentoria.service.interfaces;

import java.util.List;

public interface IService<T> {
    T findById(Long id);

    T findByRa(String ra);

    List<T> findAll();

    T create(T object);

    T update(T object, Long id);

    void delete(Long id);
}
