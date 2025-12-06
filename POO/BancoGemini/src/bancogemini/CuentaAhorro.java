
package bancogemini;

public class CuentaAhorro extends CuentaBancaria {
    private double tasaInteres;

    public CuentaAhorro(double tasaInteres) {
        this.tasaInteres = tasaInteres;
    }

    public CuentaAhorro(String titular, double saldo, int numeroCuenta, double tasaInteres) {
        super(titular, saldo, numeroCuenta);
        this.tasaInteres = tasaInteres;
    }

    public double getTasaInteres() {
        return tasaInteres;
    }

    public void setTasaInteres(double tasaInteres) {
        this.tasaInteres = tasaInteres;
    }
    
    public double calcularInteres(){
        double interesGanado = getSaldo() * tasaInteres;
        return interesGanado;
    }

    @Override
    public void imprimirInfo() {
        System.out.println("Cuenta Ahorro - Titular: "+ getTitular() + 
                " Saldo: $" + getSaldo() + 
                " Tasa: " + tasaInteres);
    }
    
}
