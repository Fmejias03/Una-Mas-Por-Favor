# Una-Mas-Por-Favor

## Nota:

Algunas soluciones están en el propio readme y otras hechas en código.
 
 Mi Repositorio: https://github.com/Fmejias03/Una-Mas-Por-Favor.git

# Ejercicios

## 1. Dado el siguiente fragmento de código C:
static final double N = 2;
static final double PREC = 1e-6;
static double f (double x)
{
return x*x-N;
}
static double bisect (double min, double max)
{
double med = (min+max)/2;
if (max-min<PREC) {
return med;
} else if (f(min)*f(med)<0) {
return bisect (min,med);
} else {
return bisect (med,max);
}
}

a) ¿Qué calcula la llamada a la función recursiva bisect(0,N)? Si cambiamos el
valor de N, ¿qué estaríamos calculando? ¿Y si cambiásemos la función f(x)?
### Respuestas:
-El programa realizado está calculando la raíz cuadrada de 2 mediante el método de bisección.
-Si cambiamos la función f(x), la llamada a la función bisect(0,N) calcularía la raíz de la nueva función f(x).

b) Implemente un algoritmo iterativo equivalente.

static double bisect_iter (double min, double max)
{
    double med;
    while (max - min >= PREC) {
        med = (min + max) / 2;
        if (f(min) * f(med) < 0) {
            max = med;
        } else {
            min = med;
        }
    }
    return (min + max) / 2;
}


## 2. Dado el siguiente algoritmo recursivo:

void f(int num, int div)
{
if (num>1) {
if ((num%div) == 0) {
System.out.println(div);
f(num/div,div);
} else {
f(num,div+1);
}
}
}

### Respuestas: 
a) Dado un número cualquiera x, ¿qué nos muestra por pantalla la llamada a la función
recursiva f(x,2)? ¿Cuál sería un nombre más adecuado para la función f?
-Si se llama a la función recursiva f(x,2), el resultado mostrado por pantalla serán los factores primos de x.
-Un nombre más adecuado para la función f podría ser "factoresPrimos"

b) Implemente un algoritmo iterativo y uno implementado mediante expresiones lambda
equivalentes.

Algoritmo Iterativo:

public static void factoresPrimosIterativo(int num) {
    int divisor = 2;
    while (num > 1) {
        if (num % divisor == 0) {
            System.out.print(divisor + " ");
            num = num / divisor;
        } else {
            divisor++;
        }
    }
}

Implementado mediante expresiones Lambda:

public static void factoresPrimosLambda(int num) {
    IntConsumer descomposicion = n -> {
        if (n > 1) {
            int div = 2;
            while (n % div != 0) {
                div++;
            }
            System.out.print(div + " ");
            descomposicion.accept(n / div);
        }
    };
    descomposicion.accept(num);
}

## 3. Ejercicio
Construya una función que convierta un número decimal en una cadena que represente el
valor del número en hexadecimal (base 16). A continuación, generalice la función para
convertir un número decimal en un número en base B (con B<10). Resuélvalo mediante
static final double N = 2;
static final double PREC = 1e-6;
static double f (double x)
{
return x*x-N;
}
static double bisect (double min, double max)
{
double med = (min+max)/2;
if (max-min<PREC) {
return med;
} else if (f(min)*f(med)<0) {
return bisect (min,med);
} else {
return bisect (med,max);
}
}
void f(int num, int div)
{
if (num>1) {
if ((num%div) == 0) {
System.out.println(div);
f(num/div,div);
} else {
f(num,div+1);
}
}
}
expresiones lambda.
Recordatorio: El cambio de base se realiza mediante divisiones sucesivas por 16
en las cuales los restos determinan los dígitos hexadecimales del número según
la siguiente correspondencia:
Resto 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15
Dígito 0 1 2 3 4 5 6 7 8 9 A B C D E F
Por ejemplo:
65029|10 = FE05|16

## 4. Ejercicio
Implemente, tanto de forma recursiva como de forma iterativa, una función que nos diga
si una cadena de caracteres es simétrica (un palíndromo). Por ejemplo,
“DABALEARROZALAZORRAELABAD” es un palíndromo.

## 5.Ejercicio
Implemente, tanto de forma recursiva como de forma iterativa y con expresiones lambda,
una función que nos devuelva el máximo común divisor de dos números enteros
utilizando el algoritmo de Euclides.
ALGORITMO DE EUCLIDES
Dados dos números enteros positivos m y n, tal que m > n,
para encontrar su máximo común divisor
(es decir, el mayor entero positivo que divide a ambos):
- Dividir m por n para obtener el resto r (0 ≤ r < n)
- Si r = 0, el MCD es n.
- Si no, el máximo común divisor es MCD(n,r).
