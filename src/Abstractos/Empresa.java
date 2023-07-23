package Abstractos;

import java.util.ArrayList;

/**
 * @author @author Maximiliano Orellana Mi perfil en GitHub:
 * https://github.com/orellana-max
 */
public class Empresa {

    private ArrayList<Empleado> empleados;

    public Empresa() {
        this.empleados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado e) {
        this.empleados.add(e);
    }

    public void mostrarSalario() {
        for (Empleado emp : empleados) {
            System.out.println(emp.nombreCompleto() + ": $"+ emp.getSalario());
        }
    }

    public Empleado empleadoConMasClientes() {
        Empleado elMayor = null;
        int max= -1;
        for (Empleado e : empleados) {
            if (e instanceof EmpleadoAComision) {
                EmpleadoAComision eac = (EmpleadoAComision) e;
                if(eac.getCantClientesCaptados() > max){
                    max = eac.getCantClientesCaptados();
                    elMayor = eac;
                }
            }
        }
        return elMayor;
    }
}
