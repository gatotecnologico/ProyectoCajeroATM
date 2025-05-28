import java.time.LocalDateTime;
import java.util.Random;

public class CajeroAutomatico {
	private String localizacion, banco, fecha, tipo;
	private int idTrans, monto;
	CajeroAutomatico (String localizacion, String banco) {
		this.localizacion = localizacion;
		this.banco = banco;
	}
	
	public void Retirar(Cuenta cuenta, String tipo, int monto) {
		Random random = new Random();
		idTrans = random.nextInt(99999 - 10000 + 1) + 10000;
		fecha = LocalDateTime.now().toString();
		this.tipo = tipo;
		this.monto = monto;
	}
	
	public void Transferir(Cuenta cuentaOrigen,Cuenta cuentaDestino, String tipo, int monto) {
		Random random = new Random();
		idTrans = random.nextInt(99999 - 10000 + 1) + 10000;
		fecha = LocalDateTime.now().toString();
		this.tipo = tipo;
		this.monto = monto;
	}
	
	public void ImprimirTicket(Cliente cliente) {
		System.out.println("----------------------------------------------------");
		System.out.println("Cliente:"+ cliente.nombre + " ID:" + cliente.id + " Direccion:" + cliente.direccion);
		System.out.println("Banco: " + banco + ", Tipo de transaccion:" + tipo);
		System.out.println("Monto: " + monto);
	}
	
	public String getLocalizacion() {
		return localizacion;
	}
	public void setLocalizacion(String localizacion) {
		this.localizacion = localizacion;
	}
	public String getBanco() {
		return banco;
	}
	public void setBanco(String banco) {
		this.banco = banco;
	}
	
}
