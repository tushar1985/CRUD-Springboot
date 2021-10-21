package com.emp.myemp.controller;

import com.emp.myemp.model.user;
import com.emp.myemp.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@RestController
public class apicontroller {

    @Autowired
    private UserRepo userRepo;

    @GetMapping(value="/")
    public String getPage(){
        return "welcome";
    }

    @GetMapping(value="/users")
    public List<user> getUsers(){
        return userRepo.findAll();
    }
    @PostMapping(value="/save")
    public String saveUser(@RequestBody user user) {
        userRepo.save(user);
        return "Saved...";
    }



        @PutMapping(value="update/{id}")
        public String updateUser(@PathVariable long id, @RequestBody user user){
            user updatedUser=userRepo.findById(id).get();
            updatedUser.setFname(user.getFname());
            updatedUser.setLname(user.getLname());
            updatedUser.setAge(user.getAge());
            updatedUser.setOccupation(user.getOccupation());
            userRepo.save(updatedUser);
            return "updated...";
    }

    @DeleteMapping(value="/delete/{id}")
    public String deleteuser(@PathVariable long id){
        user deleteuser=userRepo.findById(id).get();
        userRepo.delete(deleteuser);
        return "Delete user with the id : " +id;

    }


}
