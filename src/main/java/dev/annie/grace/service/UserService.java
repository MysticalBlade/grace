package dev.annie.grace.service;

import dev.annie.grace.data.Users;
import dev.annie.grace.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UsersRepository usersRepository;

    public Users saveUser(Users user) {
        return usersRepository.save(user);
    }

    public Users updateUser(Users user) {
        return usersRepository.save(user);
    }

    public List<Users> getAllUsers() {
        return usersRepository.findAll();
    }

    public Optional<Users> getUserByEmail(String email) {
        return usersRepository.findByEmail(email);
    }

    public Users getUserById(Long id) {
        return usersRepository.findById(Math.toIntExact(id)).get();
    }

    public void deleteUser(Long id) {
        usersRepository.deleteById(Math.toIntExact(id));
    }

}
