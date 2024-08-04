package repository;
import com.yourcompany.yourproject.repository;

import com.yourcompany.yourproject.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
