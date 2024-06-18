import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<Contacto> contactos;
    private int maxSize;

    //constrauctor Vacio
    public Agenda() {
        this(10);
    }

    //constrauctor
    public Agenda(int maxSize){
        this.contactos = new ArrayList<>();
        this.maxSize = maxSize;
    }


    // ------------- Métodos --------------

    // Añadir un nuevo contacto
    public void añadirContacto(Contacto c){
        if (agendaLlena()){
            System.out.println("Espacio insuficiente.");
            return;
        }
        if (existeContacto(c)){
            System.out.println("El contacto ya existe.");
            return;
        }
        contactos.add(c);
        System.out.println("El contacto: " + c.getNombre() + " " + c.getTelefono() + " se añadió exitosamente");
        System.out.println("Tienes " + espaciosDisponibles() + " espacios disponibles");
    }

    // Validar si un contacto ya existe
    public boolean existeContacto( Contacto c) {
        return contactos.contains(c);
    }

    // listar contactos existentes
    public void listarContacto() {
        if (contactos.isEmpty()){
            System.out.println("Tu agenda está vacía");
        } else {
            System.out.println("Tu lista de contactos es: ");
            int contador = 0;
            for (Contacto contacto : contactos) {
                contador ++;
                System.out.println(contador + ". " + contacto.getNombre() + " : " + contacto.getTelefono());
            }
        }
    }

    // buscar un contacto
    public void buscarContacto(String nombre) {
        Contacto contactoBuscado = new Contacto(nombre, "");

        if (!existeContacto(contactoBuscado)){
            System.out.println("Contacto no encontrado");
            return;
        }

        for (Contacto contacto : contactos) {
            if (contacto.getNombre().equals(nombre)) {
                System.out.println("Contacto encontrado, el numero de telefono es: " + contacto.getTelefono());
                return;
            }
        }
    }

    // eliminar un contacto
    public void eliminarContacto(Contacto c) {
        if (!existeContacto(c)){
            System.out.println("Contacto no encontrado");
            return;
        }

        contactos.remove(c);
        System.out.println("El contacto " + c.getNombre() + " ha sido eliminado");
    }

    // validar si la agenda ya está llena
    public boolean agendaLlena(){
        return contactos.size() >= maxSize;
    }

    // validar los espacios disponibles en la agenda
    public int espaciosDisponibles(){
        return maxSize - contactos.size();
    }

   }










