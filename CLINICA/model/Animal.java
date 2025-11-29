package CLINICA.model;

public class Animal {
    private int id;
    private String nome;
    private String especie;
    private int tutorId;

    // Construtor
    public Animal(String nome, String especie, int tutorId) {
        this.nome = nome;
        this.especie = especie;
        this.tutorId = tutorId;
    }

    // Construtor vazio (útil para frameworks/DAO)
    public Animal() {}

    // getters e setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getEspecie() { return especie; }
    public void setEspecie(String especie) { this.especie = especie; }

    public int getTutorId() { return tutorId; }
    public void setTutorId(int tutorId) { this.tutorId = tutorId; }

    // método auxiliar para exibir resumo (não usado pelo DAO para inserir)
    public String getResumo() {
        return nome + " (" + especie + ") — Tutor ID: " + tutorId;
    }
}