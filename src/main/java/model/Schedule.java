package model;



import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
public class Schedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "technician_id")
    private Technician technician;
    private LocalDate availableDate;
    private LocalTime availableTime;

    // Getters and Setters

}
