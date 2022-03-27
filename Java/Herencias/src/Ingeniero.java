public class Ingeniero extends Persona implements IEmpleado {

    public Ingeniero() {
    }

    @Override
    public void trabaja() {
        System.out.println("---------------------------");
        System.out.println(this.getNombre() + "Esta trabajando de ingeniero");
        System.out.println("Está ganando" + SALARIO_I);
    }
}
