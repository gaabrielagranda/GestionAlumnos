import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GestorAlumno gestorAlumnos = new GestorAlumno();

        while (true) {
            System.out.println("Menú:");
            System.out.println("1. Agregar alumno");
            System.out.println("2. Mostrar alumnos");
            System.out.println("3. Eliminar alumno");
            System.out.println("4. Salir");
            System.out.print("Ingrese la opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer de entrada

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del alumno: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese el apellido del alumno: ");
                    String apellido = scanner.nextLine();
                    System.out.print("Ingrese el teléfono del alumno: ");
                    String telefono = scanner.nextLine();
                    System.out.print("Ingrese el correo electrónico del alumno: ");
                    String correo = scanner.nextLine();
                    System.out.print("Ingrese la nota 1 del alumno: ");
                    double nota1 = scanner.nextDouble();
                    System.out.print("Ingrese la nota 2 del alumno: ");
                    double nota2 = scanner.nextDouble();
                    System.out.print("Ingrese la nota 3 del alumno: ");
                    double nota3 = scanner.nextDouble();
                    System.out.print("Ingrese la asistencia del alumno por días: ");
                    double asistencia = scanner.nextDouble();
                    System.out.print("Ingrese la nota media de los finales del alumno: ");
                    double finales = scanner.nextDouble();

                    Alumno alumno = new Alumno(nombre, apellido, telefono, correo, nota1, nota2, nota3, asistencia, finales);
                    gestorAlumnos.agregarAlumno(alumno);
                    System.out.println("Alumno agregado correctamente.");
                    break;
                case 2:
                    gestorAlumnos.mostrarAlumnos();
                    break;
                case 3:
                    System.out.print("Ingrese el índice del alumno a eliminar: ");
                    int indiceEliminar = scanner.nextInt();
                    gestorAlumnos.eliminarAlumno(indiceEliminar - 1);
                    System.out.println("Alumno eliminado correctamente.");
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }
}
