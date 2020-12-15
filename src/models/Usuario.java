package models;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Usuario {
    private int id;
    private String name;
    private String email;
    private List<Tarefas> tarefasUsuario;

    public Usuario(String name, String email) {
        this.setId(this.gerarId());
        this.name = name;
        this.setEmail(email);
        this.tarefasUsuario = new ArrayList<Tarefas>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return this.email;
    }

    public List<Tarefas> getTarefasUsuario() {
        return tarefasUsuario;
    }

    public void setTarefasUsuario(Tarefas tarefaUsuario) {
        this.tarefasUsuario.add(tarefaUsuario);
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private int gerarId(){
        Random gerador = new Random();
        return gerador.nextInt(100);

    }

    
    public void limparTarefas(){
        this.tarefasUsuario = new ArrayList<Tarefas>();
    }
    

}
