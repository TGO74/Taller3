package Principal;

public class Menu {
	private TiendaDeVehiculos tienda;
	private Object attribute;

	public TiendaDeVehiculos getTienda() {
		return this.tienda;
	}

	public void setTienda(TiendaDeVehiculos tienda) {
		this.tienda = tienda;
	}

	public void getAttribute() {
		return this.attribute;
	}

	public void setAttribute(Object attribute) {
		this.attribute = attribute;
	}
}