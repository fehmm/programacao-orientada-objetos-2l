package CLINICA.model;

public class Pessoa {
    protected int id;
    protected String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getInfo() {
        return "Nome: " + nome;
    }
}
