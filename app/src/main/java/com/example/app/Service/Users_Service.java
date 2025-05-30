package com.example.app.Service;


import com.example.app.Entities.User;

public interface Users_Service{
    public String get_query(Final_Query final_query);

    public User add_user(User user);
}
