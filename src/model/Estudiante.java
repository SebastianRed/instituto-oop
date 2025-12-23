package model;

public class Estudiante extends Persona {

    private String nivel;

    public Estudiante(String rut, String nombre, String nivel) {
        super(rut, nombre);
        this.nivel = nivel;
    }

    public String getNivel() {
        return nivel;
    }

    @Override
    public String describirRol() {
        return "Estudiante de nivel: " + nivel;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "rut='" + getRut() + '\'' +
                ", nombre='" + getNombre() + '\'' +
                ", nivel='" + nivel + '\'' +
                '}';
    }

}