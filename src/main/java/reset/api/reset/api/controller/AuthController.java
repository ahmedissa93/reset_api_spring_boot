package reset.api.reset.api.controller;

import com.fasterxml.jackson.databind.util.JSONPObject;
import org.apache.tomcat.util.json.JSONParser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reset.api.reset.api.entity.User;
import reset.api.reset.api.repository.UserRepository;

import java.util.List;

@RestController
@RequestMapping("/api")
//@CrossOrigin("http://localhost:3000/")

public class AuthController {
//    @Autowired
//    private UserRepository userRepository;

//    Logger log = (Logger) LoggerFactory.getLogger(this.getClass());
//    @PostMapping("/login")
//    public ResponseEntity<List<User>> login(@RequestBody User user){
//        return new ResponseEntity<List<User>>(userRepository.findByUsername(user.getUsername()), HttpStatus.OK);
//    }
}
