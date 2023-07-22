package Abstractos;

/**
 * @author @author Maximiliano Orellana Mi perfil en GitHub:
 * https://github.com/orellana-max
 */
public class EmpleadoSalarioFijo extends Empleado {

    private static final double PORC1 = 0.05;
    private static final double PORC2 = 0.1;
    private static final int ANIO1 = 2;
    private static final int ANIO2 = 5;
    private double sueldoBasico;

    public EmpleadoSalarioFijo(String DNI, String nombre, String apellido, int anioIngreso, double sBasico) {
        super(DNI, nombre, apellido, anioIngreso);
        this.sueldoBasico = sBasico;
    }

    @Override
    public double getSalario() {
        return sueldoBasico + sueldoBasico * porcAdicional();
    }

    private double porcAdicional() {
        int ant = super.antiguedadEnAnios();
        double porc = 0;
        
        if (ant > ANIO2) {
            porc = PORC2;
        } else if (ant >= ANIO1 ) {
            porc = PORC1;
        }
        return porc;
    }
}
