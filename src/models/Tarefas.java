package models;

import java.util.ArrayList;
import java.util.List;

public class Tarefas {
    private String titulo;
    private String descricao;
    private String prioridade;
    private List<Tarefas> subtarefas;
    private Categoria categoria;
    
        public Tarefas(String titulo, String descricao, String prioridade, String categoria) {
            this.titulo = titulo;
            this.descricao = descricao;
            this.prioridade = prioridade;
            this.subtarefas = new ArrayList<Tarefas>();
            this.setCategoria(categoria);
        }

    public String getDescricao() {
        return descricao;
    }

    public String getCategoria() {
        return categoria.getNome();
    }

    public void setCategoria(String categoria) {
        this.categoria =  new Categoria(categoria);
    }

    public List<Tarefas> getSubtarefas() {
        return subtarefas;
    }

    public void setSubtarefas(List<Tarefas> subtarefas) {
        this.subtarefas = subtarefas;
    }

    public String getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(String prioridade) {
        this.prioridade = prioridade;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
