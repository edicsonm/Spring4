package com.edimoto.spring4.repository;

import com.edimoto.spring4.model.Spitter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by edicson on 3/2/17.
 */
@Service
public class SpitterRepositoryImpl implements SpitterRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    private static List<Spitter> listSpitters = new ArrayList<Spitter>();

    @Override
    public void save(Spitter unsaved) {
        listSpitters.add(unsaved);

        jdbcTemplate.query(
                "SELECT * FROM MySQLTests.spitter where userName = ?;", new Object[] { "edicsonm" },
                (rs, rowNum) -> new Spitter(
                        rs.getString("firstName"),
                        rs.getString("lastName"),
                        rs.getString("userName"),
                        rs.getString("password"))
        ).forEach(customer -> System.out.println(customer.toString()));
    }

    private Spitter mapSpitter(ResultSet rs, int row) throws SQLException {
        return new Spitter(
                rs.getString("firstName"),
                rs.getString("lastName"),
                rs.getString("userName"),
                rs.getString("password"));
    }

    @Override
    public Spitter findByUsername(String userName) {
        return listSpitters.get(0);
    }
}
