package model;


import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    @ManyToOne
    @JoinColumn(name = "technician_id")
    private Technician technician;
    private LocalDate bookingDate;
    private LocalTime bookingTime;
    private String status;

    // Getters and Setters




}
