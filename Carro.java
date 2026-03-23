public class Carro {
    private String modelo;
    private double velocidade;
    
    public Carro(String modelo,double velocidade) {
        this.modelo = modelo;
        this.velocidade = velocidade;
    }
    public String getModelo(){
        return modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public double getVelocidade(){
        return velocidade;
    }
    public void setVelocidade(double velocidade){
        if (velocidade >= 0) {
            this.velocidade = velocidade;
        }
        else {
            System.out.println("A velocidade não pode ser negativa");
        };
    }
}