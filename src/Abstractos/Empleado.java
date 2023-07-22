package Abstractos;

import java.time.LocalDate;

/**
 * @author @author Maximiliano Orellana Mi perfil en GitHub:
 * https://github.com/orellana-max
 */
public abstract class Empleado {

    private String DNI;
    private String nombre;
    private String apellido;
    private int anioIngreso;

    public Empleado(String DNI, String nombre, String apellido, int anioIngreso) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellido = apellido;
        this.anioIngreso = anioIngreso;
    }

    public String nombreCompleto() {
        return this.nombre + " " + this.apellido;
    }
    
    public int antiguedadEnAnios(){
        int anioActal = LocalDate.now().getYear();
        return anioActal - anioIngreso;
    }

    public abstract double getSalario();

}
