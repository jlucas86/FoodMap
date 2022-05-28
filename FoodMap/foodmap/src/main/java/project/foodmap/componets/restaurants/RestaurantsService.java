package project.foodmap.componets.restaurants;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RestaurantsService {
    
    private final RestaurantsRepository restaurantsRepository;

    @Autowired
    public RestaurantsService(RestaurantsRepository restaurantsRepository) {
        this.restaurantsRepository = restaurantsRepository;
    }

    public Restaurants getRestaurant(Long id){
        return restaurantsRepository.getRestaurnt(id);
    }

    @Transactional
    public void addRestaurant(Restaurants r) throws Exception {
        
        restaurantsRepository.save(r);
    }

    public void deleteRestaurant(Restaurants r){
        Boolean exists = restaurantsRepository.existsById(r.getId());
        if(!exists)
            throw new IllegalStateException("invalid id");
        restaurantsRepository.deleteById(r.getId());
    }

}
