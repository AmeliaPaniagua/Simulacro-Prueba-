package colegio;
//comentario

import java.util.Date;

/**Clase para gestionar las matrículas.
 * 
 * Esta clase se ha creado para gestionar las matrículas de los alumnos
 * 
 * @author Amelia
 * @version v1.0
 */
public final class AlumnoESO extends Alumno {

    /**Constructor sin parámetros
     * 
     */
    public AlumnoESO() {
        super();
    }

    /**Constructor con el nombre y los apellidos
     * 
     * @param nombre        Nombre del alumno   
     * @param apellidos     Apellidos del alumno
     */
    public AlumnoESO(String nombre, String apellidos) {
        super(nombre, apellidos);
    }

    /**Constructor con el nombre
     * 
     * @param nombre        Nombre del alumno
     * @param apellidos     Apellidos del alumno
     * @param nacimiento    Fecha de nacimiento del alumno
     * @param notas         Notas del alumno
     */
    public AlumnoESO(String nombre, String apellidos, Date nacimiento, int[] notas) {
        super(nombre, apellidos, nacimiento, notas);
    }

    /**Método que devuelve el nombre del padre del alumno
     * 
     * @return nombrePadre  Nombre del Padre
     */
    public String getNombrePadre() {
        return nombrePadre;
    }
    /** Método para modificar el nombre del padre del alumno
     * 
     * @param nombrePadre   Nombre del padre del alumno
     */
    public void setNombrePadre(String nombrePadre) {
        this.nombrePadre = nombrePadre;
    }
    /**Método que devuelve el nombre de la madre del alumno
     * 
     * @return nombreMadre  Nombre de la madre
     */
    public String getNombreMadre() {
        return nombreMadre;
    }
    /** Método para modificar el nombre de la madre del alumno
     * 
     * @param nombreMadre   Nombre de la madre del alumno
     */
    
    public void setNombreMadre(String nombreMadre ){
        this.nombreMadre = nombreMadre;
    }
    
    public String getNombreHermano() {
        return nombreHermano;
    }
        
    public void setNombreHermano(String nombreHermano) {
        this.nombreHermano = nombreHermano;
    }
    private String nombrePadre;
    private String nombreMadre;
    private String nombreHermano;	
    
    /** Método para matricular a un alumno
     * 
     * @param curso     Curso al cual queremos matricular el alumno
     */
    @Override
    public void matricular(Curso curso) {
        if ( curso == Curso.ESO1 || curso == Curso.ESO2 || curso == Curso.ESO3 || curso == Curso.ESO4)
            this.curso = curso;
    }
    /** Método para desmatricular a los alumnos
     * 
     */
    @Override
    public void desmatricular() {
        if (curso != null)
            this.curso = null;
    }

  
}