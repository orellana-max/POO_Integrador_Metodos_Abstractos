package Abstractos;

/**
 * @author @author Maximiliano Orellana
 * Repositorio:
 * https://github.com/orellana-max/POO_Integrador_Metodos_Abstractos.git
 */
public class Principal {

    public static void main(String[] args) {
        
        Empresa emp = new Empresa();
        emp.agregarEmpleado(new EmpleadoSalarioFijo("123", "Ana", "López", 2022, 45000));
        emp.agregarEmpleado(new EmpleadoAComision("123", "Pepe", "Gomez", 2022, 30000, 100, 500));
        emp.agregarEmpleado(new EmpleadoSalarioFijo("123", "Luis", "Gamez", 2020, 50000));
        emp.agregarEmpleado(new EmpleadoAComision("123", "Leo", "Torres", 2018, 30000, 200, 100));
        emp.agregarEmpleado(new EmpleadoSalarioFijo("123", "Maria", "Pérez", 2015, 100000));
                
        emp.mostrarSalario();
        
        
        
        
    }
    
}
