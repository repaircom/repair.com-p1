package model;

import jakarta.persistence.*;

@Entity
public class UserFeedback {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "technician_id", nullable = false)
    private Technician technician;

    private Integer rating; // Assuming rating is an Integer, adjust type if needed
    private String comments;

    // Default constructor
    public UserFeedback() {
    }

    // Parameterized constructor
    public UserFeedback(Long id, User user, Technician technician, Integer rating, String comments) {
        this.id = id;
        this.user = user;
        this.technician = technician;
        this.rating = rating;
        this.comments = comments;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Technician getTechnician() {
        return technician;
    }

    public void setTechnician(Technician technician) {
        this.technician = technician;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    @Override
    public String toString() {
        return "UserFeedback{" +
                "id=" + id +
                ", user=" + user +
                ", technician=" + technician +
                ", rating=" + rating +
                ", comments='" + comments + '\'' +
                '}';
    }
}
