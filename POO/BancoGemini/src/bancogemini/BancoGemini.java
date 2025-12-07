
package bancogemini;


public class BancoGemini {


    public static void main(String[] args) {
        
        
        /*cuenta.depositar(200);
        System.out.println(cuenta.getSaldo());
        cuenta.retirar(1000);
        System.out.println(cuenta.getSaldo());
        cuenta.retirar(100);
        System.out.println(cuenta.getSaldo());*/
        
        
        /*CuentaAhorro ahorro = new CuentaAhorro("Maria Lopez", 1000, 555, 0.15);
        ahorro.depositar(200);
        System.out.println("Interes a ganar: $" + ahorro.calcularInteres());*/
        
        

        /*System.out.println("\n--- Probando Polimorfismo (Cuenta Corriente) ---");
        // 1. Creamos la cuenta corriente con 1000 de saldo y 500 de sobregiro
        CuentaCorriente miCorriente = new CuentaCorriente("Pedro", 1000, 999, 500);

        // 2. Retiramos 1200 (Más de lo que tiene, pero dentro del sobregiro)
        miCorriente.retirar(1200); 

        // Si fuera una CuentaBancaria normal, diría "Saldo insuficiente".
        // Pero como es CuentaCorriente, te dejará sacar y quedarás en -200.*/
        /*
        CuentaAhorro ahorro = new CuentaAhorro("Maria Lopez", 1000, 555, 0.15);
        ahorro.imprimirInfo();
        
        CuentaCorriente corriente = new CuentaCorriente("Maria Lopez", 1000, 555, 300);
        corriente.imprimirInfo();
        */
        
        CuentaCorriente corriente = new CuentaCorriente("Maria Lopez", 1000, 555, 300);
        System.out.println("\n--- Probando Interfaz ---");
        // Como 'corriente' fue creada como CuentaCorriente, tiene acceso al método de la interfaz
        corriente.emitirCheque(500, "Escuela de Java");
        
        // PRUEBA DE FUEGO:
        // Si intentas escribir: ahorro.emitirCheque(...); 
        // NetBeans te marcará error. ¡Eso es correcto! Las cuentas de ahorro no tienen chequera.
        corriente.imprimirInfo(); // Para ver que el saldo bajó
        
    }
    
}
