package miniEmpresa;

public class Main {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Juan", 1000.0);
        Gerente gerente1 = new Gerente("Laura", 2000.0, "Ventas");
        Desarrollador desarrollador1 = new Desarrollador("Carlos", 1500.0, "Java");

        System.out.println("Empleado: " + empleado1.getNombre() + ", Salario: " + empleado1.calcularSalario());
        System.out.println("Gerente: " + gerente1.getNombre() + ", Salario: " + gerente1.calcularSalario());
        System.out.println("Desarrollador: " + desarrollador1.getNombre() + ", Salario: " + desarrollador1.calcularSalario());
    }
}
