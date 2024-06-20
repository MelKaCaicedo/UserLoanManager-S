package ec.edu.espe.userloanmanager.services;

import ec.edu.espe.userloanmanager.models.User;
import ec.edu.espe.userloanmanager.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {
        return userRepository.getAll();
    }

    public Optional<User> findUserById(Long id) {
        return userRepository.getOne(id);
    }

    public void createUser(User user) {
        userRepository.addUser(user);
    }

    public void updateUser(Long id, User updatedUser) {
        userRepository.updateUser(id, updatedUser);
    }

    public void deleteUser(Long id) {
        userRepository.deleteUser(id);
    }
}
