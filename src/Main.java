public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        Trabajador trabajador = new Trabajador();

        cliente.edad = 20;
        cliente.telefono = 955784512;
        cliente.nombre = "Antonio";
        cliente.credito = 200.5;

        trabajador.edad = 40;
        trabajador.telefono = 955154896;
        trabajador.nombre = "Lourdes";
        trabajador.salario = 2040.67;

        System.out.println("nombre: " + cliente.nombre + " ; edad: " + cliente.edad + " ; telefono: " + cliente.telefono + " ; credito: " + cliente.credito + "€");
        System.out.println("nombre: " + trabajador.nombre + " ; edad: " + trabajador.edad + " ; telefono: " + trabajador.telefono + " ; salario: " + trabajador.salario + "€");
    }
}

class Persona {
    int edad;
    String nombre;
    int telefono;
}

class Cliente extends Persona {
    double credito;
}

class Trabajador extends Persona {
    double salario;
}