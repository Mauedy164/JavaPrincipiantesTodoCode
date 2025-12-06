
package bancogemini;



public abstract class CuentaBancaria {
    
    private String titular;
    protected double saldo;
    private int numeroCuenta;
    
    public CuentaBancaria() {
    }

    public CuentaBancaria(String titular, double saldo, int numeroCuenta) {
        this.titular = titular;
        this.saldo = saldo;
        this.numeroCuenta = numeroCuenta;
    }
    
    // Getters y Setters

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    
    public void depositar(double cantidad){
        if (cantidad > 0){
            saldo += cantidad;
            System.out.println("El nuevo saldo es de: " + saldo);
        }
        else if (cantidad <= 0){
            System.out.println("Error: Cantidad no válida. Ingresa una cantidad mayor a cero");
        }
    }
    
    public void retirar(double cantidad){
        if (cantidad > saldo){
            System.out.println("Saldo insuficiente"); 
        } else if (cantidad<=0){
            System.out.println("Error: Cantidad no válida. Ingresa una cantidad mayor a cero");
        } else {
            saldo-=cantidad;
            System.out.println("Retiraste $"+cantidad+". Tu saldo actual es: $" + saldo);
        }
    }
    
    public abstract void imprimirInfo();
}
