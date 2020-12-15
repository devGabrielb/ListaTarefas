package models;

public class Categoria {
    private String nome;
    private String descricao;
    
    public Categoria(String nome) {
        this.nome = nome;
        
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


}
