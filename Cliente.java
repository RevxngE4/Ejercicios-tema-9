public class Cliente extends Persona{
    private int credito;
      public Cliente(int edad, String nombre, int telefono, int credito){
          this.setEdad(edad);
          this.setNombre(nombre);
          this.setTelefono(telefono);
          this.credito = credito;
      }


    public int getCredito() {
        return credito;
    }

    public void setCredito(int credito) {
        this.credito = credito;
    }
}
