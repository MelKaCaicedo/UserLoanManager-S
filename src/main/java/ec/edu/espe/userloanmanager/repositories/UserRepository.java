package ec.edu.espe.userloanmanager.repositories;

import ec.edu.espe.userloanmanager.models.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class UserRepository {
    private List<User> users = new ArrayList<>();
    private Long nextId = 1L;

    public List<User> getAll() {
        return new ArrayList<>(users);
    }

    public Optional<User> getOne(Long id) {
        return users.stream()
                .filter(user -> user.getId().equals(id))
                .findFirst();
    }

    public void addUser(User user) {
        user.setId(nextId++);
        users.add(user);
    }

    public void updateUser(Long id, User updatedUser) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getId().equals(id)) {
                updatedUser.setId(id);
                users.set(i, updatedUser);
                return;
            }
        }
    }

    public void deleteUser(Long id) {
        users.removeIf(user -> user.getId().equals(id));
    }
}
