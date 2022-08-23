package ejercicio_numero_15;

import java.util.Scanner;

public class Divisor {

    public static void main(String[] args) {
        Operacion op1 = new Operacion();
        op1.leerNumero();
        op1.calcularDivisores();
    }
}

class Operacion {

    int numero;

    public void leerNumero() {

        Scanner leer = new Scanner(System.in);
        System.out.println("INGRESAR UN NUMERO :");
        numero = leer.nextInt();
    }

    public void calcularDivisores() {
        if (numero != 0 && numero%2 == 0) {
            for (int i = 1; i <= numero; i++) {
                if (numero % i == 0) {
                    //imprimes la solucion
                    System.out.println("*EL NUMERO " + i + " ES UN DIVISOR DEL " + numero);
                }
            }

	//cuando el número es impar y diferente de cero
        } else {
            System.out.print("'ERROR DE NUMERO'\n");

        }
    }

}
