package br.com.minnaelcampelo.todolist.Usuario;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;

@Document (collection = "Usuarios")
@Data
@AllArgsConstructor
public class Model {

   @Id
   public String id;
   public String nome;
   public String senha;
  
}
