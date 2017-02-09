package com.edimoto.spring4.repository;

import java.io.Serializable;

/**
 * Created by edicson on 8/2/17.
 */
public interface GenericRepository<PK extends Serializable, T> {
    void save(T entity);
    void update(T entity);
    void delete(int PK);
    T findById(int PK);
}
