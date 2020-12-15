package controllers;

import java.util.List;

import models.Tarefas;

public class TarefaController extends baseController{


    public void create(Tarefas tarefa){
        Tarefas t = new Tarefas(tarefa.getTitulo(),
         tarefa.getDescricao(), tarefa.getPrioridade(), tarefa.getCategoria());

         _banco.setTarefaUsuario(tarefa);
    }
    public List<Tarefas> getTarefaUsuario(){
        

        return  _banco.getUsuarioLogado().getTarefasUsuario();
    }

    
    public void deleteTarefa(String titulo){

        _banco.excluirTarefa(titulo);
    }
}
