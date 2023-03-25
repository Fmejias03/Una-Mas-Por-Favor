package Ejercicio_3;

public class Decimal {
    /*3. Construya una función que convierta un número decimal en una cadena que represente el
valor del número en hexadecimal (base 16). A continuación, generalice la función para
convertir un número decimal en un número en base B (con B<10). Resuélvalo mediante expresiones lambda.
Recordatorio: El cambio de base se realiza mediante divisiones sucesivas por 16
en las cuales los restos determinan los dígitos hexadecimales del número según
la siguiente correspondencia:
Resto 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15
Dígito 0 1 2 3 4 5 6 7 8 9 A B C D E F*/
    public static String decimalHexadecimal(int decimal) {
        String hex = "";
        while (decimal > 0) {
            int Dec = decimal % 16;
            if (Dec < 10) {
                hex = Dec + hex;
            } else {
                char num = (char) ('A' + Dec - 10);
                hex = num + hex;
            }
            decimal /= 16;
        }
        return hex;
    }
}
