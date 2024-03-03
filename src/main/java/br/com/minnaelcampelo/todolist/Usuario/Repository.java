package br.com.minnaelcampelo.todolist.Usuario;

import java.util.UUID;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface Repository extends MongoRepository<UserModel, UUID> {
   UserModel findByUsername(String username);
}