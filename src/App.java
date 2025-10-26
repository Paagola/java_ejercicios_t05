
public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("""
                                        ELIGE UN EJERCICIO
                ---------------------------------------------------------------------
                EJERCICIO 1 -> 1   | EJERCICIO 8 -> 8   | EJERCICIO 15 -> 15 |
                EJERCICIO 2 -> 2   | EJERCICIO 9 -> 9   | EJERCICIO 16 -> 16 |
                EJERCICIO 3 -> 3   | EJERCICIO 10 -> 10 | EJERCICIO 17 -> 17 |
                EJERCICIO 4 -> 4   | EJERCICIO 11 -> 11 |
                EJERCICIO 5 -> 5   | EJERCICIO 12 -> 12 |
                EJERCICIO 6 -> 6   | EJERCICIO 13 -> 13 |
                EJERCICIO 7 -> 7   | EJERCICIO 14 -> 14 |
                """);
        int num = Integer.parseInt(System.console().readLine("-> "));
        System.out.printf("%n%n");

        switch (num) {

            case 1: // EJERCICIO 1
                System.out.println(ut.GREEN_BOLD + "EJERCICIO 1" + ut.RESET);
                System.out.println(
                        """
                                Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle for. Los números se pueden mostrar uno
                                debajo del otro, en una sola columna; o bien uno al lado del otro, en una misma fila.
                                        """);

                int numero = 5;
                for (int i = 0; i < 21; i += 1) {
                    System.out.print(numero * i + " ");
                }
                System.out.println();
                break;

            case 2: // EJERCICIO 2
                System.out.println(ut.GREEN_BOLD + "EJERCICIO 2" + ut.RESET);
                System.out.println(
                        """
                                Muestra dos números múltiplos de 5 de 0 a 100 utilizando un bucle while.
                                """);

                numero = 5;
                int i = 0;
                while (i < 21) {
                    System.err.print(numero * i + " ");
                    i += 1;
                }
                System.out.println();
                break;

            case 3: // EJERCICIO 3
                System.out.println(ut.GREEN_BOLD + "EJERCICIO 3" + ut.RESET);
                System.out.println(
                        """
                                Muestra los multiplos de 5 de 0 a 100 utilizando un bucle do-while.
                                """);

                numero = 5;
                i = 0;

                do {
                    System.out.print(numero * i + " ");
                    i += 1;
                } while (i < 21);
                System.out.println();
                break;

            case 4: // EJERCICIO 4
                System.out.println(ut.GREEN_BOLD + "EJERCICIO 4" + ut.RESET);
                System.out.println(
                        """
                                Muestra los números del 320 al 160, contando de 20 en 20 utilizando un bucle for.
                                        """);

                for (numero = 340; numero >= 160; numero -= 20)
                    ;
                System.out.println(numero + " ");

                break;

            case 6: // EJERCICIO 6
                System.out.println(ut.GREEN_BOLD + "EJERCICIO 6" + ut.RESET);
                System.out.println(
                        """
                                Muestra los números del 320 al 160, contando de 20 en 20 utilizando un bucle do-while.
                                    """);
                numero = 340;
                do {
                    numero -= 20;
                    System.out.print(numero + " ");

                } while (numero >= 160);

                break;

            case 7: // EJERCICIO 7
                System.out.println(ut.GREEN_BOLD + "EJERCICIO 7" + ut.RESET);
                System.out.println(
                        """
                                Realiza el control de acceso a una caja fuerte. La combinació será un número de 4 cifras.
                                El programa nos pedirá la combinaciónpara abrirla.
                                Si no acertamos, se nos mostrará el mensaje "Lo siento, esa no es la combinación" y si acertamos
                                se nos dirá "La caja fuerte se ha abierto satisfactoriamente."
                                        """);
                String intento;
                i = 1;
                do {
                    intento = System.console().readLine("Introduzca la clave de la caja fuerte -> ");
                    i++;
                    if (!intento.equals("8888")) {
                        System.out.println("Contraseña Incorrecta!");
                    }

                } while (!intento.equals("8888") && i <= 4);
                if (intento.equals("8888")) {
                    System.out.println("La contraseña es correcta!");
                } else {
                    System.out.println("Se ha excedido el número de intentos!!");
                }
                break;

            case 8: // EJERCICIO 8
                System.out.println(ut.GREEN_BOLD + "EJERCICIO 8" + ut.RESET);
                System.out.println(
                        """
                                Muestra la tabla de multiplicar de un número introducido por teclado.
                                """);
                numero = Integer.parseInt(
                        System.console().readLine("Introduzca un número y le mostraré su tabla de multiplicar -> "));
                for (i = 0; i < 11; i++) {
                    System.err.printf("%d x %d = %d%n", numero, i, numero * i);
                }
                break;

            case 9: // EJERCICIO 9
                System.out.println(ut.GREEN_BOLD + "EJERCICIO 9" + ut.RESET);
                System.out.println(
                        """
                                Realiza un programa que nos diga cuántos dígitos tiene un número introducido por teclado. Este ejercicio es equivalente a otro
                                realizado anteriormente, con la salvedad de que el anterior estaba limitado a números de 5 dígitos como máximo.
                                En esta ocasión, hay que realizar el ejercicio utilizando bucles; de esta manera, la única limitación en el número de dígitos la establece el
                                tipo de dato que se utilice (`int` o `long`).
                                """);

                long numero_long = Integer.parseInt(System.console().readLine("Introduce un número entero -> "));
                long aux_long = numero_long;
                i = 1;
                boolean verdadero = true;
                if (numero_long > 1)
                    while (verdadero) {
                        aux_long /= 10;
                        if (aux_long > 0)
                            i++;
                        else
                            verdadero = false;
                    }
                else
                    System.out.println("El número tiene 2 dígitos.");

                System.err.printf("El número %d tiene %d dígitos", numero_long, i);

                break;

            case 10: // EJERCICIO 10
                System.out.println(ut.GREEN_BOLD + "EJERCICIO 10" + ut.RESET);
                System.out.println(
                        """
                                Escribe un programa que clacule la media de un conjunto de números positvos introducido por teclado. A priori,
                                el programa no sabe cuántos números e introducirán. El usuario indicarça que ha terminado de introducir los datos cuando
                                meta un número negativo.
                                """);
                System.out.println("Este programa clacula la media de los números positivos introducidos.");
                System.out.println("Para parar, introduzca un número negativo.");
                System.out.println("Vaya introduciendo números:");
                double numero_double = 0;
                i = 0;
                double suma_num = 0;
                do {
                    numero_double = Double.parseDouble(System.console().readLine("-> "));
                    i = (numero_double > 0 ? i += 1 : i);
                    suma_num = (numero_double > 0 ? suma_num += numero_double : suma_num);

                } while (numero_double > 0);
                System.out.printf("La media de los números es %.3f", suma_num / i);

                break;

            case 11: // EJERCICIO 11
                System.out.println(ut.GREEN_BOLD + "EJERCICIO 11" + ut.RESET);
                System.out.println(
                        """
                                Escribe un programa que muestre en tres columnas, el cuadro y el cubo de los 5 primero números enteros
                                a partir de uno que se introduce por teclado.
                                """);

                numero = Integer.parseInt(System.console().readLine("Introduce un número -> "));

                // Número de digitos que hay en n
                int numeron = numero + 4;
                int digitosn = 0;
                do {
                    numeron /= 10;
                    ++digitosn;
                } while (numeron > 0);

                // Número de digitos que hay en n^2
                int digitosncuadrado = 0;
                numeron = (int) Math.pow(numero + 4, 2);
                do {
                    numeron /= 10;
                    digitosncuadrado++;
                } while (numeron > 0);

                // Número de digitos que hay en n^3
                int digitosncubo = 0;
                numeron = (int) Math.pow(numero + 4, 3);
                do {
                    numeron /= 10;
                    digitosncubo++;
                } while (numeron > 0);

                int anchon = Math.max(digitosn, 1);
                int anchoncuadrado = Math.max(digitosncuadrado, 2);
                int anchoncubo = Math.max(digitosncubo, 2);

                System.out.printf(
                        "%" + anchon + "s" +
                                "%s" +
                                "%" + anchon + "s" +
                                "|" +
                                "%" + (int) Math.ceil(digitosncuadrado / 2) + "s" +
                                "%s" +
                                "%" + (int) Math.floor(digitosncuadrado / 2) + "s" +
                                "|" +
                                "%" + (int) Math.ceil(digitosncubo / 2) + "s" +
                                "%s" +
                                "%" + (int) Math.floor(digitosncubo / 2) + "s" +
                                "|%n",
                        "", "n", "", "", "n2", "", "", "n3", "");

                String table = "%" + Math.ceil(digitosn / 2) + "s" +
                        "%d" +
                        "%" + Math.floor(digitosn / 2) + "s" +
                        "|" +
                        "%" + Math.ceil(digitosncuadrado / 2) + "s" +
                        "%d" +
                        "%" + Math.floor(digitosncuadrado / 2) + "s" +
                        "|" +
                        "%" + Math.ceil(digitosncubo / 2) + "s" +
                        "%d" +
                        "%" + Math.floor(digitosncubo / 2) + "s" +
                        "|%n";
                for (i = 0; i <= 4; i++)
                    System.out.printf(table,
                            "", numero + i, "",
                            "", (int) Math.pow(numero + i, 2), "",
                            "", (int) Math.pow(numero + i, 3), "");

                break;

            case 12: // EJERCICIO 12
                System.out.println(ut.GREEN_BOLD + "EJERCICIO 12" + ut.RESET);
                System.out.println(
                        """
                                Escribe un programa que muestre los n primero términos de la serie de Fibonacci.
                                El primer término de la serie de Fibonacci es el 0, el segundo es el 1el resto se calcula sumando lso dos anteriores,
                                por lo que tendríamos que los términos son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144...
                                El número n se debe introducir por teclado.
                                """);
                numero = Integer.parseInt(System.console().readLine("Por favor introduzca el número n: "));
                int a = 0;
                int b = 1;
                int c;
                if (numero >= 1) {
                    System.out.print(0 + " ");
                }

                for (i = 0; numero > i; i++) {
                    System.out.print(b + " ");
                    c = a + b;
                    a = b;
                    b = c;
                }
                break;

            case 13: // EJERCICIO 13
                System.out.println(ut.GREEN_BOLD + "EJERCICIO 13" + ut.RESET);
                System.out.println(
                        """
                                Escribe un programa que lea una lista de 10 número y determine cuántos son positivos y cuántos negativos.
                                """);
                int positivos = 0;
                int negativos = 0;

                for (i = 1; i < 11; i++) {
                    numero = Integer.parseInt(System.console().readLine("Introduce el " + i + "er numero: "));
                    positivos += ((numero > 0) ? 1 : 0);
                    negativos += ((numero < 0) ? 1 : 0);
                }
                System.out.printf("Has introducido %d negativos y %d positivos%n", negativos, positivos);
                break;

            case 14: // EJERCICIO 14
                System.out.println(ut.GREEN_BOLD + "EJERCICIO 14" + ut.RESET);
                System.out.println(
                        """
                                Escribe un programa que pieda una base y un exponente y que calcule la potencia.
                                No se deben utilizar funciones de exponienzación como Math.pow
                                """);
                System.out.println("Calculo de una potencia");
                int base = Integer.parseInt(System.console().readLine("Introduzca la base: "));
                int exponente = Integer.parseInt(System.console().readLine("Introduzca el exponente: "));
                aux_long = base;
                for (i = 1; exponente > i; i++) {
                    aux_long = aux_long * base;
                }
                System.out.println(base + "^" + exponente + " = " + aux_long);

                break;

            case 15: // EJERCICIO 15
                System.out.println(ut.GREEN_BOLD + "EJERCICIO 15" + ut.RESET);
                System.out.println(
                        """
                                Escribe un programa que dado dos números, saque por pantalla todas las potencias con base del
                                primer número y exponente entre uno y el segundo número introducido. Por ejemplo, si introducimos el 2 y el 5,
                                se  deberán mostrar 2^1, 2^2, 2^3, 2^4 y 2^5. No se deben usar funciones de exponienzación como Math.pow()
                                """);
                base = Integer.parseInt(System.console().readLine("Introduzca la base: "));
                exponente = Integer.parseInt(System.console().readLine("Introduzca el exponente: "));

                aux_long = base;
                for (i = 1; exponente >= i; i++) {
                    System.out.println(base + "^" + i + " = " + aux_long);
                    aux_long *= exponente;
                }
                break;

            case 16: // EJERCICIO 16
                System.out.println(ut.GREEN_BOLD + "EJERCICIO 16" + ut.RESET);
                System.out.println(
                        """
                                Escribe un programa que diga si un número introducido por teclado es o no primo.
                                Un número primo es aquel que solo es divisible entre él mismo y la unidad.
                                """);

                numero = Integer.parseInt(System.console().readLine("Introduce un número y le diré si es primo: "));
                boolean esprimo = true;

                double aux_long_double = Math.sqrt(numero);
                i = 2;
                if (numero < 50) {
                    while (esprimo && (i < numero)) {
                        esprimo = ((numero % i) == 0 ? false : true);
                        i++;
                    }
                }

                // Caso para cuando los número sean grandes.
                else {
                    do {
                        esprimo = ((numero % i) == 0 ? false : true);
                        i++;
                    } while (esprimo && (i < aux_long_double));
                }
                System.out.println((esprimo == false) ? "El número no es primo" : "El número es primo");
                break;

            case 17: // EJERCICIO 17
                System.out.println(ut.GREEN_BOLD + "EJERCICIO 17" + ut.RESET);
                System.out.println(
                        """
                                Realiza un programa que sime los 100 primeros números siguientes a un número entero y positivo
                                introducido por teclado. Se debe comprobar que el dato introducido es correcto (que és un número
                                positivo.)
                                """);
                numero = 0;
                do {
                    try {
                        numero = Integer.parseInt(System.console().readLine("Introduce un número entero positivo: "));
                        System.out.println((numero >= 0) ? "" : "El número que ha introducido no es correcto!!!");
                    } catch (NumberFormatException e) {
                        System.out.println("Introduce un número!!!");
                        numero = -1;
                    }

                } while (numero < 0);

                suma_num = 0;
                for (i = 0; i < 100; i++) {
                    suma_num += (numero + i);
                }
                System.out.printf("La suma de todos los 100 número siguientes de %d es %.0f", numero, suma_num);
                break;

            case 18: // EJERCICIO 18
                System.out.println(ut.GREEN_BOLD + "EJERCICIO 18" + ut.RESET);
                System.out.println(
                        """
                                 Escribe un programa que obtenga los números enteros comprendidos entre dos números introducidos por teclado y 
                                 validados como distintos, el programa debe empezar por el menos de los enteros introducidos e ir incrementando de 7
                                 en 7 
                                """);
                int aux = 0;
                do{
                    try {
                        numero = Integer.parseInt(System.console().readLine("Introduce un número entero: "));
                        numeron = Integer.parseInt(System.console().readLine("Introduce otro número distinto al anterior: "));
                    } catch (NumberFormatException e) {
                        System.out.println("ERROR: TIENES QUE INTRODUCIR UN NÚMERO!!!");
                        numero = 0; numeron = 0;
                    } catch (Exception e) {
                        System.out.println("ERROR INESPERADO!!!");
                        numero = 0; numeron = 0;
                    }    
                } while (numero == numeron);
                if (numero > numeron) {
                    aux = numero;
                    numero = numeron;
                    numeron = aux;
                }

                System.out.print(numero + " ");
                while ((numero + 7) <= numeron) {
                    numero += 7;
                    System.out.print(numero + " ");
                }
                    
                

                break;
            default:
                System.out.println("El ejercicio que has seleccionado no existe.");

        }
    }
}
