package com.example.springtemplate.demo.services;

import com.example.domain.User;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ApiServiceImpl implements ApiService {


    private RestTemplate restTemplate;

    public ApiServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public User getUsers(Integer limit) {
        User user = restTemplate.getForObject("http://apifaketory.com/api/user?limit="+limit,User.class);
        return user;
    }
}
