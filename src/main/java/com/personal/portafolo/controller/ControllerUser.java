package com.personal.portafolo.controller;


import com.personal.portafolo.model.User;
import com.personal.portafolo.service.ServiceUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerUser {

    @Autowired
    private ServiceUser service;


    @PostMapping("api")
    public User recibirMensajes(@RequestBody User user){

        if(user.getMensajes() == null || user.getEmail() == null
                || user.getNombre() == null || user.getTel() == null){
            return null;
        }
        return this.service.recibirMensajes(user);
    }

}
