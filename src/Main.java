import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Agenda agenda = new Agenda();


        while (true){
            // Mostrar el menú
            System.out.println("------------------------------------------");
            System.out.println("Bienvenido a tu Agenda de Contactos");
            System.out.println("1. Añadir contacto.");
            System.out.println("2. Buscar contacto");
            System.out.println("3. Ver lista de contactos");
            System.out.println("4. Eliminar contacto");
            System.out.println("5. Verificar si la agenda está llena");
            System.out.println("6. Ver espacio libre");
            System.out.println("7. Salir");
            System.out.println("------------------------------------------");
            System.out.print("Seleccione una opción con el número: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); //limpiar Buffer


        switch (opcion){
            case 1:
                System.out.print("Ingrese el nombre del contacto: ");
                String nombre = scanner.nextLine();
                System.out.print("Ingrese el número del contacto: ");
                String telefono = scanner.nextLine();
                Contacto nuevoContacto = new Contacto(nombre, telefono);
                agenda.añadirContacto(nuevoContacto);
                break;
            case 2:
                System.out.print("ingrese el nombre del contacto a buscar: ");
                String nombreBuscar = scanner.nextLine();
                agenda.buscarContacto(nombreBuscar);

                break;
            case 3:
                agenda.listarContacto();
                break;
            case 4:
                System.out.print("ingrese el nombre del contacto a eliminar: ");
                String nombreEliminar = scanner.nextLine();
                agenda.eliminarContacto(new Contacto(nombreEliminar, ""));;
                break;
            case 5:
                if (agenda.agendaLlena()){
                    System.out.println("Tu agenda esta llena.");
                }else {
                    System.out.println("Tu agenda no esta llena, aún tienes: " + agenda.espaciosDisponibles() + " espacios disponibles");
                }
                break;
            case 6:
                System.out.println("Tienes " + agenda.espaciosDisponibles() + " espacios disponibles");
                break;
            case 7:
                System.out.println("Has salido de tu agenda de contactos.");
                scanner.close();
                System.exit(0);
                break;
            default:
                System.out.print("selecciona una opcion correcta: ");
        }

        }
    }


}