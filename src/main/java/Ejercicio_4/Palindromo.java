package Ejercicio_4;

public class Palindromo {
    /*Implemente, tanto de forma recursiva como de forma iterativa, una función que nos diga
si una cadena de caracteres es simétrica (un palíndromo). Por ejemplo,
“DABALEARROZALAZORRAELABAD” es un palíndromo.*/

    public static boolean palindromo(String cadena){
        if(cadena.length() == 0 || cadena.length() == 1){
            return true;
        }
        if(cadena.charAt(0) == cadena.charAt(cadena.length()-1)){
            return palindromo(cadena.substring(1, cadena.length()-1));
        }
        return false;
    }
}
