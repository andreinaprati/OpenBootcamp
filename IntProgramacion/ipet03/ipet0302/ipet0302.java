// @andreinaprati
// ipet0302

/* 1. Creamos una CLASE 'coche' (ln19) */
/* 2. Creamos una variable numérica indicando el número de puertas (ln20) */
/* 3. Creamos una función que incremente el número de puertas (ln21) */
/* 4. Creamos un OBJETO 'miCoche' y le añadimos una puerta (ln12) */
/* 5. Mostramos el número de puertas que tiene el coche (ln15) */

public class ipet0302 {
    public static void main(String[] args) {
        Coche miCoche = new Coche();
        // System.out.println(miCoche.puertas);
        miCoche.masPuertas();
        System.out.println("Nro de puertas = " + miCoche.puertas);
    }
}

class Coche {
    public int puertas = 3;
    public void masPuertas() {
        this.puertas = puertas + 1;
    }
}
// 09 de junio 2022