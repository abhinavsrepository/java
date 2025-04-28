package com.dbutils.pages;

import java.io.IOException;
import java.sql.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.pages.FlightDAO;
import com.google.gson.Gson;  // Import Gson
import com.pojo.pages.Flight;

public class FlightSearchServlet extends HttpServlet {
    private FlightDAO flightDAO;
    private Gson gson;

    @Override
    public void init() throws ServletException {
        super.init();
        flightDAO = new FlightDAOImpl();
        gson = new Gson(); // Initialize Gson
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String source = request.getParameter("source");
        String destination = request.getParameter("destination");
        String dateParam = request.getParameter("date");

        if (source == null || destination == null || dateParam == null || source.isEmpty() || destination.isEmpty() || dateParam.isEmpty()) {
            response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Missing or empty parameters");
            return;
        }

        try {
            Date date = Date.valueOf(dateParam); // Convert string to java.sql.Date
            List<Flight> flights = flightDAO.findFlights(source, destination, date);

            response.setContentType("application/json"); // Set content type to JSON
            response.setCharacterEncoding("UTF-8");
            String json = gson.toJson(flights); // Use Gson to convert the list to JSON
            response.getWriter().write(json); // Send the JSON response
        } catch (IllegalArgumentException e) {
            response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Invalid date format. Please use yyyy-MM-dd");
        } catch (Exception e) {
            // Log the error
            e.printStackTrace();
            response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, "Error: " + e.getMessage());
        }
    }
}
