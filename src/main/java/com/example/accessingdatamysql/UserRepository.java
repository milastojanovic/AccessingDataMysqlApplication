package com.example.accessingdatamysql;

import org.springframework.data.repository.CrudRepository;

// This will be AUTO INCREMENTED by Spring into a Bean called userRepository
// CRUD refers create, read, update, delete

public interface UserRepository extends CrudRepository<User,Integer> {

}
