package model;

import java.util.List;

public class Ramo {

    private String codigo;
    private String nombre;
    private List<Inscripcion> inscripciones;

    public Ramo(String codigo, String nombre, List<Inscripcion> inscripciones) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.inscripciones = inscripciones;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean inscribirEstudiante(Estudiante estudiante) {
        for (Inscripcion inscripcion : inscripciones) {
            if (inscripcion.getEstudiante().getRut().equals(estudiante.getRut())) {
                return false; // El estudiante ya está inscrito
            }
        }
        inscripciones.add(new Inscripcion(estudiante));
        return true; // Inscripción exitosa
    }

    @Override
    public String toString() {
        return "Ramo ["+ codigo +"] " + nombre;
    }

}