package com.ibm.service;

import com.ibm.model.User;

import javax.enterprise.context.ApplicationScoped;
import java.util.List;

@ApplicationScoped
public class UserService {

    public List<User> list() {
        return List.of(new User(1, "Subramanian", "Coimbatore"));
    }
}
