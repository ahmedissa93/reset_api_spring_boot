package reset.api.reset.api.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reset.api.reset.api.entity.User;
import reset.api.reset.api.repository.UserRepository;
import reset.api.reset.api.service.UserService;

import java.rmi.ServerError;
import java.util.List;

@RestController
@RequestMapping("/api")
public class UsersController {

    @Autowired
    private UserService service;
    Logger log = (Logger) LoggerFactory.getLogger(this.getClass());

    @PostMapping("/users/save")
    public ResponseEntity<List<User>> saveUser(@RequestBody User user)
    {
        try {
            return new ResponseEntity(service.saveUser(user), HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/users/saveAll")
    public ResponseEntity<List<User>> saveAllUsers(@RequestBody List<User> user)
    {
        try {
            return new ResponseEntity(service.saveUsers(user), HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/users")
    public ResponseEntity<List<User>> getUsers()
    {
        try {
            return new ResponseEntity(service.getUsers(), HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/user/{id}")
    public  ResponseEntity<List<User>> getUserByID(@PathVariable Long id , User user)
    {
        try {
            return new ResponseEntity(service.getUserById(id), HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/user/{id}")
    public ResponseEntity<List<User>> updateUser(@PathVariable Long id , @RequestBody User user){
        try {
            return new ResponseEntity(service.updateUser(id,user), HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/user/{id}")
    public ResponseEntity<List<User>> deleteUser(@PathVariable Long id){
        try {
            return new ResponseEntity(service.deleteUser(id), HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
