package project.foodmap.componets.restaurants;

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
@RequestMapping(path = "/api/v1/restaurants/")
public class RestaurantsController {
    
    private final RestaurantsService restaurantsService;

    @Autowired
    public RestaurantsController(RestaurantsService restaurantsService) {
        this.restaurantsService = restaurantsService;
    }

    @GetMapping(path= "getRestaurant/{p0}")
    public Restaurants getRestaurant(@PathVariable("p0") Long id){
        return restaurantsService.getRestaurant(id);
    }

    @PostMapping(path = "addRestaurant")
    public void addRestaurant(@RequestBody Restaurants r) throws Exception {
        restaurantsService.addRestaurant(r);
    }

    @DeleteMapping(path = "deleteRestaurant")
    public void deleteRestaurant(@RequestBody Restaurants r) throws Exception{
        restaurantsService.deleteRestaurant(r);
    }
}
