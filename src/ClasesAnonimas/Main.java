package ClasesAnonimas;

public class Main {
    public static void main(String[] args) {
        Animal perro = new Animal() { // clase anonima, las llaves delimitan la clase

            @Override
            public void hacerSonido() {
                System.out.println("Guau xd jaja (Es un ladrido)");
            }
        }; // se agrega ';' para delimitar la clase anonima

        perro.hacerSonido();// Java sabe automaticamente que se implementa la interfaz y la clase anonima que sobreescribio ese metodo

        // clase anonima que hereda de otra clase
        //Vehiculo auto =
        new Vehiculo() {

            private int numPasajeros;

            public void manejar(){
                System.out.println("Aca andamos manejando che");
            }
        }.manejar(); //aqui se puede hacer uso con el '.' como siu dfuera un objeto de la clase anonima

        // auto.manejar(); //si la clase anonima tiene un metodo manejar,  y la clase principal no, por que no hayb algun override, y no sabe o no conoce ese metodo
    }
}
