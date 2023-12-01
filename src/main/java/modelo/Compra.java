package modelo;
import java.util.ArrayList;
import java.util.Date;
public class Compra {
	private ArrayList<Vehiculo> listaDeVehiculosCompra;
	private Cliente cliente;
	private String informacionEnvio;
	private Date fechaCompra;
	private String metodoPago;

	public Compra(String direccion, Cliente cliente, ArrayList<Vehiculo> listaDeVehiculosCompra, String informacionEnvio, Date fechaCompra, String metodoPago) {
		this.listaDeVehiculosCompra = listaDeVehiculosCompra;
		this.cliente = cliente;
		this.informacionEnvio = informacionEnvio;
		this.fechaCompra = fechaCompra;
		this.metodoPago = metodoPago;
	}

	public ArrayList<Vehiculo> getListaDeVehiculosCompra() {
		throw new UnsupportedOperationException();
	}

	public void setListaDeVehiculosCompra(ArrayList<Vehiculo> listaDeVehiculosCompra) {
		throw new UnsupportedOperationException();
	}

	public Cliente getCliente() {
		return this.cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public String getInformacionEnvio() {
		return this.informacionEnvio;
	}

	public void setInformacionEnvio(String informacionEnvio) {
		this.informacionEnvio = informacionEnvio;
	}

	public Date getFechaCompra() {
		return this.fechaCompra;
	}

	public void setFechaCompra(Date fechaCompra) {
		this.fechaCompra = fechaCompra;
	}

	public String getMetodoPago() {
		return this.metodoPago;
	}

	public void setMetodoPago(String metodoPago) {
		this.metodoPago = metodoPago;
	}

	public Compra(Object cliente_cliente) {
		throw new UnsupportedOperationException();
	}
}