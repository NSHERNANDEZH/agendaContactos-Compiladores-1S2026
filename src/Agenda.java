import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

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
        System.out.println("Ingrese telefono de contacto (Sin espacios ni guíon)");
        String telefono = sn.next();

        Contacto nuevo = new Contacto(nombre, telefono);

        if (contactos.add(nuevo) && validarTelefono(nuevo.getTelefono()) && validarCorreo(nuevo.getEmail())) {
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

    //Metodo para validar que el numero de telefono solo tenga 8 digitos
    private boolean validarTelefono(String telefono){
        if(telefono.matches("[0-9]{8}")){
            System.out.println("Telefono invalido");
        }
        return telefono.matches("[0-9]{8}");
        //Tambien es funcional el: return telefono.matches("\\d{8}");
    }

    //Metodo para validar un correo electronico
    private boolean validarCorreo(String correo){
        if(correo.matches("\\w+@\\w+\\.\\w+")){
            System.out.println("Correo invalido");
        }
        return correo.matches("\\w+@\\w+\\.\\w+");
    }
}


