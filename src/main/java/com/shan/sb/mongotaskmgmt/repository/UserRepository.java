package com.shan.sb.mongotaskmgmt.repository;

import com.shan.sb.mongotaskmgmt.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
    User findByEmail(String email);

    @Query("{'addresses.city': ?0}")
    List<User> findByCity(String city);

    @Query("{'addresses.zipCode' : ?0}")
    List<User> findByZipCode(String zip);
}
