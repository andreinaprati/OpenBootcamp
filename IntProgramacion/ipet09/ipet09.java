// @andreinaprati
// ipet09

/* 1. Crear Class 'Persona' 
       1.1. Crear las Variables privadas: edad, nombre, teléfono 
/* 2. Crear Class 'Cliente' que hereda de 'Persona' y crearle la Variable: credito
       2.1. Crearle al objeto las variables: edad, nombre, telefono, credito
       2.2. Darles valor. Mostrar por pantalla
/* 3. Crear Class 'Trabajador' que hereda de 'Persona' y crearle la Variable: salario */

public class ipet09 {

    public static void main(String[] args) {
        Cliente objetoCliente = new Cliente();

        objetoCliente.edad = 41;
        objetoCliente.nombre = "Federico";
        objetoCliente.telefono = 36945678;
        objetoCliente.credito = 333333.333;
        
        System.out.println(">> Datos Cliente");
        System.out.println("Nombre: " + objetoCliente.nombre);
        System.out.println("Edad: " + objetoCliente.edad);
        System.out.println("Nro de telefono: " + objetoCliente.telefono);
        System.out.println("Credito en Euros: " + objetoCliente.credito);

        Trabajador objetoTrabajador = new Trabajador();

        objetoTrabajador.edad = 34;
        objetoTrabajador.nombre = "Andreina";
        objetoTrabajador.telefono = 36987654;
        objetoTrabajador.salario = 666666.666;

        System.out.println(">> Datos Trabajador");
        System.out.println("Nombre: " + objetoTrabajador.nombre);
        System.out.println("Edad: " + objetoTrabajador.edad);
        System.out.println("Telefono: " + objetoTrabajador.telefono);
        System.out.println("Salario en Euros: " + objetoTrabajador.salario);
    }
}
class Persona {
    int edad;
    String nombre;
    int telefono; // Lo conveniente sería utilizar el tipo 'long'
}
class Cliente extends Persona {
    double credito;
}
class Trabajador extends Persona {
    double salario;
}
// 20 de junio 2022