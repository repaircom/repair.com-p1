package controller;

import model.UserFeedback;
import service.UserFeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/feedback")
public class UserFeedbackController {

    @Autowired
    private UserFeedbackService userFeedbackService;

    @GetMapping
    public List<UserFeedback> getAllUserFeedback() {
        return userFeedbackService.getAllUserFeedback();
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserFeedback> getUserFeedbackById(@PathVariable Long id) {
        return userFeedbackService.getUserFeedbackById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public UserFeedback createUserFeedback(@RequestBody UserFeedback userFeedback) {
        return userFeedbackService.createUserFeedback(userFeedback);
    }

    @PutMapping("/{id}")
    public ResponseEntity<UserFeedback> updateUserFeedback(@PathVariable Long id, @RequestBody UserFeedback feedbackDetails) {
        return ResponseEntity.ok(userFeedbackService.updateUserFeedback(id, feedbackDetails));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUserFeedback(@PathVariable Long id) {
        userFeedbackService.deleteUserFeedback(id);
        return ResponseEntity.noContent().build();
    }
}
