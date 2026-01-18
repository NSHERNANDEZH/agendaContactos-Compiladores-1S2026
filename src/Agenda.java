import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;


public class Agenda {
    Scanner sn;

    public Agenda(Scanner sn) {
        this.sn = sn;
        contactos = new ArrayList<>();
    }

    ArrayList<Contacto> contactos;



    void agregarContacto() {
        System.out.println("Ingrese nombre de contacto");
        String nombre = sn.next();
        System.out.println("Ingrese telefono de contacto");
        int telefono = Integer.parseInt(sn.next());

        Contacto nuevo = new Contacto(nombre, telefono);

        if (contactos.add(nuevo)) {
            System.out.println("Contacto agregado exitosamente");
        }
        else {
            System.out.println("Contacto no agregado");
        }
    }
    void eliminarContacto(Contacto contacto) {
        contactos.remove(contacto);
    }
    void mostrarContactos() {
        for (Contacto contacto : contactos) {
            System.out.println(contacto);
        }
    }

}


