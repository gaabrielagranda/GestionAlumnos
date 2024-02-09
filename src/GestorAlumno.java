import java.util.ArrayList;

public class GestorAlumno {
    private ArrayList<Alumno> listaAlumnos;

    public GestorAlumno() {
        this.listaAlumnos = new ArrayList<>();
    }

    public void agregarAlumno(Alumno alumno) {
        listaAlumnos.add(alumno);
    }

    public void eliminarAlumno(int indice) {
        if (indice >= 0 && indice < listaAlumnos.size()) {
            listaAlumnos.remove(indice);
        }
    }

    public Alumno obtenerAlumno(int indice) {
        if (indice >= 0 && indice < listaAlumnos.size()) {
            return listaAlumnos.get(indice);
        }
        return null;
    }

    public void actualizarAlumno(int indice, Alumno alumno) {
        if (indice >= 0 && indice < listaAlumnos.size()) {
            listaAlumnos.set(indice, alumno);
        }
    }

    public void mostrarAlumnos() {
        for (int i = 0; i < listaAlumnos.size(); i++) {
            Alumno alumno = listaAlumnos.get(i);
            System.out.println("Alumno " + (i + 1) + ":");
            System.out.println("Nombre: " + alumno.getNombre());
            System.out.println("Apellido: " + alumno.getApellido());
            System.out.println("Teléfono: " + alumno.getTelefono());
            System.out.println("Correo electrónico: " + alumno.getCorreoElectronico());
            System.out.println("Nota Total: " + alumno.getNotaTotal());
            System.out.println("Calificación Cualitativa: " + alumno.getCalificacionCualitativa());
            System.out.println("--------------------");
        }
    }
}
