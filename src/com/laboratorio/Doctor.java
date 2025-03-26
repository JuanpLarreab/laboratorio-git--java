package models;

import java.util.ArrayList;

public class Doctor {
    private String nombre;
    private String identificacion;
    private String especialidad;
    private ArrayList<String> hospitales;

    public Doctor(String nombre, String identificacion, String especialidad) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.especialidad = especialidad;
        this.hospitales = new ArrayList<>();
    }

    public void agregarHospital(String hospital) {
        hospitales.add(hospital);
    }

    @Override
    public String toString() {
        return "Doctor [Nombre=" + nombre + ", Identificación=" + identificacion +
               ", Especialidad=" + especialidad + ", Hospitales=" + hospitales + "]";
    }
}

