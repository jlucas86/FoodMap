package com.example.FoodMap.componets.users;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class usersService {
    
    private final usersRepository usersRepository;

    @Autowired
    public usersService(usersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    public users getUser(int id){
        return usersRepository.getUser(id);
    }

    @Transactional
    public void createUser(users u){
        System.out.println(u.getId());
        usersRepository.save(u);
    }

}
