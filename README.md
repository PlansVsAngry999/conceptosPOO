# conceptosPOO
CÓDIGO ABSTRACCIÓN:
          	//Ejemplo de abstracción con una clase "Auto".
          abstract class Auto{
          	String marca;
          	String modelo;
          		//Constructor.
          	public Auto(String marca, String modelo){
          		this.marca = marca;
          		this.modelo = modelo;
          	}
          		//Método abstraido para obtener informacion básica del auto.
          	public String obtenerInformacion(){
          		return "Marca: "+ marca + "n/ Modelo: " + modelo;
          	}
          }
          	//Uso de la abstracción.
          public class Main{
          	public static void main(String[] args){
          		Auto miAuto = new Auto("Poyota", "Corolla"){};
          		System.out.println(miAuto.obtenerInformacion());
          	}
          }

CÓDIGO ENCAPSULAMIENTO:
          	//Ejemplo de encapsulación con una clase "CuentaBancaria".
          abstrac class CuentaBancaria{
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
          public class main{
          	public static void main(String[] args){
          		CuentaBancaria miCuenta = new CuentaBancaria("Fulano de Tal", 1000){};
          		miCuenta.depositar(500);
          		miCuenta.retirar(200);
          		System.out.println("Saldo actual: " + miCuenta.obtenerSaldo());
          	}
          }
CÓDIGO HERENCIA:
          	//Ejemplo de herencia con las clases "Vehículo" y "Automovil".
          abstract class Vehiculo{
          	protect String marca;
          	public Vehiculo(String marca){
          		this.marca = marca;
          	}	
          	public void arrancar(){
          		System.out.println("Arrancando el vehiculo");
          	}
          }
          	//Clase derivada que hereda la de 'Vehiculo'.
          abstrac class Automovil extends Vehiculo{
          	private String modelo;
          	public Automovil(String marca, String modelo){
          		super(marca);
          		this.modelo = modelo;
          	}
          	public void conducir(){
          		System.out.println("Counduciendo el automóvil");
          	}
          }
          	//Uso de la herencia
          public class main{
          	public static void main(String[] args){
          		Automovil miAuto = new Automovil("Toyota","Corolla"){};
          		miAuto.arrancar();
          		miAuto.conducir();
          	}
          }

CÓDIGO POLIMORFISMO:
          	//Ejemplo de polimorfismo con una interfaz 'Sonido'.
          interface Sonido{
          	void hacerSonido();
          }
          	//Clases que implementan la interfaz Sonido.
          class Perro implements Sonido{
          	public void hacerSonido(){
          		System.out.println("El perro ladra");
          	}
          }
          class Gato implements Sonido{
              public void hacerSonido(){
          		System.out.println("El gato maulla");
          	}
          }
          	//Uso del polimorfismo con la interfaz sonido.
          public class main{
          	public statis void main(String[] args){
          		Sonido miMascota = new Perro();
          		miMascota.hacerSonido();
                //Agregar al objeto atributos de la clase 'gato'.
          		miMascota = new Gato();
          		miMascota.hacerSonido();
          	}
          }
