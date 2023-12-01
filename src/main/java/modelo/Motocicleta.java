public class Motocicleta extends Vehiculo {
	private int potenciaMotor;
	private String tipoDeMotor;
	private String suspension;

	public Motocicleta(Object int_potenciaMotor, Object string_tipoDeMotor, Object string_suspension) {
		throw new UnsupportedOperationException();
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

	public Double calcularVelocidadMaxima() {
		throw new UnsupportedOperationException();
	}
}