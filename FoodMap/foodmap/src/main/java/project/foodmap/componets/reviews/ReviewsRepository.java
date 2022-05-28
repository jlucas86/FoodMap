package project.foodmap.componets.reviews;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewsRepository extends JpaRepository<Reviews, Long> {
    
    //get restaurant by id
    @Query("select r from review r where r.user_id = ?1 and r.restaurant_id = ?2")
    Reviews getReview(Long user_id, Long restaurant_id);

    
}
