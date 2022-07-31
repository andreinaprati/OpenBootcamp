// @andreinaprati
// jbet0201

/* 1. Crear una función que reciba un 'Precio' (fun 'getPrice') */
/* 2. Devolver el 'Precio' con el IVA incluido (fun 'sumarIva') */

package com.jb;

import java.util.Scanner;

public class Precio {
    public static void main(String[] args) {

        float valorProd = getPrice();
        sumarIva(valorProd);
    }

    private static void sumarIva(float valorProd) {
        double prodMasIva = valorProd + valorProd * 0.21;
        System.out.println("Valor con iva = " + prodMasIva);
    }

    private static float getPrice() {
        Scanner ingreso = new Scanner(System.in);
        System.out.print("Introduzca el valor del producto: ");
        return ingreso.nextFloat();
    }
}
// 31 de julio 2022