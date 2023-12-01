package modelo;
public class Motocicleta extends Vehiculo {
	private int potenciaMotor;
	private String tipoDeMotor;
	private String suspension;

	public Motocicleta(int potenciaMotor, String tipoDeMotor, String suspension) {
		super(marca, modelo, año, stock, precio, peso, patente, tipo);
		this.potenciaMotor = potenciaMotor;
		this.tipoDeMotor = tipoDeMotor;
		this.suspension = suspension;
	}
	public int getPotenciaMotor() {
		return this.potenciaMotor;
	}

	public void setPotenciaMotor(int potenciaMotor) {
		this.potenciaMotor = potenciaMotor;
	}

	public String getTipoDeMotor() {
		return this.tipoDeMotor;
	}

	public void setTipoDeMotor(String tipoDeMotor) {
		this.tipoDeMotor = tipoDeMotor;
	}

	public String getSuspension() {
		return this.suspension;
	}

	public void setSuspension(String suspension) {
		this.suspension = suspension;
	}

//Metodo abstracto para calcular velocidad (maxima= (potencia*2)/peso)
	public Double calcularVelocidadMaxima(){
		return (potenciaMotor*2)/peso;
	}

	//toString
	public String toString(){
		return "Marca: " + marca + "\nModelo: " + modelo + "\nAño: " + año + "\nStock: " + stock + "\nPrecio: " + precio + "\nPeso: " + peso + "\nPotencia Motor: " + potenciaMotor + "\nTipo de Motor: " + tipoDeMotor + "\nSuspension: " + suspension;
	}



}