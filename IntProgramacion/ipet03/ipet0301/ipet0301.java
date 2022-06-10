// @andreinaprati
// ipet0301

/* 1. Creamos una función con tres argumentos (ln13) */
/* 2. Llamamos a la función en el 'main' y le damos valores (ln9) */

public class ipet0301 {
    public static void main(String[] args) {
        int argsQueSeSuman = sumarArgumentos (3, 6, 9);
        System.out.println(argsQueSeSuman);    
    }

    public static int sumarArgumentos (int argumento01, int argumento02, int argumento03) {
        int resultadoArgsSumados = argumento01 + argumento02 + argumento03;
        return resultadoArgsSumados;
    }
}
// 09 de junio 2022