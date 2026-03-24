public class Main {
	public static void main(String[] args) {
	    Carro c = new Carro("Fusca", 40.0);
	    System.out.println("Modelo: "+ c.getModelo());
	    System.out.println("Velocidade: " + c.getVelocidade()+"km/h");
	    c.setVelocidade(50.0);
	    System.out.println("Velocidade: " + c.getVelocidade()+"km/h");
	}
}
