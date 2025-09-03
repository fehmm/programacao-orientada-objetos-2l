
public class Simulacao {

    public static void main(String[] args) {
        Carro opala = new Carro();
        opala.velociade = 0;
        opala.placa = "acl200";
        opala.modelo = "comodro";
        opala.ano = 76;

        Radar Radar = new Radar();
        radar.modelo = "pardal";
        radar.localizacao = "pistao sul";

        opala.acelerar();
        opala.acelerar();
        opala.acelerar();
        opala.acelerar();
        opala.acelerar();
        opala.acelerar();
        opala.acelerar();
        opala.acelerar();
        opala.acelerar();
        opala.acelerar();
        opala.acelerar();
        opala.acelerar();

        radar.avaliarVelociade(opala);

        opala.acelerar();
        radar.avaliarVelociade(opala);
        
        


    }
    
}
