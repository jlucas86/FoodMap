package project.foodmap.componets.reviews;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping(path = "/api/v1/reviews/")
public class ReviewsController {

    private final ReviewsService reviewsService;

    @Autowired
    public ReviewsController(ReviewsService reviewsService) {
        this.reviewsService = reviewsService;
    }

    @GetMapping(path = "getReview/{p0}/{p1}")
    public Reviews getUser(@PathVariable("p0") Long user_id, @PathVariable("p01") Long restaurant_id ){

        return reviewsService.getReview(user_id, restaurant_id);
    }

    @PostMapping(path = "addUser")
    public void addUser(@RequestBody Reviews r) throws Exception {
        reviewsService.addReview(r);
    }
    
    @DeleteMapping(path = "deleteUser")
    public void deleteRestaurant(@RequestBody Reviews r) throws Exception{
        reviewsService.deleteReview(r);
    }

    
}
