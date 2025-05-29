package com.example.app.Controller;

import com.example.app.Entities.User;
import com.example.app.Service.Users_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bfhldevapigw.healthrx.co.in/hiring")
public class Main_Controller {

    @Autowired
    private Users_Service users_service;


    @Autowired
    private User user;

    @PostMapping("/testWebhook/JAVA")
    public ResponseEntity<String> query(){
        return new ResponseEntity<>(users_service.get_query(), HttpStatus.OK);
    }

    @PostMapping("/generateWebhook/JAVA")
    public ResponseEntity<User> get_user(@RequestBody User user){
        return new ResponseEntity<User>(users_service.add_user(user),HttpStatus.OK);
    }
}
