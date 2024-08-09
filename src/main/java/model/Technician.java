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
    @JoinColumn(name = "location_id")
    private Location location;
    private Boolean availability;
    private String mobileNumber;
    private String email;

    // Getters and Setters
}



