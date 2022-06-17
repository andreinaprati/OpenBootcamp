// @andreinaprati
// ipet0405

/* 5. (Switch) Crear variable 'estacion' y CASE por cada estación del año (4)
       5.1. Dependiendo del valor de la variable imprimir por pantalla en qué estación se está (ln15)
       5.2. Poner un 'default' cuando el valor de la variable no sea una estación */

public class ipet0405 {

    public static void main (String[] args) {
        var estacion = "Otoño";

        switch (estacion) {
            case "Otoño":
                System.out.println("es Otoño");
                break; // si retiro el 'break' me mostrará todas las estaciones incluyendo la solicitada en el punto 5.1.
            case "Invierno":
                System.out.println("es Invierno");
                break;
            case "Primavera":
                System.out.println("es Primavera");
                break;
            case "Verano":
                System.out.println("es Verano");
                break;
            default:
                System.out.println("No es una estación");
            }
    }
}
// 17 de junio 2022