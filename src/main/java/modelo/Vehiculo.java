public abstract class Vehiculo {
	protected String marca;
	protected String modelo;
	protected int año;
	protected int stock;
	protected Double precio;

	public abstract Double calcularVelocidadMaxima();

	public Vehiculo(Object string_marca, Object string_modelo, Object int_año, Object int_stock, Object double_precio) {
		throw new UnsupportedOperationException();
	}
}