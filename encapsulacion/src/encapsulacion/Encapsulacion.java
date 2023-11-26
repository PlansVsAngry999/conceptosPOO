package encapsulacion;
/**
 * Programa que ejemplifica la encapsulación. 
 * @author Ricardo Daniel Hernández Sosa (PlansVsAngry999).
 */
    abstract class CuentaBancaria{
        private String titular;
        private double saldo;
            //Constructor.
        public CuentaBancaria(String titular, double saldoInicial){
            this.titular = titular;
            this.saldo = saldoInicial;
        }
            //Método público para realizar un deposito.
        public void depositar(double monto){
            saldo += monto;
        }
            //Método público para realizar un retiro.
        public void retirar(double monto){
            if(monto <= saldo){
                saldo -= monto;
            }else{
                System.out.println("Saldo insuficiente");
            }
        }
            //Método público para obtener saldo.
        public double obtenerSaldo(){
            return saldo;
    }
}
        //Uso de la encapsulación.
public class Encapsulacion{    
    public static void main(String[] args) {
        CuentaBancaria miCuenta = new CuentaBancaria("Fulano de Tal", 1000){};
        miCuenta.depositar(500);
        miCuenta.retirar(200);
        System.out.println("Saldo actual: " + miCuenta.obtenerSaldo());
    }
        
}
