/**
 *
 * @author juanj
 */
public class Herencias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ingeniero inge = new Ingeniero();
        Licenciado lic = new Licenciado();
        
        inge.setNombre("Juna Pérez ");
        inge.trabaja();
        
        lic.setNombre("Ana Gualito");
        lic.trabaja();
    }
    
}
