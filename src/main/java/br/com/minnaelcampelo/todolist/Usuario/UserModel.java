package br.com.minnaelcampelo.todolist.Usuario;

import lombok.Data;
import lombok.AllArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@AllArgsConstructor
@Document (collection = "Usuarios")
public class UserModel {

   @Id
   private String id; 

   private String username;
   private String name;
   private String password;
}


