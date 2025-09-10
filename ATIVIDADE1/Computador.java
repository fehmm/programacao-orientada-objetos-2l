public class Computador {
    private int memoriaRAM; // em MB
    private int SSD;        // em GB
    private int nucleos;    // quantidade de núcleos
    private int operacoesPorSegundo; // quantidade de operações que cada núcleo consegue por segundo

    // Construtor
    public Computador(int memoriaRAM, int SSD, int nucleos, int operacoesPorSegundo) {
        this.memoriaRAM = memoriaRAM;
        this.SSD = SSD;
        this.nucleos = nucleos;
        this.operacoesPorSegundo = operacoesPorSegundo;
    }

    // Getters e Setters
    public int getMemoriaRAM() {
        return memoriaRAM;
    }

    public void setMemoriaRAM(int memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }

    public int getSSD() {
        return SSD;
    }

    public void setSSD(int SSD) {
        this.SSD = SSD;
    }

    public int getNucleos() {
        return nucleos;
    }

    public void setNucleos(int nucleos) {
        this.nucleos = nucleos;
    }

    public int getOperacoesPorSegundo() {
        return operacoesPorSegundo;
    }

    public void setOperacoesPorSegundo(int operacoesPorSegundo) {
        this.operacoesPorSegundo = operacoesPorSegundo;
    }
}

