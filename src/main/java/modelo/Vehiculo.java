package modelo;
public abstract class Vehiculo {
	protected String marca;
	protected String modelo;
	protected int año;
	protected int stock;
	protected Double precio;

	protected  Double peso;

	protected String patente;

	protected String tipo;






	public Vehiculo(String marca, String modelo, int año, int stock, Double precio, Double peso, String patente, String tipo) {
		this.marca = marca;
		this.modelo = modelo;
		this.año = año;
		this.stock = stock;
		this.precio = precio;
		this.peso = peso;
		this.patente = patente;
		this.tipo = tipo;
	}



	public Double getPeso() {
		return this.peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public String getMarca() {
		return this.marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return this.modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAño() {
		return this.año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	public int getStock() {
		return this.stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public Double getPrecio() {
		return this.precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public String getPatente() {
		return this.patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}





	//Metodo abstracto para calcular velocidad maxima
	public abstract Double calcularVelocidadMaxima();

	//Metodo toString para mostrar los datos del vehiculo
	public String toString(){
		return "Marca: " + marca + "\nModelo: " + modelo + "\nAño: " + año + "\nStock: " + stock + "\nPrecio: " + precio;
	}
}