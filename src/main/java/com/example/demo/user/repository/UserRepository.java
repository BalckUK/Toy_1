package com.example.demo.user.repository;

import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {
    public String FindById(int i) {
        return "admin";
    }

}
