package model;

public class Profesor extends Persona {
    
    private String departamento;

    public Profesor(String rut, String nombre, String departamento) {
        super(rut, nombre);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    @Override
    public String describirRol() {
        return "Profesor del departamento: " + departamento;
    }

    @Override
    public String toString() {
        return "Profesor: " + getNombre() + " (" + getRut() + ") - Departamento: " + departamento;
    }

}