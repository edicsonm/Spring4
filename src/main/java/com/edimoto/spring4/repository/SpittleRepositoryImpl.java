package com.edimoto.spring4.repository;

import com.edimoto.spring4.model.Spittle;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by edicson on 31/1/17.
 */
@Service
public class SpittleRepositoryImpl implements SpittleRepository {
    private  List<Spittle> spittles;
    {
        spittles = new ArrayList<Spittle>();
        for (int i = 0; i < 50; i++) {
            spittles.add(new Spittle((long)i,"Spittle " + i, new Date()));
        }
    }

    @Override
    public List<Spittle> findSpittles(long max, int count) {
        return spittles;
    }

    @Override
    public Spittle findOne(long spittleId) {
        return spittles.stream().filter(spittle -> spittle.getId() == spittleId).findFirst().orElse(null);
    }

}
