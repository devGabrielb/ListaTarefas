package data;

import java.util.ArrayList;
import java.util.List;

import models.Tarefas;
import models.Usuario;

public class BancodeDados {
    private static BancodeDados instance;
    private List<Usuario> usuarios;
    private int usuarioLogadoId;

    private BancodeDados() {
        this.usuarios = new ArrayList<Usuario>();
    }
    public Usuario getUsuarioLogado() {
       
        for(Usuario usuario : this.usuarios ){
            if(usuario.getId() == usuarioLogadoId){
                return usuario;
            }
        }
         return null;
     }
     public int getUsuarioLogadoIndice() {
         int indexUsuario = 0;
        for(Usuario usuario : this.usuarios ){
            indexUsuario++;
            if(usuario.getId() == usuarioLogadoId){
                return indexUsuario;
            }
        }
         return -1;
      
     }
    public int getUsuarioLogadoId() {
        return usuarioLogadoId;
    }

    public void setUsuarioLogadoId(int usuarioLogadoId) {
        this.usuarioLogadoId = usuarioLogadoId;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Usuario usuario) {
        this.usuarios.add(usuario);
    }

    public void excluirUsuario(String email){
        List<Usuario> list = new ArrayList<Usuario>();
        for(Usuario usuario : this.usuarios ){

            if(!email.equals(usuario.getEmail())){
                
                list.add(usuario);
            }
        }
        this.usuarios = list;
    }

    public void excluirTarefa(String titulo){
        List<Tarefas> listTarefas = new ArrayList<Tarefas>();
        for(Tarefas tarefa : this.getUsuarioLogado().getTarefasUsuario() ){

            if(!titulo.equals(tarefa.getTitulo())){
                
                listTarefas.add(tarefa);
            }
        }
        setTarefaUsuarioAll(listTarefas
        );
    }


    public void setTarefaUsuario(Tarefas tarefa){
        for(Usuario usuario : this.usuarios ){
            if(usuario.getId() == usuarioLogadoId){
                usuario.setTarefasUsuario(tarefa);
            }
        }
         
     }

     public void setTarefaUsuarioAll(List<Tarefas> tarefa){
        for(Usuario usuario : this.usuarios ){
            if(usuario.getId() == usuarioLogadoId){
                usuario.limparTarefas();
                for(Tarefas t : tarefa){
                    usuario.setTarefasUsuario(t);
                }
                return;
            }
        }
         
     }
    

    public static BancodeDados getInstance() {
        
        if( instance == null ){
            
            instance = new BancodeDados();
        }
        
        return instance;
    }

   
}
