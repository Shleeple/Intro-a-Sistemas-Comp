public class Licenciado extends Persona implements IEmpleado {

    public Licenciado() {
    }

    
    @Override
    public void trabaja() {
        System.out.println("---------------------------");
        System.out.println(this.getNombre() + "Esta trabajando de licenciado");
        System.out.println("Está ganando" + SALARIO_L);
    }
}
