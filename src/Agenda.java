import java.util.ArrayList;
import java.util.List;


public class Agenda {
    private List<Contacto> contactos;
    private int maxSize;
    public Agenda() {
        this(2);
    }

    public Agenda(int maxSize){
        this.contactos = new ArrayList<>();
        this.maxSize = maxSize;
    }

    public void añadirContacto(Contacto c){
        if (agendaLlena()){
            System.out.println("Espacio insuficiente.");
            return;
        }
        if (existeContacto(c)>0){
            System.out.println("El contacto ya existe.");
            return;
        }
        contactos.add(c);
        System.out.println("El contacto se añadió exitosamente.");
    }

    public int existeContacto( Contacto c) {
        for (int i = 0; i< contactos.size(); i++){
            if (contactos.get(i).getNombre().equals(c.getNombre())) {
            return i;}
        }
        return -1; }

    public boolean agendaLlena(){
        return contactos.size() >= maxSize;
    }

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

    public void buscarContacto(String nombre) {
        int contactoEncontrado = existeContacto(nombre);
        if (existeContacto(c) > 0) {
            System.out.println(nombre.getNombre);
        }

    }
   }










