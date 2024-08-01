package dev.annie.grace.repository;

import dev.annie.grace.data.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public interface UsersRepository extends JpaRepository<Users, Integer> {
    List<Users> findByName(String name);
    Optional<Users> findByEmail(String email);

}
