package project.foodmap.componets.users;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends JpaRepository<Users, Long> {
    
    @Query("select u from users u where u.id = ?1")
    Users getUser(Long id);

    @Query("select u from users u where u.email = ?1")
    Users findUsersByEmail(String email);

    @Query("select u from users u where u.email = ?1")
    Users getUserEmail(String email);
}
