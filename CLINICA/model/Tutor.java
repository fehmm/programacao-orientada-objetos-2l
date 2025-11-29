package CLINICA.model;

public class Tutor extends Pessoa {
    private String telefone;

    public Tutor(String nome, String telefone) {
        super(nome);
        this.telefone = telefone;
    }

    public String getTelefone() { return telefone; }

    @Override
    public String getInfo() {
        return "Tutor: " + nome + " | Telefone: " + telefone;
    }
}