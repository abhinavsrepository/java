package com.dao.pages;

import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.ResultSetHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.pojo.pages.Flight;

public class FlightDAOImpl implements FlightDAO {
    private DataSource dataSource;

    public FlightDAOImpl() {
        try {
            // JNDI lookup for the data source
            Context initContext = new InitialContext();
            Context envContext = (Context) initContext.lookup("java:/comp/env");
            dataSource = (DataSource) envContext.lookup("jdbc/flightDB");
        } catch (NamingException e) {
            throw new RuntimeException("Failed to lookup DataSource: " + e.getMessage(), e);
        }
    }

    @Override
    public List<Flight> findFlights(String source, String destination, Date date) throws SQLException {
        Connection connection = null;
        try {
            connection = dataSource.getConnection(); // Get connection from the pool
            QueryRunner queryRunner = new QueryRunner();
            String sql = "SELECT flight_id, source, destination, flight_date FROM flights WHERE source = ? AND destination = ? AND flight_date = ?";
            ResultSetHandler<List<Flight>> handler = new BeanListHandler<>(Flight.class);
            return queryRunner.query(connection, sql, handler, source, destination, date);
        } finally {
            if (connection != null) {
                connection.close(); // Return connection to the pool
            }
        }
    }
}
