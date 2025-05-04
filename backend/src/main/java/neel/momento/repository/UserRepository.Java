package neel.momento.repository;

import neel.momento.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // You can define custom queries here if needed

    // For example, finding a user by email:
    User findByEmail(String email);
}
