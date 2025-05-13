package com.shan.sb.mongotaskmgmt.repository;

import com.shan.sb.mongotaskmgmt.model.Role;
import com.shan.sb.mongotaskmgmt.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface RoleRepository extends MongoRepository<Role, String> {
    Optional<Role> findByName(String name);
}
