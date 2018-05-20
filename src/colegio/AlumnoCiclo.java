package colegio;

import java.util.Date;
//prueba 20/05/2018
public final class AlumnoCiclo extends Alumno {

    public AlumnoCiclo() {
        super();
    }

    public AlumnoCiclo(String nombre, String apellidos) {
        super(nombre, apellidos);
    }

    public AlumnoCiclo(String nombre, String apellidos, Date nacimiento, int[] notas) {
        super(nombre, apellidos, nacimiento, notas);
    }
      
    @Override
    public void matricular(Curso curso) {
        if ( curso == Curso.SMR1 || curso == Curso.SMR2 || curso == Curso.ASIR1 || curso == Curso.ASIR2)
            this.curso = curso;
    }

    @Override
    public void desmatricular() {
        if (curso != null)
            this.curso = null;
    }

  
}
