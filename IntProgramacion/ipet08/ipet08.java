// @andreinaprati
// ipet08

/* 1. Crear Class 'Persona' 
    1.1. Crear las Variables privadas: edad, nombre, teléfono de la clase 
    1.2. Crear Gets y Sets de cada propiedad
/* 2. Utiliza los gets y sets para darles valores a las propiedades: edad, nombre, teléfono */

public class ipet08 {
    
    public static void main(String[] args) {
        Persona personaA = new Persona ();
        
        personaA.setEdad(34);
        personaA.setNombre("Andreina");
        personaA.setTelefono(39654321);
        System.out.println("Nombre: " + personaA.getNombre());
        System.out.println("Edad: " + personaA.getEdad());
        System.out.println("Telefono: " + personaA.getTelefono());
    }
        
    }
    class Persona {
        private int edad;
        private String nombre;
        private int telefono;

        public int getEdad() {
            return edad;
        }
        public void setEdad(int edad) {
            this.edad = edad;
        }
    
        public String getNombre() {
            return nombre;
        }
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public int getTelefono() {
            return telefono;
        }
        public void setTelefono(int telefono) {
            this.telefono = telefono;
        }
    }
// 18 de junio 2022