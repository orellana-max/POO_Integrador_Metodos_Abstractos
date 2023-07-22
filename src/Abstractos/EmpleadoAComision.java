package Abstractos;

/**
 * @author @author Maximiliano Orellana Mi perfil en GitHub:
 * https://github.com/orellana-max
 */
public class EmpleadoAComision extends Empleado {

    private double salarioMinimo;
    private int cantClientesCaptados;
    private double montoPorCliente;

    public EmpleadoAComision(String DNI, String nombre, String apellido, int anioIngreso, double sm, int ccc, double mpc) {
        super(DNI, nombre, apellido, anioIngreso);
        this.salarioMinimo = sm;
        this.cantClientesCaptados = ccc;
        this.montoPorCliente = mpc;
    }

    @Override
    public double getSalario() {
        double sal = montoPorCliente * cantClientesCaptados;
        if (sal < salarioMinimo) {
            sal = salarioMinimo;
        }
        return sal;
    }
    
    
}
