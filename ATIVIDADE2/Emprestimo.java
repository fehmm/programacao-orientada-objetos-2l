package ATIVIDADE2;

public class Emprestimo {
    private Pessoa pessoa; 
    private Material material;
    private String dataEmprestimo;
    private String dataDevolucao;

    public Emprestimo(Pessoa pessoa, Material material, String dataEmprestimo, String dataDevolucao){
        this.pessoa = pessoa;
        this.material = material;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao; 
    }

public Pessoa getPessoa(){
    return this.pessoa;
}

public void setPessoa(Pessoa pessoa){
    this.pessoa = pessoa; 
}

public Material getMaterial(){
    return this.material;
}

public void setmaterial(Material material){
    this.material = material; 
}

public String getdataEmprestimo(){
    return this.dataEmprestimo;
}

public void setdataEmprestimo(String dataEmprestimo){
    this.dataEmprestimo = dataEmprestimo;
}

public String getdataDevolucao(){
    return this.dataDevolucao;
}

public void setdataDevolucao(String dataDevolucao){
    this.dataDevolucao = dataDevolucao; 
}

public void exibirDetalhes(){
    System.out.println("Data de Empréstimo: " + this.dataEmprestimo);
    System.out.println("Data de Devolução: " + this.dataDevolucao);
    System.out.println("Pessoa: ");
    this.pessoa.exibirInfo();
    System.out.println("Material: ");
    this.material.descricao();
}
}