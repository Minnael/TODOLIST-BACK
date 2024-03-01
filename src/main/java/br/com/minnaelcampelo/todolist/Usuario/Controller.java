package br.com.minnaelcampelo.todolist.Usuario;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor
@RestController
@RequestMapping("/Usuarios")
public class Controller {

   private final Services usuarioServico;
   @PostMapping("/")
   public void criar(@RequestBody Model usuarioModelo) {
      usuarioServico.save(usuarioModelo.id, usuarioModelo.nome, usuarioModelo.senha);
   }

}
