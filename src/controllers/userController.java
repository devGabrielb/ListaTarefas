package controllers;

import models.Usuario;

import java.util.ArrayList;
import java.util.List;

import data.*;
public class userController extends baseController{

    public userController() {
    }

    public void login(Usuario usuario) {
        _banco.getUsuarios().forEach((user)->{
            if(user.getEmail() == usuario.getEmail()){
                _banco.setUsuarioLogadoId(user.getId());
                return;
            }
        });
        _banco.setUsuarios(usuario);
        _banco.setUsuarioLogadoId(usuario.getId());
    }
    

    public Usuario create(String nome, String email){
        Usuario usuario = new Usuario(nome, email);
        _banco.setUsuarios(usuario);
        return usuario;

    }

    public List<Usuario> getUsuarios(){
        
        return _banco.getUsuarios(); 
    }

    public void deleteUsuario(String email){

        _banco.excluirUsuario(email);
    }


}
