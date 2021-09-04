package reset.api.reset.api.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import reset.api.reset.api.entity.User;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
    User findByUsername(String username);
//    Optional findByUsername(String username);
    User findByUsernameAndPassword(String username , String password);

    Optional<User> findById(Long id);

    List<User> findAll();

}
