public class Automovil extends Vehiculo {
	private int potencia;
	private int numeroDePuertas;
	private int tama�oMotor;

	public Automovil(Object int_potencia, Object int_numeroDePuertas, Object int_tama�oMotor) {
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

	public int getTama�oMotor() {
		return this.tama�oMotor;
	}

	public void setTama�oMotor(int tama�oMotor) {
		this.tama�oMotor = tama�oMotor;
	}

	public Double calcularVelocidadMaxima() {
		throw new UnsupportedOperationException();
	}
}