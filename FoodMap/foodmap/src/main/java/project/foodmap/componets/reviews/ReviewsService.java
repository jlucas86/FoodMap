package project.foodmap.componets.reviews;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.foodmap.componets.restaurants.RestaurantsRepository;
import project.foodmap.componets.users.UsersRepository;

@Service
public class ReviewsService {
    
    private final ReviewsRepository reviewsRepository;
    private final UsersRepository usersRepository;
    private final RestaurantsRepository restaurantsRepository;

    @Autowired
    public ReviewsService(ReviewsRepository reviewsRepository, UsersRepository usersRepository, RestaurantsRepository restaurantsRepository) {
        this.reviewsRepository = reviewsRepository;
        this.usersRepository = usersRepository;
        this.restaurantsRepository = restaurantsRepository;
    }
    

    public Reviews getReview(Long user_id, Long restaurant_id){
        return reviewsRepository.getReview(user_id, restaurant_id);
    }

    // GET USERS REVIEWS (a list)

    // GET RESTAURANTS REVIEWS (a list)

    @Transactional
    public void addReview(Reviews r) throws Exception {
        if(!usersRepository.existsById(r.getUser_id()))
            throw new Exception("user does not exist");

        if(!restaurantsRepository.existsById(r.getRestaurant_id()))
            throw new Exception("restaurant does not exist");

        reviewsRepository.save(r);
    }

    @Transactional
    public void deleteReview(Reviews r) throws Exception {
        if(!usersRepository.existsById(r.getUser_id()))
            throw new Exception("user does not exist");

        if(!restaurantsRepository.existsById(r.getRestaurant_id()))
            throw new Exception("restaurant does not exist");

        reviewsRepository.delete(r);
    }
}
