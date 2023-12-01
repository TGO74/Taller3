package modelo;

import java.util.ArrayList;
import java.util.Date;
import dato.GestorArchivosVehiculos;
import dato.GestorArchivosCompras;
import modelo.TiendaDeVehiculos;

public class Cliente {
	private String nombreCliente;
	private String direccion;
	private String correo;
	private ArrayList<Vehiculo> carritoDeCompra;
	private ArrayList<Compra> compras;
	private ArrayList<Vehiculo> vehiculosComprados;

	public Cliente(String nombrecliente, String direccion, String correo, ArrayList<Vehiculo> carritoDeCompra, ArrayList<Compra> compras, ArrayList<Vehiculo> vehiculosComprados) {
		this.nombreCliente = nombrecliente;
		this.direccion = direccion;
		this.correo = correo;
		this.carritoDeCompra = carritoDeCompra;
		this.compras = compras;
		this.vehiculosComprados = vehiculosComprados;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public Vehiculo buscarVehiculoPorMarca(String marca) {
		for (Vehiculo vehiculo : carritoDeCompra) {
			if (vehiculo.getMarca().equalsIgnoreCase(marca)) {
				return vehiculo;
			}
		}
		return null; // Retorna null si no se encuentra ningún vehículo con la marca especificada.
	}

	public Vehiculo buscarVehiculoPorModelo(String modelo) {
		for (Vehiculo vehiculo : carritoDeCompra) {
			if (vehiculo.getModelo().equalsIgnoreCase(modelo)) {
				return vehiculo;
			}
		}
		return null; // Retorna null si no se encuentra ningún vehículo con el modelo especificado.
	}

	public Vehiculo buscarVehiculoPorTipo(String tipo) {
		for (Vehiculo vehiculo : carritoDeCompra) {
			if (vehiculo.getTipo().equalsIgnoreCase(tipo)) {
				return vehiculo;
			}
		}
		return null; // Retorna null si no se encuentra ningún vehículo con el tipo especificado.
	}

	public ArrayList<Vehiculo> getCarritoDeCompra() {
		return carritoDeCompra;
	}

	public void setCarritoDeCompra(ArrayList<Vehiculo> carritoDeCompra) {
		this.carritoDeCompra = carritoDeCompra;
	}

	public void agregarVehiculoCarritoDeCompra(Vehiculo vehiculo) {
		// Verifica si el vehículo ya está en el carrito
		if (!carritoDeCompra.contains(vehiculo)) {
			carritoDeCompra.add(vehiculo);
			System.out.println("Vehículo agregado al carrito de compra.");
		} else {
			System.out.println("El vehículo ya está en el carrito de compra.");
		}
	}

	public String realizarCompra(String direccion, String nombreCliente) {
		if (carritoDeCompra.isEmpty()) {
			return "No hay vehículos en el carrito de compra. Agregue vehículos antes de realizar la compra.";
		} else {
			// Crear una nueva compra
			Compra nuevaCompra = new Compra(direccion, nombreCliente, carritoDeCompra, new Date());

			// Agregar la nueva compra a la lista de compras realizadas
			compras.add(nuevaCompra);

			// Agregar los vehículos de la compra a la lista de vehículos comprados
			vehiculosComprados.addAll(carritoDeCompra);

			//Eliminar de la lista de vehiulos del catalogo los vehiculos comprados y liminar del archivo de texto
			for(Vehiculo v: carritoDeCompra){
				TiendaDeVehiculos.getVehiculos().remove(v);
				GestorArchivosVehiculos.eliminarVehiculo("vehiculos.txt", v.getPatente());
			}
			// Limpiar el carrito de compra después de la compra
			carritoDeCompra.clear();

			//Agrega registro al archivo de texto de compras
			GestorArchivosCompras.guardarDatos(nuevaCompra, "compras.txt");

			return "Compra realizada con éxito. ¡Gracias por su compra!";
		}
	}
}
