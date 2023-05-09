public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente(19,"Camilo", 34352325, 424234342);
        System.out.println("Los datos son = " + cliente.getNombre() + ", " +  cliente.getEdad() + ", " + cliente.getTelefono() + ", " + cliente.getCredito() +" $");
        Trabajador trabajador = new Trabajador(20, "Andres", 243525352, 43253252);
        System.out.println("Los datos son = " + trabajador.getNombre() + ", " +  trabajador.getEdad() + ", " + trabajador.getTelefono() + ", " + trabajador.getSalario() +" $");
    }
}