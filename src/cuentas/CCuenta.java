package cuentas;



/*
 * CCuenta va a representar una cuenta bancaria con tres metodos 
 * a utilizar, retirar, estado e ingresar, para operar con dicha
 *  cuenta y manipular nuestro saldo.
 * 
 * @author Guille Ortega
 *
 */



public class CCuenta {

	// Aqui declaramos las diferentes variables y sus tipos

    private String nombre;
    private String cuenta;
    private double saldo;
    
    
    public CCuenta()
    {
    }

    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
    }

    /*
     * Método estado
     * 
     * Nos permite consultar la cantidad que alberga nuestra cuenta.
     * 
     */
    
    public double estado()
    {
        return getSaldo();
    }

    
   /* Método ingresar
    * 
    * Este método nos devolverá la cantidad que alberga nuestra cuenta al actualizarse tras añadir 
    * una cantidad que ha de ser positiva.
   */
    
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /*  Método retirar
     * 
     *  En este método nos devoverá la cantidad restante que alberga nuestra cuenta cuando se
     *  retira un cierta cantidad, que ha de ser positiva .
     *  
     */
    
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

    
    /*
     * Creado para la práctica, Encapsulación de atributos CCuenta.
     */
    
    
    // Los privates no se suelen comentar por lo que he podido leer
    
	private String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	private String getCuenta() {
		return cuenta;
	}

	private void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	private double getSaldo() {
		return saldo;
	}

	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}
    
    
    
}
