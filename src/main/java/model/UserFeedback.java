package model;



import jakarta.persistence.*;

@Entity
public class UserFeedback {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    @ManyToOne
    @JoinColumn(name = "technician_id")
    private Technician technician;
    private int rating;
    private String comments;

    // Getters and Setters
}
