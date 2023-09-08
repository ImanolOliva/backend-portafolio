package com.personal.portafolo.service;


import com.personal.portafolo.model.User;
import com.personal.portafolo.repository.RepositoryUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceUser {


    @Autowired
    private RepositoryUser repository;



    public User recibirMensajes(User user){
        return  this.repository.save(user);
    }
}
