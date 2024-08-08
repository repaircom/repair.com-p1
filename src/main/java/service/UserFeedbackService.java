package service;


import model.UserFeedback;
import repository.UserFeedbackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserFeedbackService {

    @Autowired
    private UserFeedbackRepository userFeedbackRepository;

    public List<UserFeedback> getAllUserFeedback() {
        return userFeedbackRepository.findAll();
    }

    public Optional<UserFeedback> getUserFeedbackById(Long id) {
        return userFeedbackRepository.findById(id);
    }

    public UserFeedback createUserFeedback(UserFeedback userFeedback) {
        return userFeedbackRepository.save(userFeedback);
    }

    public UserFeedback updateUserFeedback(Long id, UserFeedback feedbackDetails) {
        UserFeedback feedback = userFeedbackRepository.findById(id).orElseThrow();
        feedback.setUser(feedbackDetails.getUser());
        feedback.setTechnician(feedbackDetails.getTechnician());
        feedback.setRating(feedbackDetails.getRating());
        feedback.setComments(feedbackDetails.getComments());
        return userFeedbackRepository.save(feedback);
    }

    public void deleteUserFeedback(Long id) {
        userFeedbackRepository.deleteById(id);
    }
}
