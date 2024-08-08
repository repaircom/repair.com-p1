package repository;


import model.UserFeedback;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserFeedbackRepository extends JpaRepository<UserFeedback, Long> {

}
