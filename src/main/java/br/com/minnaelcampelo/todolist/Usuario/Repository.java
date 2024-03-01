package br.com.minnaelcampelo.todolist.Usuario;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface Repository extends MongoRepository<Model, String> {}