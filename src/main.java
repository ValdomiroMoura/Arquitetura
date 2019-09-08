
public class main {
	public static void main(String[] args) {
		Fabrica fabrica = new Chevrolet();
		CarroRico rico = fabrica.CarroRico();
		CarroPobre pobre = fabrica.CarroPobre();
		Carro carro = fabrica.Carro();		
		
		rico.Rico();
		pobre.Pobre();
		carro.Info();
		
	}
}
