package br.com.minnaelcampelo.todolist.Usuario;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class Services {
   
   @Autowired
   private Repository usuarioRepositorio;

   public void save(String id, String nome, String senha){
      Model usuarioModelo = new Model(id, nome, senha);
      this.usuarioRepositorio.save(usuarioModelo);
   }

}
