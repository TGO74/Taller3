public abstract class Vehiculo {
	protected String marca;
	protected String modelo;
	protected int a�o;
	protected int stock;
	protected Double precio;

	public abstract Double calcularVelocidadMaxima();

	public Vehiculo(Object string_marca, Object string_modelo, Object int_a�o, Object int_stock, Object double_precio) {
		throw new UnsupportedOperationException();
	}
}