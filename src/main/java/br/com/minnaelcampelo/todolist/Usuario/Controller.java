package br.com.minnaelcampelo.todolist.Usuario;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/Usuarios")
public class Controller {

   @Autowired
   private Repository repository;

   @PostMapping("/")
   public ResponseEntity post(@RequestBody UserModel userModel) {
      var user = this.repository.findByUsername(userModel.getUsername());

      if (user!= null) {
         System.out.println("USUÁRIO JÁ CADASTRADO!");
         return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("USÁRIO JÁ CADASTRADO!");
      }

      var userCreated = this.repository.save(userModel);
      System.out.println("USUÁRIO CADASTRADO COM SUCESSO!");
      return ResponseEntity.status(HttpStatus.CREATED).body(userCreated);
   }

}
