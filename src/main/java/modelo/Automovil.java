public class Automovil extends Vehiculo {
	private int potencia;
	private int numeroDePuertas;
	private int tamaņoMotor;

	public Automovil(Object int_potencia, Object int_numeroDePuertas, Object int_tamaņoMotor) {
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

	public int getTamaņoMotor() {
		return this.tamaņoMotor;
	}

	public void setTamaņoMotor(int tamaņoMotor) {
		this.tamaņoMotor = tamaņoMotor;
	}

	public Double calcularVelocidadMaxima() {
		throw new UnsupportedOperationException();
	}
}