package reset.api.reset.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reset.api.reset.api.entity.User;
import reset.api.reset.api.repository.UserRepository;

import java.util.List;

@Service

public class UserService {
    @Autowired
    private UserRepository repository;

    public User saveUser(User user) {
        return repository.save(user);
    }

    public List<User>saveUsers(List<User> users) {
        return repository.saveAll(users);
    }

    public List<User> getUsers() {
        return repository.findAll();
    }

    public User getUserById(Long id) {
        return repository.findById(id).orElse(null);
    }

//    public User getUserByName(String name) {
//        return repository.findByUsername(name);
//    }

    public String deleteUser(Long id) {
        repository.deleteById(id);
        return "delete user" + id;
    }

    public User updateUser(Long id,User user) {
        User existingUser = repository.findById(id).orElse(null);
        existingUser.setUsername(user.getUsername());
        existingUser.setFirstName(user.getFirstName());
        existingUser.setLastName(user.getLastName());
        return repository.save(existingUser);
    }

}
