public class Alumno {
    private String nombre;
    private String apellido;
    private String telefono;
    private String correoElectronico;
    private double nota1;
    private double nota2;
    private double nota3;
    private double asistencia;
    private double finales;
    private double notaTotal;
    private String calificacionCualitativa;

    public Alumno(String nombre, String apellido, String telefono, String correoElectronico,
                  double nota1, double nota2, double nota3, double asistencia, double finales) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.asistencia = asistencia;
        this.finales = finales;
        calcularNotaTotal();
        calcularCalificacionCualitativa();
    }

    private void calcularNotaTotal() {
        this.notaTotal = (nota1 * 0.2) + (nota2 * 0.2) + (nota3 * 0.2) + (asistencia * 0.1) + (finales * 0.3);
    }

    private void calcularCalificacionCualitativa() {
        if (notaTotal >= 5 && notaTotal < 8) {
            this.calificacionCualitativa = "Aprobado";
        } else if (notaTotal >= 8 && notaTotal < 10) {
            this.calificacionCualitativa = "Notable";
        } else if (notaTotal == 10) {
            this.calificacionCualitativa = "Sobresaliente";
        } else {
            this.calificacionCualitativa = "No Aprobado";
        }
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public double getNotaTotal() {
        return notaTotal;
    }

    public String getCalificacionCualitativa() {
        return calificacionCualitativa;
    }
}
