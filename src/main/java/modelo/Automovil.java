package modelo;
public class Automovil extends Vehiculo {
	private int potencia;
	private int numeroDePuertas;
	private int tamañoMotor;

	public Automovil( int potencia,  int numeroDePuertas,  int tamañoMotor) {
		super(marca, modelo, año, stock, precio, peso, patente, tipo);
		this.potencia = potencia;
		this.numeroDePuertas = numeroDePuertas;
		this.tamañoMotor = tamañoMotor;
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
//Metodo abstracto para calcular velocidad (maxima: potencia/peso)*10
	public Double calcularVelocidadMaxima(){
		return (potencia/peso)*10;
	}

}