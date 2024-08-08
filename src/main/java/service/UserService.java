package service;

import model.User;
import repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {

        return UserRepository.findAll();
    }

    public Optional<User> getUserById(Long id) {
        return UserRepository.findById(id);
    }

    public User createUser(User user) {
        return UserRepository.save(user);
    }

    public User updateUser(Long id, User userDetails) {
        User User = UserRepository.findById(id).orElseThrow();
        return userRepository.findAll();
    }

    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public User updateUser(Long id, User userDetails) {
        User user = userRepository.findById(id).orElseThrow();
        user.setName(userDetails.getName());
        user.setMobileNumber(userDetails.getMobileNumber());
        user.setEmail(userDetails.getEmail());
        user.setPassword(userDetails.getPassword());
        user.setLocation(userDetails.getLocation());
        return userRepository.save(user);
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}


