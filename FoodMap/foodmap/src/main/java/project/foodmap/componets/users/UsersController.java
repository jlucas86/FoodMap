package project.foodmap.componets.users;

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
@RequestMapping(path = "/api/v1/users/")
public class UsersController {
    
    
    
    private final UsersService usersService;

    @Autowired
    public UsersController(UsersService usersService) {
        this.usersService = usersService;
    }

    @GetMapping(path = "getUser/{p0}")
    public Users getUser(@PathVariable("p0") Long userId ){

        return usersService.getUser(userId);
    }

    @PostMapping(path = "addUser")
    public long addUser(@RequestBody Users u) throws Exception {
        usersService.addUser(u);
        return 10l;
    }
    
    @DeleteMapping(path = "deleteUser")
    public void deleteRestaurant(@RequestBody Users u) throws Exception{
        usersService.deleteUser(u);
    }

    
}


