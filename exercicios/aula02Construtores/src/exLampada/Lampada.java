package exLampada;

// Escreva uma classe para representar uma lâmpada. Desenvolva métodos
// para ligar e desligar a lâmpada. Ao criar o objeto você deverá passar
// como argumento para o construtor se a lâmpada iniciará acesa ou
// apagada. Os parâmetros do construtor deverão ter o mesmo nome dos
// atributos da classe. Faça um programa para testar essa classe.


public class Lampada {
    private boolean estadoLampada;

    public Lampada(boolean estadoLampada){
        this.estadoLampada = estadoLampada;
    }

    public void acenderLampada(){
        if(estadoLampada == false){
            estadoLampada = true;
            System.out.println("A lâmpada foi acesa!");
        }else{
            System.out.println("A lâmpada ja está acesa!");
        }
    }
    
    public void apagarLampada(){
        if(estadoLampada == true){
            estadoLampada = false;
            System.out.println("A lâmpada foi apagada!");
        }else{
            System.out.println("A lâmpada ja está apagada!");
        }
    }

    public boolean isEstadoLampada() {
        return estadoLampada;
    }

    public void setEstadoLampada(boolean estadoLampada) {
        this.estadoLampada = estadoLampada;
    }


}
