package cuentas;

/*
 * Clase Main en la cual hay un método en el que instanciamos una cuenta y se realiza una prueba 
 * con un try para el método retirar, otro para el ingresar y sus respectivas excepciones.
 *  
 * 
 * @author Guille Ortega.
 */
public class Main {
	
	
	// Añadido acausa de la refactorización del apartado 1,e).
	
	public static void main(String[] args) {
        operativa_cuenta();
    }
   //Cuenta operativa Ejemplo 1.
	
	private static void operativa_cuenta() {
		
		// cuenta1 debido a la refactorización del apartado 1b).
		CCuenta cuenta1;
        double saldoActual;

        // Se consulta el saldo actual.
        cuenta1 = new CCuenta("Antonio LÃ³pez","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );

        // Try 1 retirar + exepción.
        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        
        // Try 2 ingresar + excepción.
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
	}

}
