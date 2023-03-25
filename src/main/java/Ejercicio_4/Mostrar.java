package Ejercicio_4;

import java.util.Scanner;

public class Mostrar {
    public void mostrar(){
        Palindromo palindromo = new Palindromo();
        Scanner scanner = new Scanner(System.in);
        System.out.println("La palabra no debe tener espacios en blanco ni caracteres especiales o mayusculas");
        System.out.println("Introduce una palabra: ");
        String cadena = scanner.nextLine();
           if(palindromo.palindromo(cadena)){
                System.out.println("La palabra es palindromo");
            }else{
                System.out.println("La palabra no es palindromo");
            }
    }
}
