package com.edimoto.spring4.repository;

import com.edimoto.spring4.model.Spittle;

import java.util.List;

/**
 * Created by edicson on 30/1/17.
 */
public interface SpittleRepository {
    List<Spittle> findSpittles(long max, int count);

    Spittle findOne(long spittleId);
}