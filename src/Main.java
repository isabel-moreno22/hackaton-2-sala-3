import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Agenda agenda = new Agenda();

        while (true){
            System.out.println("Bienvenido a tu Agenda de Contactos");
            System.out.println("1. Añadir contacto.");
            System.out.println("2. Buscar contacto");
            System.out.println("3. Ver lista de contactos");
            System.out.println("4. Eliminar contacto");
            System.out.println("5. Verificar si la agenda está llena");
            System.out.println("6. Ver espacio libre");
            System.out.println("7. Salir");
            System.out.println("Seleccione una opción con el número: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); //limpiar Buffer

        switch (opcion){
            case 1:
                System.out.println("Ingrese el nombre del contacto: ");
                String nombre = scanner.nextLine();
                System.out.println("Ingrese el número del contacto: ");
                String telefono = scanner.nextLine();
                Contacto nuevoContacto = new Contacto(nombre, telefono);
                agenda.añadirContacto(nuevoContacto);
                break;
            case 2:
                System.out.println("En proceso");
                break;
            case 3:

                agenda.listarContacto();
                break;


        }

        }
    }


}