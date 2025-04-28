package com.dao.pages;

import java.sql.Date;
import java.util.List;
import java.sql.SQLException;

public interface FlightDAO {
    List<Flight> findFlights(String source, String destination, Date date) throws SQLException;
}