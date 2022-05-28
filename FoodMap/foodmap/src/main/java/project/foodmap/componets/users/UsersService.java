package project.foodmap.componets.users;

import javax.transaction.Transactional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersService {

        
    private final UsersRepository usersRepository;

    @Autowired
    public UsersService(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }  

    public Users  getUser(Long id){
        return usersRepository.getUser(id);
    }

    @Transactional
    public void addUser(Users u) throws Exception {
        if(usersRepository.findUsersByEmail(u.getEmail()) == null)
            throw new Exception("email taken");
        usersRepository.save(u);
    }

    public void deleteUser(Users u){
        Boolean exists = usersRepository.existsById(u.getId());
        if(!exists)
            throw new IllegalStateException("invalid id");
        usersRepository.deleteById(u.getId());
    }

}
        

