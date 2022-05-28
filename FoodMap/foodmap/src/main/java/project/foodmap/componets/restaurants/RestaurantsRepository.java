package project.foodmap.componets.restaurants;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface RestaurantsRepository extends JpaRepository<Restaurants, Long> {
    
    //get restaurant by id
    @Query("select r from restaurants r where r.id = ?1")
    Restaurants getRestaurnt(Long id);

}
