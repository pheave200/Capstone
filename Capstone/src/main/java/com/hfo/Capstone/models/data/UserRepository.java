package com.hfo.Capstone.models.data;

import com.hfo.Capstone.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {

    User findByUserName(String name);
}
