package com.edimoto.spring4.repository;

import com.edimoto.spring4.model.Spitter;

/**
 * Created by edicson on 3/2/17.
 */
public interface SpitterRepository {
    void save(Spitter unsaved);
    Spitter findByUsername(String userName);
}
