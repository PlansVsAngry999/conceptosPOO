package abstraccion;
/**
 * Programa que ejemplifica la abstracción de una clase.
 * @author Ricardo Daniel Hernández Sosa (PlansVsAngry999).
 */
abstract class Auto{
    String marca;
    String modelo;
    //Constructor
    public Auto(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
    }
    //Método abtraido para obtener informacion básica del auto.
    public String obtenerInformacion(){
        return "Marca: " + marca + "n/ Modelo: " + modelo;
    }
}
public class Abstraccion {
    public static void main(String[] args) {
        Auto miAuto = new Auto("Poyota", "Corolla"){};
        System.out.println(miAuto.obtenerInformacion());
    }
    
}
