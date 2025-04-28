package com.pojo.pages;

public class Flight {
    private int flightId;
    private String source;
    private String destination;
    private Date date;

    public Flight() {
    }

    public Flight(int flightId, String source, String destination, Date date) {
        this.flightId = flightId;
        this.source = source;
        this.destination = destination;
        this.date = date;
    }

    public int getFlightId() {
        return flightId;
    }

    public void setFlightId(int flightId) {
        this.flightId = flightId;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "flightId=" + flightId +
                ", source='" + source + '\'' +
                ", destination='" + destination + '\'' +
                ", date=" + date +
                '}';
    }
}

// --------------------------------------------------------------------------------------------------------------------
// 3. DAO Interface - com/example/FlightDAO.java
// --------------------------------------------------------------------------------------------------------------------
package com.example;



// --------------------------------------------------------------------------------------------------------------------
// 4. DAO Implementation - com/example/FlightDAOImpl.java
// --------------------------------------------------------------------------------------------------------------------
