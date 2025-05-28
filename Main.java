
import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
	static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
    	CajeroAutomatico atm = new CajeroAutomatico("Culiacan", "Banorte");
    	Cliente cliente1 = new Cliente(1, "Victor", "Tec de Culiacan");
    	Cliente cliente2 = new Cliente(2, "Alan", "Tec de Culiacan");
    	Cuenta cuenta1 = new Cuenta(cliente1, "Ahorro", "20140131");
    	Cuenta cuenta2 = new Cuenta(cliente2, "Cheques", "20201235");

    	
        System.out.println("----------------------------------------------------");
        System.out.println("Ingrese su Nombre:");
        String Nombre = entrada.nextLine();
        System.out.println("Ingrese su Numero de cuenta:");
        String Num_cuenta = entrada.nextLine();
        if(Nombre.equals(cliente1.nombre) && Num_cuenta.equals(cuenta1.numCuenta)) {
        	System.out.println("===============================================");
        	System.out.println("Bienvenido " + Nombre);
        	int bandera = 0;
            int seleccion = 0;
            do {
                do {
                    System.out.println(" Buenas tardes esta en un cajero automatico de "+ atm.getBanco());
                    System.out.println(" Hoy es " + LocalDateTime.now().toString());
                    System.out.println(" Porfavor seleccione un tipo de cuenta:");
                    System.out.println("    1. Cuenta de ahorro.");
                    System.out.println("    2. Cuenta de cheques.");
                    System.out.println("    3. Salir.");
                    seleccion = entrada.nextInt();

                    if (seleccion >= 1 && seleccion <= 3) {
                        bandera = 1;
                    } else {
                        System.out.println("=================================================");
                        System.out.println("Opción no disponible, vuelva a intentar porfavor.");
                        System.out.println("=================================================");
                    }
                } while (bandera == 0);
                
                if(seleccion == 1){
                	System.out.println("Selecciono cuenta de ahorro.");
                	bandera = 2;
                }else if(seleccion == 2){
                	System.out.println("Selecciono cuenta de cheques.");
                	bandera = 2;
                } else if(seleccion == 3){
                    System.out.println("==========================");
                    System.out.println("Gracias, vuelva pronto.");
                    System.out.println("==========================");
                    bandera = 2;
                } 
            } while (bandera != 2);
        } else {
        	System.out.println("===============================================");
            System.out.println("Alguno de sus datos es erroneo, intente de nuevo");
        	System.out.println("===============================================");
        }
        int bandera = 0;
        int seleccion = 0;
        do {
            System.out.println(" Porfavor seleccione un tipo de transaccion:");
            System.out.println("    1. Retiro.");
            System.out.println("    2. Transferencia.");
            System.out.println("    3. Salir.");
            seleccion = entrada.nextInt();

            if (seleccion >= 1 && seleccion <= 3) {
                bandera = 1;
            } else {
                System.out.println("=================================================");
                System.out.println("Opción no disponible, vuelva a intentar porfavor.");
                System.out.println("=================================================");
            }
        } while (bandera == 0);
        if(seleccion == 1){
        	System.out.println("Selecciono Retiro.");
        	System.out.println("Ingrese el monto a retirar:");
            int monto = entrada.nextInt();
        	atm.Retirar(cuenta1, "Retiro", monto);
        	atm.ImprimirTicket(cliente1);
        	bandera = 2;
        	 System.out.println("==========================");
             System.out.println("Gracias, vuelva pronto.");
             System.out.println("==========================");
        }else if(seleccion == 2){
        	System.out.println("Selecciono Transferencia.");
        	System.out.println("Ingrese el monto a transferir:");
            int monto = entrada.nextInt();
        	atm.Transferir(cuenta1, cuenta2, "Transferencia", monto);
        	atm.ImprimirTicket(cliente1);
        	bandera = 2;
        	 System.out.println("==========================");
             System.out.println("Gracias, vuelva pronto.");
             System.out.println("==========================");
        } else if(seleccion == 3){
            System.out.println("==========================");
            System.out.println("Gracias, vuelva pronto.");
            System.out.println("==========================");
            bandera = 2;
        } 
    }
    public String getNombre(){
        return getNombre();
    }
}

