public class SistemaOperacional {
    private String nome;
    private int SSDDisponivel;     // em GB
    private int memoriaRAMDisponivel; // em MB

    public SistemaOperacional(String nome, int SSDDisponivel, int memoriaRAMDisponivel) {
        this.nome = nome;
        this.SSDDisponivel = SSDDisponivel;
        this.memoriaRAMDisponivel = memoriaRAMDisponivel;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getSSDDisponivel() {
        return SSDDisponivel;
    }

    public void setSSDDisponivel(int SSDDisponivel) {
        this.SSDDisponivel = SSDDisponivel;
    }

    public int getMemoriaRAMDisponivel() {
        return memoriaRAMDisponivel;
    }

    public void setMemoriaRAMDisponivel(int memoriaRAMDisponivel) {
        this.memoriaRAMDisponivel = memoriaRAMDisponivel;
    }
}