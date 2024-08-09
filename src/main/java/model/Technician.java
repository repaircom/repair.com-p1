package model;

import jakarta.persistence.*;

import model.Location;

import org.springframework.stereotype.Service;



@Entity
public class Technician {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String service;

    @ManyToOne
    @JoinColumn(name = "location_id", nullable = false) // Ensures location is not null
    private Location location;

    private Boolean availability;

    private String mobileNumber;

    private String email;

    // Default constructor
    public Technician() {
    }

    // Parameterized constructor
    public Technician(Long id, String name, String service, Location location, Boolean availability, String mobileNumber, String email) {
        this.id = id;
        this.name = name;
        this.service = service;
        this.location = location;
        this.availability = availability;
        this.mobileNumber = mobileNumber;
        this.email = email;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Boolean getAvailability() {
        return availability;
    }

    public void setAvailability(Boolean availability) {
        this.availability = availability;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Technician{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", service='" + service + '\'' +
                ", location=" + location +
                ", availability=" + availability +
                ", mobileNumber='" + mobileNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
