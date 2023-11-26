package herencia;

/**
 *  Programa que ejemplifica la herencia.
 * @author Ricardo Daniel Hernández Sosa (PlansVsAngry999).
 */
//Ejemplo de herencia con las clases "Vehículo" y "Automovil".
    abstract class Vehiculo{
        protected String marca;
        public Vehiculo(String marca){
            this.marca = marca;
        }	
        public void arrancar(){
            System.out.println("Arrancando el vehiculo");
        }
    }
        //Clase derivada que hereda la de 'Vehiculo'.
    abstract class Automovil extends Vehiculo{
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
public class Herencia{
    public static void main(String[] args) {
        Automovil miAuto = new Automovil("Renault","Clio"){};
        miAuto.arrancar();
        miAuto.conducir();
    }
}
