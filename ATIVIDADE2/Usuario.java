package ATIVIDADE2;

public class Usuario extends Pessoa {
    private Integer matricula;

    public Usuario(String nome, String email, Integer matricula){
        super(nome, email);
        this.matricula = matricula; 
    }

public Integer getMatricula(){
    return this.matricula;
}

public void setMatricula(Integer matricula){
    this.matricula = matricula; 
}

@Override
public void exibirInfo(){
    System.out.println("Nome: " + this.nome);
    System.out.println("Email: " + this.email);
    System.out.println("Matrícula: " + this.matricula); 
}
}