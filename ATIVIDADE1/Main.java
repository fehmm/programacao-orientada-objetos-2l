public class Main {
    public static void main(String[] args) {
        Computador pc = new Computador(8000, 500, 4, 1000); // 8GB RAM, 500GB SSD, 4 núcleos, 1000 ops/s por núcleo
        SistemaOperacional so = new SistemaOperacional("Linux", 400, 8000);

        Programa p1 = new Programa("Editor de Texto", 10, 500, 100000, 1000); // sucesso
        Programa p2 = new Programa("Jogo Pesado", 450, 2000, 500000, 5000);   // erro instalação SSD
        Programa p3 = new Programa("Compilador", 50, 9000, 200000, 1000);     // erro execução RAM

        p1.executarPrograma(pc, so);
        p2.executarPrograma(pc, so);
        p3.executarPrograma(pc, so);
    }
}