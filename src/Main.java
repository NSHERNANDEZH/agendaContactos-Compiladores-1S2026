import java.util.HashSet;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        sn.useDelimiter("\n");
        Agenda agenda = new Agenda(sn);
        HashSet<Contacto> contactosHash = new HashSet<>();

        boolean salir = false;
        while (!salir) {
            System.out.println("Bienvenido a su agenda de contactos");
            System.out.println("Ingrese una de las siguientes opciones");
            System.out.println("1. Agregar contacto");
            System.out.println("2. Eliminar contacto");
            System.out.println("3. Modificar contacto");
            System.out.println("4. Ver lista de contactos");
            System.out.println("5. Salir");
            int opc = sn.nextInt();
            switch (opc) {
                case 1:
                    agenda.agregarContacto();
                    break;
                case 2:

                    break;
                case 3:
                    break;
                case 4:
                    agenda.mostrarContactos();

                    break;
                case 5:
                    salir = true;
                    System.out.println("Orale");
                    break;
                default:
                    System.out.println("Opción inválida");
            }

        }

        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.








    }
}