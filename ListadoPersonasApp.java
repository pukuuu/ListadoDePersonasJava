import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListadoPersonasApp {
    public static void main(String[] args){
        Scanner consola = new Scanner(System.in);
        //definir lista fuera del while
        List<Persona> personas = new ArrayList<>();

        var salir = false;
        while(!salir){
            mostrarMenu();
            try{
                salir = ejecutarOperacion(personas, consola);
            }
            catch(Exception e){
                System.out.println("Ocurrio un error: "+e.getMessage());
            }
        }
    }




    private static void mostrarMenu() {
        System.out.println("""
                **** Listado Personas App ****
                1. Agregar
                2. Listar
                3. Salir
                """);
        System.out.print("Proporciona una opcion: ");

    }


    private static boolean ejecutarOperacion(List<Persona> personas, Scanner consola) {
        var opcion = Integer.parseInt(consola.nextLine());
        var salir = false;

        switch (opcion){
            case 1 -> { //Agregar persona a la lista
                System.out.print("Proporciona el nombre: ");
                var nombre = consola.nextLine();
                System.out.print("Proporciona el telefono: ");
                var telefono = consola.nextLine();
                System.out.print("Proporciona el email: ");
                var email = consola.nextLine();
                // crear el objeto Persona
                var persona = new Persona(nombre, telefono, email);
                // lo agregamos a la lista
                personas.add(persona);
                System.out.println("La lista tiene: "+personas.size()+" personas");
            } //fin caso 1

            case 2 -> {
                if (personas.isEmpty()){
                    System.out.println("Lista vacia");
                }
                else{
                    //personas.forEach((persona) -> System.out.println(persona))      Opcion 1
                    //personas.forEach(System.out::println);                          Opcion 2
                    personas.forEach(System.out::println);
                }

            }
            case 3 -> {
                System.out.println("Hasta pronto...");
                salir = true;
            }

            default -> {
                System.out.println("Opcion erronea "+opcion);
            }

        }//fin switch
        return salir;
    }
}
