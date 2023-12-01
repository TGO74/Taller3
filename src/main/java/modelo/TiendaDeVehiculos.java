package modelo;

import java.util.ArrayList;

public class TiendaDeVehiculos {
	private ArrayList<Vehiculo> automoviles;
	private ArrayList<Vehiculo> motos;
	private ArrayList<Vehiculo> vehiculos; // Cambié el nombre para ser consistente
	private ArrayList<Compra> compras;
	private ArrayList<Cliente> clientes;

	public TiendaDeVehiculos() {
		this.automoviles = new ArrayList<>();
		this.motos = new ArrayList<>();
		this.vehiculos = new ArrayList<>();
		this.compras = new ArrayList<>();
		this.clientes = new ArrayList<>();
	}

	public ArrayList<Vehiculo> getAutomoviles() {
		return automoviles;
	}

	public void setAutomoviles(ArrayList<Vehiculo> automoviles) {
		this.automoviles = automoviles;
	}

	public ArrayList<Vehiculo> getMotos() {
		return motos;
	}

	public void setMotos(ArrayList<Vehiculo> motos) {
		this.motos = motos;
	}

	public ArrayList<Vehiculo> getVehiculos() {
		return vehiculos;
	}

	public void setVehiculos(ArrayList<Vehiculo> vehiculos) {
		this.vehiculos = vehiculos;
	}

	public boolean existeVehiculo(String patente) {
		for (Vehiculo v : vehiculos) {
			if (v.getPatente().equals(patente)) {
				return true;
			}
		}
		return false;
	}

	public void agregarVehiculo(Vehiculo vehiculo) {
		if (!existeVehiculo(vehiculo.getPatente())) {
			vehiculos.add(vehiculo);
			// Aquí deberías llamar a un método para guardar en el archivo de texto, por ejemplo:
			// GestorArchivosVehiculos.guardarDatos(vehiculo, "vehiculos.txt");
		}
	}

	// Otros métodos...

	public void eliminarMoto(Vehiculo motocicleta) {
		motos.remove(motocicleta);
		vehiculos.remove(motocicleta);
	}

	public void agregarAutomovil(Vehiculo automovil) {
		automoviles.add(automovil);
		vehiculos.add(automovil);
	}

	public void eliminarAutomovil(Vehiculo automovil) {
		automoviles.remove(automovil);
		vehiculos.remove(automovil);
	}

	public ArrayList<Compra> getCompras() {
		return compras;
	}

	public void setCompras(ArrayList<Compra> compras) {
		this.compras = compras;
	}

	public ArrayList<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(ArrayList<Cliente> clientes) {
		this.clientes = clientes;
	}

	public void registrarCuentaCliente(Cliente cliente) {
		clientes.add(cliente);
	}
}
