public class Automovil extends Vehiculo {
	private int potencia;
	private int numeroDePuertas;
	private int tamañoMotor;

	public Automovil(Object int_potencia, Object int_numeroDePuertas, Object int_tamañoMotor) {
		throw new UnsupportedOperationException();
	}

	public int getPotencia() {
		return this.potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public int getNumeroDePuertas() {
		return this.numeroDePuertas;
	}

	public void setNumeroDePuertas(int numeroDePuertas) {
		this.numeroDePuertas = numeroDePuertas;
	}

	public int getTamañoMotor() {
		return this.tamañoMotor;
	}

	public void setTamañoMotor(int tamañoMotor) {
		this.tamañoMotor = tamañoMotor;
	}

	public Double calcularVelocidadMaxima() {
		throw new UnsupportedOperationException();
	}
}