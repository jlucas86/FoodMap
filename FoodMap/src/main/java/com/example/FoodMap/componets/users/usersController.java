package com.example.FoodMap.componets.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping(path = "/api/v1/users/")
public class usersController {
    
    private final usersService usersService;

    @Autowired
    public usersController(usersService usersService) {
        this.usersService = usersService;
    }

    @GetMapping(path = "getUser/{p0}")
    public users getUser(@PathVariable("p0") Integer userId ){

        return usersService.getUser(userId);
    }

    @PostMapping(path = "addUser")
    public long createUser(@RequestBody users u){
        usersService.createUser(u);
        return 10l;
    }

    
}
