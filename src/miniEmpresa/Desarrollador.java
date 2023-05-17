package miniEmpresa;

public class Desarrollador extends Empleado {
    private String lenguajeDominante;

    public Desarrollador(String nombre, double salario, String lenguajeDominante) {
        super(nombre, salario);
        this.lenguajeDominante = lenguajeDominante;
    }

    public String getLenguajeDominante() {
        return lenguajeDominante;
    }

    public void setLenguajeDominante(String lenguajeDominante) {
        this.lenguajeDominante = lenguajeDominante;
    }

    @Override
    public double calcularSalario() {
        // Puedes agregar una bonificación adicional para los desarrolladores según el lenguaje dominante
        if (lenguajeDominante.equalsIgnoreCase("Java")) {
            return getSalario() + 300.0;
        } else {
            return getSalario();
        }
    }
}

