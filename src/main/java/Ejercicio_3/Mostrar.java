package Ejercicio_3;

import java.util.Scanner;

public class Mostrar {
    public void mostrar(){
        Decimal decimal = new Decimal();
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero decimal");
        int dec = sc.nextInt();
        String hex = Decimal.decimalHexadecimal(dec);
        System.out.println("El numero: " + dec + " en hexadecimal es: " + hex);
    }


}
