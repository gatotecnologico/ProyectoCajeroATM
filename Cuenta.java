
public class Cuenta {
	Cliente cliente;
	String tipo, numCuenta;
	Cuenta(Cliente cliente, String tipo, String numCuenta) {
		this.cliente = cliente;
		this.tipo = tipo;
		this.numCuenta = numCuenta;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getNumCuenta() {
		return numCuenta;
	}
	public void setNumCuenta(String numCuenta) {
		this.numCuenta = numCuenta;
	}
	
}
