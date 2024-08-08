package model;

import jakarta.persistence.*;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String mobileNumber;
    private String email;
    private String password;
    @ManyToOne
    @JoinColumn(name = "location_id")
    private Location location;

    // Getters and Setters

}

