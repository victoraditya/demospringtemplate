package com.example.springtemplate.demo.services;

import com.example.domain.User;

public interface ApiService {
    User getUsers(Integer limit);
}
