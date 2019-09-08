
public class Chevrolet implements Fabrica{

	@Override
	public CarroRico CarroRico() {
		return new Onix();
	}

	@Override
	public CarroPobre CarroPobre() {
		return new Celta();
	}

	@Override
	public Carro Carro() {
		return new Cobalt();
	}

}
