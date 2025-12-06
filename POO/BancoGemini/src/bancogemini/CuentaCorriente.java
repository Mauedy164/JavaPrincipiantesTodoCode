
package bancogemini;

public class CuentaCorriente extends CuentaBancaria{
    private double limiteSobregiro;

    public CuentaCorriente(double limiteSobregiro) {
        this.limiteSobregiro = limiteSobregiro;
    }

    public CuentaCorriente(String titular, double saldo, int numeroCuenta, double limiteSobregiro) {
        super(titular, saldo, numeroCuenta);
        this.limiteSobregiro = limiteSobregiro;
    }

    @Override
    public void retirar(double cantidad) {
        
        
        if (cantidad<= (saldo+limiteSobregiro)){
            saldo -= cantidad;
            if (saldo >=0){
                System.out.println("Retiro exitoso. Nuevo saldo: $" + saldo);
            }
            else{
                System.out.println("Retiro exitoso (con sobregiro). Nuevo saldo: $" + saldo);
            }
        }
        else{
            System.out.println("Fondos insuficientes (incluso con sobregiro)");
        }
    }

    @Override
    public void imprimirInfo() {
        System.out.println("Cuenta Corriente - Titular: "+ getTitular() + 
                " Saldo: $" + getSaldo() + 
                " Limite: " + limiteSobregiro);
    }
 
}
