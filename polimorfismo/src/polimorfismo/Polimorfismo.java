package polimorfismo;
/**
 * Programa que ejemplifica el polimorfismo.
 * @author Ricardo Daniel Hernández Sosa (PlansVsAngry999).
 */
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
public class Polimorfismo {
    public static void main(String[] args) {
        Sonido miMascota = new Perro();
        miMascota.hacerSonido();
        //Agregar al objeto atributos de la clase 'gato'.
        miMascota = new Gato();
        miMascota.hacerSonido();
    }
    
}
