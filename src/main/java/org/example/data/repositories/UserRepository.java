package org.example.data.repositories;

import com.mongodb.client.MongoClient;
import org.example.data.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends MongoRepository<User,Long> {
}
