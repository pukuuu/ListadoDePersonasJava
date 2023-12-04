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

}
