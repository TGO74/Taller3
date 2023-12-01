public class Cliente {
	private String nombreCliente;
	private String dirección;
	private String correo;
	private Cuenta cuenta;
	private ArrayList<Vehiculo> carritoDeCompra;
	private Compra__ compras = new Compra[0];
	private Vehiculo__ vehiculos = new Vehiculo[0];

	public Cliente(Object string_nombrecliente, Object string_direccion, Object string_correo, Object cuenta_cuenta) {
		throw new UnsupportedOperationException();
	}

	public String getNombreCliente() {
		return this.nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public String getDirección() {
		return this.dirección;
	}

	public void setDirección(String dirección) {
		this.dirección = dirección;
	}

	public String getCorreo() {
		return this.correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public Cuenta getCuenta() {
		return this.cuenta;
	}

	public void setCuenta(Cuenta cuenta) {
		this.cuenta = cuenta;
	}

	public void registrarCuenta() {
		throw new UnsupportedOperationException();
	}

	public Vehiculo buscarVehiculoPorMarca(Object string_marca) {
		throw new UnsupportedOperationException();
	}

	public Vehiculo_vehiculo buscarVehiculoPorModelo(Object string_modelo) {
		throw new UnsupportedOperationException();
	}

	public Vehiculo_vehiculo buscarVehiculoPorTipo(Object string_tipo) {
		throw new UnsupportedOperationException();
	}

	public ArrayList<Vehiculo> getCarritoDeCompra() {
		throw new UnsupportedOperationException();
	}

	public void setCarritoDeCompra(ArrayList<Vehiculo> carritoDeCompra) {
		throw new UnsupportedOperationException();
	}

	public void agregarVehiculoCarritoDeCompra() {
		throw new UnsupportedOperationException();
	}

	public String realizarCompra(Object string_direccion, Object string_nombre_cliente) {
		throw new UnsupportedOperationException();
	}
}