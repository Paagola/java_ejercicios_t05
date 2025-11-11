
public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("""
                                                           ELIGE UN EJERCICIO
                --------------------------------------------------------------------------------------------------------
                EJERCICIO 1 -> 1   | EJERCICIO 11 -> med| EJERCICIO 21 -> 21 | EJERCICIO 31 -> 31 | EJERCICIO 41 -> 41 |
                EJERCICIO 2 -> 2   | EJERCICIO 12 -> 12 | EJERCICIO 22 -> 22 | EJERCICIO 32 -> 32 | EJERCICIO 42 -> 42 |
                EJERCICIO 3 -> 3   | EJERCICIO 13 -> 13 | EJERCICIO 23 -> 23 | EJERCICIO 33 -> 33 | EJERCICIO 43 -> 43 |
                EJERCICIO 4 -> 4   | EJERCICIO 14 -> 14 | EJERCICIO 24 -> 24 | EJERCICIO 34 -> 34 | EJERCICIO 44 -> 44 |
                EJERCICIO 5 -> 5   | EJERCICIO 15 -> 15 | EJERCICIO 25 ->    | EJERCICIO 35 -> 35 | EJERCICIO 45 -> 45 |
                EJERCICIO 6 -> 6   | EJERCICIO 16 -> 16 | EJERCICIO 26 -> 26 | EJERCICIO 36 -> 36 |
                EJERCICIO 7 -> 7   | EJERCICIO 17 -> 17 | EJERCICIO 27 -> 27 | EJERCICIO 37 -> 37 |
                EJERCICIO 8 -> 8   | EJERCICIO 18 -> 18 | EJERCICIO 28 -> 28 | EJERCICIO 38 -> 38 |
                EJERCICIO 9 -> 9   | EJERCICIO 19 -> 19 | EJERCICIO 29 -> 29 | EJERCICIO 39 -> 39 |
                EJERCICIO 10 -> 10 | EJERCICIO 20 -> 20 | EJERCICIO 30 -> 30 | EJERCICIO 40 -> 40 |
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
                    System.out.print(numero * i + " ");
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
                    System.out.printf("%d x %d = %d%n", numero, i, numero * i);
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

                System.out.printf("El número %d tiene %d dígitos", numero_long, i);

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
                do {
                    try {
                        numero = Integer.parseInt(System.console().readLine("Introduce un número entero: "));
                        numeron = Integer
                                .parseInt(System.console().readLine("Introduce otro número distinto al anterior: "));
                        System.out.println((numero == numeron) ? "Los números introducidos deben ser distintos" : "");
                    } catch (NumberFormatException e) {
                        System.out.println("ERROR: TIENES QUE INTRODUCIR UN NÚMERO!!!");
                        numero = 0;
                        numeron = 0;
                    } catch (Exception e) {
                        System.out.println("ERROR INESPERADO!!!");
                        numero = 0;
                        numeron = 0;
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

            case 19: // EJERCICIO 19
                System.out.println(ut.GREEN_BOLD + "EJERCICIO 19" + ut.RESET);
                System.out.println(
                        """
                                 Realiza un programa que pinte una pirámide por pantalla. La altura se debe pedir por teclado.
                                 El carácter con el que se pinta también se debe pedir por teclado
                                """);

                int altura = Integer.parseInt(System.console().readLine("Introduce la altura de la pirámide: "));
                String relleno = System.console().readLine("Introduce el carácter de relleno: ");

                int y = 1;
                aux = altura;
                for (i = 1; i <= altura; i++) {
                    aux -= 1;
                    for (int j = 1; j <= aux; j++) {
                        System.out.print(" ");
                    }
                    for (int j = 1; j <= y; j++) {
                        System.out.print(relleno);
                    }
                    for (int j = 1; j <= aux; j++) {
                        System.out.print(" ");
                    }
                    System.out.println("");
                    y += 2;
                }

                break;

            case 20: // EJERCICIO 20
                System.out.println(ut.GREEN_BOLD + "EJERCICIO 20" + ut.RESET);
                System.out.println(
                        """
                                Igual que el otro ejercicio anterior pero esta vez se debe pintar una pirámide hueca
                                """);
                altura = Integer.parseInt(System.console().readLine("Introduce la altura de la pirámide: "));
                relleno = System.console().readLine("Introduce el carácter de relleno: ");

                y = 1;
                aux = altura;
                for (i = 1; i <= altura; i++) {
                    aux -= 1;
                    for (int j = 1; j <= aux; j++) {
                        System.out.print(" ");
                    }
                    for (int j = 1; j <= y; j++) {

                        if (j == y || j == 1 || i == altura) {
                            System.out.print(relleno);
                        } else {
                            System.out.print(" ");
                        }

                    }

                    for (int j = 1; j <= aux; j++) {
                        System.out.print(" ");
                    }
                    System.out.println("");
                    y += 2;
                }
                break;

            case 21: // EJERCICIO 21
                System.out.println(ut.GREEN_BOLD + "EJERCICIO 21" + ut.RESET);
                System.out.println(
                        """
                                Realiza un programa que que vaya pidiendo números hasta que se introduzca un numero negativo y nos diga cuantos números
                                se han introducido, la media de los impares y el mayor de los pares.
                                El número negativo sólo se utiliza para indicar el final de la introducción de datos pero no se incluye en el cómputo.
                                    """);
                int num_mayor = 0;
                int media_imp = 0;
                i = 0;
                int contador_impar = 0;
                System.out.println("Para terminar introduce un número negativo.");
                do {
                    numero = Integer.parseInt(System.console().readLine("-> "));
                    if (numero >= 0) {
                        i++;
                        if (numero % 2 == 0) {
                            num_mayor = (num_mayor > numero ? num_mayor : numero);
                        }
                        ;
                        contador_impar = ((numero % 2) != 0 ? 1 : 0);
                        media_imp += ((numero % 2) != 0 ? numero : 0);
                    }
                } while (numero >= 0);
                System.out.println("Has introducido " + i + " números positivos");
                System.out.println("La media de los impares es " + media_imp / contador_impar);
                System.out.println("El máximo de los pares es " + num_mayor);

            default:
                System.out.println("El ejercicio que has seleccionado no existe.");
                break;

            case 22: // EJERCICIO 22
                System.out.println(ut.GREEN_BOLD + "EJERCICIO 22" + ut.RESET);
                System.out.println(
                        """
                                Muestra por pantalla todos los números primos entre 2 y 100, ambos incluidos.
                                    """);

                esprimo = false;
                for (i = 2; i <= 100; i++) {
                    esprimo = true;

                    for (int j = 2; esprimo && j < i / 2; j++) {
                        if (i % j == 0) {
                            esprimo = false;
                        }
                    }

                    if (esprimo) {
                        System.out.print(i + " ");
                    }
                }
                break;

            case 23: // EJERCICIO 23
                System.out.println(ut.GREEN_BOLD + "EJERCICIO 23" + ut.RESET);
                System.out.println(
                        """
                                Escribe un programa que permita ir introduciendo una seria indetermindad de números hasta que su suma supere el valor 1000.
                                Cuando esto último ocurra se debe mostrar el total acumulado, el contador de los números introducidos y
                                la media.
                                    """);
                i = 0;
                suma_num = 0;
                do {
                    numero = Integer.parseInt(System.console().readLine("-> "));
                    suma_num += numero;
                    i++;
                } while (suma_num <= 10000);
                System.out.println("Ha introducido un total de " + i + " números.");
                System.out.println("La suma total es " + (int) suma_num);
                System.out.printf("La media es %.2f%n", (double) suma_num / i);
                break;

            case 24: // EJERCICIO 24
                System.out.println(ut.GREEN_BOLD + "EJERCICIO 24" + ut.RESET);
                System.out.println(
                        """
                                Escribe un programa que lea un número n e imprima una pirámide de números con n filas
                                como se muestra en los siguientes ejemplos:
                                        """);
                altura = Integer.parseInt(System.console().readLine("Introduce la altura de la pirámide"));

                y = 1;
                aux = altura;
                numeron = 0;
                for (i = 0; i < altura; i++) {
                    aux -= 1;
                    numero = 0;
                    for (int j = 0; j < aux; j++) {
                        System.out.print(" ");
                    }

                    for (int j = 0; j < y; j++) {
                        if (numero > (int) Math.ceil(y / 2)) {
                            numeron -= 1;
                            System.out.print(numeron);
                        } else {
                            numero += 1;
                            System.out.print(numero);
                            numeron = numero;
                        }
                    }

                    for (int j = 0; j < aux - 1; j++) {
                        System.out.print(" ");
                    }
                    System.out.println(" ");
                    y += 2;
                }

                break;

            case 25: // EJERCICIO 25
                System.out.println(ut.GREEN_BOLD + "EJERCICIO 25" + ut.RESET);
                System.out.println(
                        """
                                PENDIENTE !!!
                                    """);
                numero = Integer.parseInt(System.console().readLine("Introduce un número: "));

                break;

            case 26: // EJERCICIO 26
                System.out.println(ut.GREEN_BOLD + "EJERCICIO 26" + ut.RESET);
                System.out.println(
                        """
                                Realiza un programa que pida primero un número y a continuación un dígito. El programa nos debe dat la posición (o posiciones),
                                contanto de izquierda a derecha en el número introducido
                                        """);
                String numeroString = System.console().readLine("Introduce un número: ");
                char numerocaracter = System.console().readLine("Introduce un número: ").charAt(0);

                for (i = 0; i < numeroString.length(); i++) {
                    if (numeroString.charAt(i) == numerocaracter) {
                        System.out.print((i + 1) + " ");
                    }
                }
                break;

            case 27: // EJERCICIO 27
                System.out.println(ut.GREEN_BOLD + "EJERCICIO 27" + ut.RESET);
                System.out.println(
                        """
                                Escribe un programa que muestre, cuente y sume los múltiplos de 3 que hay entre 1 y un número leido por
                                teclado.
                                    """);
                numero = Integer.parseInt(System.console().readLine("Introduce un número entero mayor que 1: "));
                suma_num = 0;
                int veces = (int) Math.floor(numero / 3);

                for (i = 1; i <= veces; i++) {
                    System.out.print(i * 3 + " ");
                    suma_num += (i * 3);
                }
                System.out.printf("%nDesde 1 hasta %d hay %d múltiplos de 3 y suman %d.", numero, veces,
                        (int) suma_num);
                break;

            case 28: // EJERCICIO 28
                System.out.println(ut.GREEN_BOLD + "EJERCICIO 28" + ut.RESET);
                System.out.println(
                        """
                                Escribe un programa que calcule el factorial de un número entero leido por teclado.
                                    """);
                numero = Integer.parseInt(System.console().readLine("Por favor, introduzca un número entero: "));
                int fact = 1;

                for (i = numero; i > 0; i--) {
                    fact *= i;
                }
                System.out.println(numero + "! = " + fact);
                break;

            case 29: // EJERCICIO 29
                System.out.println(ut.GREEN_BOLD + "EJERCICIO 29" + ut.RESET);
                System.out.println(
                        """
                                Escribe un programa que muestre por pantalla todos los números enteros positivos menores a uno leído por
                                teclado que no sean divisible entre otro tamnbién leido por teclado de igual forma.
                                    """);

                numero = Integer.parseInt(
                        System.console().readLine("Introduzca un número entero positivo (relatvamente grande): "));
                numeron = Integer
                        .parseInt(System.console().readLine("Introduzca otro número (relativamente pequeño): "));
                System.out.printf(
                        "Los números entero positivos menores a %d que no son divisibles entre %d son los siguientes: %n",
                        numero, numeron);

                for (i = 1; i <= numero; i++) {
                    if (i % numeron != 0) {
                        System.out.print(i + " ");
                    }
                }
                break;

            case 30: // EJERCICIO 30
                System.out.println(ut.GREEN_BOLD + "EJERCICIO 30" + ut.RESET);
                System.out.println(
                        """
                                Realiza un programa que calcule las horas transcurridas entre dos horas de dos días de la semana.
                                No se tendrán en cuenta los minutos ni los segundos. El día de la semana se puede pedir como un número
                                (del 1 al 7) o como una cadena (de "lunes" a "domingo"). Se debe comprobar que el usuario introduce los datos
                                correctamente y que el segundo día es posterior al primero.

                                PENDIENTE!!!
                                    """);

                boolean correcto = true;
                String dia1 = "";
                String dia2 = "";
                int horaDia1 = 0;
                int horaDia2 = 0;
                int dia1Int = 0;
                int dia2Int = 0;

                do {
                    dia1 = System.console().readLine("Introduce dia 1: ");
                    dia1Int = switch (dia1.toLowerCase()) {
                        case "1", "lunes" -> 1;
                        case "2", "martes" -> 2;
                        case "3", "miercoles", "miércoles" -> 3;
                        case "4", "jueves" -> 4;
                        case "5", "viernes" -> 5;
                        case "6", "sabado" -> 6;
                        case "7", "domingo" -> 7;
                        default -> 8;
                    };
                    if (dia1Int < 1 || dia1Int > 7) {
                        System.out.println("Introduce un día del 1-7 o de Lunes-Domingo");
                    } else
                        correcto = false;
                } while (correcto);

                do {
                    try {
                        correcto = true;
                        horaDia1 = Integer.parseInt(System.console().readLine("Introduce la hora del día 1 -> "));
                        if (horaDia1 < 0 || horaDia1 > 23) {
                            System.out.println("Introduce de 0-23 horas");
                        } else {
                            correcto = false;
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("\nERROR: INTRODUCE UN NÚMERO!!!\n");
                    } catch (Exception e) {
                        System.out.println("\nERROR INESPERADO!!!\n");
                    }

                } while (correcto);

                do {
                    correcto = true;
                    dia2 = System.console().readLine("Introduce dia 2: ");
                    dia2Int = switch (dia2.toLowerCase()) {
                        case "1", "lunes" -> 1;
                        case "2", "martes" -> 2;
                        case "3", "miercoles", "miércoles" -> 3;
                        case "4", "jueves" -> 4;
                        case "5", "viernes" -> 5;
                        case "6", "sabado" -> 6;
                        case "7", "domingo" -> 7;
                        default -> 8;
                    };

                    if (dia2Int < 1 || dia2Int > 7) {
                        System.out.println("Introduce un día del 1-7 o de Lunes-Domingo");
                    } else if (dia1Int > dia2Int) {
                        System.out.println("El segundo día tiene que ser mayor que el primero.");
                    } else {
                        correcto = false;
                    }

                } while (correcto);

                do {
                    try {
                        correcto = true;
                        horaDia2 = Integer.parseInt(System.console().readLine("Introduce la hora del día 2 -> "));
                        if (dia1Int == dia2Int && horaDia1 > horaDia2) {
                            System.out.println("La hora del día 1 tiene que ser mayor o igual que la del dia 2");
                        } else if (horaDia1 < 0 || horaDia1 > 23) {
                            System.out.println("Introduce de 0-23 horas");

                        } else {
                            correcto = false;
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("\nERROR: INTRODUCE UN NÚMERO!!!\n");
                    } catch (Exception e) {
                        System.out.println("\nERROR INESPERADO!!!\n");
                    }

                } while (correcto);
                System.out.println(dia1 + " " + dia2 + " ");

                // Ya tengo los días y las horas, solo me queda calcular cuanto hay entre una y
                // otras
                int horas_entre_dias = (dia2Int * 24 + horaDia2) - (dia1Int * 24 + horaDia1);

                System.out.println(horas_entre_dias);
                break;

            case 31: // EJERCICIO 31
                System.out.println(ut.GREEN_BOLD + "EJERCICIO 31" + ut.RESET);
                System.out.println(
                        """
                                Realiza un programa que pinte la letra L por pantalla hecha con asterisco. El programa pedirá la altura.
                                El palo horizontal tendrá una longitud de la mitad (división entera entre 2) de la altura más uno.
                                    """);
                numero = Integer.parseInt(System.console().readLine("Introduzca la altura de la L: "));

                for (i = 0; i < numero - 1; i++) {
                    System.out.println("*");
                }
                for (i = 0; i < (int) Math.ceil(numero / 2) + 1; i++) {
                    System.out.print("* ");
                }
                break;

            case 32: // EJERCICIO 32
                System.out.println(ut.GREEN_BOLD + "EJERCICIO 32" + ut.RESET);
                System.out.println(
                        """
                                Escribe un programa que, dado un número entero positivo, diga cuáles son y cuánto suman los dígitos pares.
                                Los dígitos pares se deben mostrar en orden, de izquierda a derecha. Usa long en lugar de int doende sea necesario,
                                para admitir números largos.
                                    """);

                do {
                    numero = Integer.parseInt(System.console().readLine("Introduce un número entero positivo: "));
                } while (numero < 0);

                String sumapar = "";
                numeroString = numero + "";
                int suma_num_int = 0;

                for (i = 0; i < numeroString.length(); i++) {

                    digitosn = Character.getNumericValue(numeroString.charAt(i));
                    if (digitosn % 2 == 0) {
                        sumapar = sumapar + (digitosn + " ");
                        suma_num_int += digitosn;
                    }
                }
                System.out.println("numeros pares: " + sumapar);
                System.out.println("suma numeros pares: " + suma_num_int);
                break;

            case 33: // EJERCICIO 33
                System.out.println(ut.GREEN_BOLD + "EJERCICIO 33" + ut.RESET);
                System.out.println(
                        """
                                Realiza un programa que pinte la letra U por pantalla hecha con asteriscos. El Programa pedirá la altura. Fíjate que el
                                programa inserta un espacio delante de la figura. Además se pintan dos asteriscos menos en la base para simular la curvatura
                                de las esquinas inferiores
                                    """);

                numero = Integer.parseInt(System.console().readLine("Introduzca la altura de la U: "));
                anchon = (int) Math.ceil(numero / 2);

                for (i = 1; i <= numero; i++) {
                    if (i == numero) {
                        for (int j = 1; j <= numero; j++) {
                            if (j == 1 || j == numero) {
                                System.out.print(" ");
                            } else
                                System.out.print("* ");
                        }
                    } else {
                        int n = ((numero % 2) == 0 ? (numero - 1) : numero);
                        System.out.printf("*" + "%" + n + "s" + "*%n", ""); // % + ANCHO + s no me funciona, no se
                                                                            // porque
                    }
                }
                break;

            case 34: // EJERCICIO 34
                System.out.println(ut.GREEN_BOLD + "EJERCICIO 34" + ut.RESET);
                System.out.println(
                        """
                                Escribe un programa que pida dos números por teclado y que luego mezcle en dos números
                                diferentes los dígitos pares y los impares. Se van comprobando los dígitos de la siguiente manera:
                                primer dígito del primer número,primer digito del segundo número,segundo dígito del primer número, segundo
                                dígito del segundo número... Para facilitar el ejercicio, podemos suponner que el usuario introducirá dos números de la misma
                                longitud y que siempre habrá al menos un dígito par y uno impar. Usa long en lugar de int donde sea necesario
                                para admitir números largos.
                                    """);
                sumapar = "";
                String sumaimp = "";
                String numerodosString = "";
                do {
                    numeroString = System.console().readLine("Introduce el primer número: ");
                    numerodosString = System.console().readLine("Introduce el primer número: ");
                    if (!(numeroString.length() == numerodosString.length())) {
                        System.out.println("Introduce dos números de la misma longitud!!!");
                    }
                } while (!(numeroString.length() == numerodosString.length()));

                numero = Integer.parseInt(numeroString);
                numeron = Integer.parseInt(numerodosString);

                for (i = 0; i < numeroString.length(); i++) {

                    for (int j = 0; j < 2; j++) {

                        if (j == 0) {
                            digitosn = Character.getNumericValue(numeroString.charAt(i));
                            if (digitosn % 2 == 0) {
                                sumapar = (sumapar + "" + digitosn);
                            } else {
                                sumaimp = (sumaimp + "" + digitosn);
                            }
                        } else {
                            digitosn = Character.getNumericValue(numerodosString.charAt(i));
                            if (digitosn % 2 == 0) {
                                sumapar = (sumapar + "" + digitosn);
                            } else {
                                sumaimp = (sumaimp + "" + digitosn);
                            }
                        }

                    }
                }
                System.out.println(sumapar);
                System.out.println(sumaimp);

            case 35: // EJERCICIO 35
                System.out.println(ut.GREEN_BOLD + "EJERCICIO 35" + ut.RESET);
                System.out.println(
                        """
                                Realiz un programa que pinte una X hecha de asteriscos. El programa debe pedir la altura. Se debe
                                comprobar que la altura sea un número impar mayor o igual a 3, en caso contrario se debe mostrar un mensaje
                                de error.
                                    """);
                correcto = true;

                do {
                    altura = Integer.parseInt(System.console().readLine("Por favor, introduce la altura de la X: "));
                    if (altura % 2 == 0 || altura < 3) {
                        System.out.println("\nIntroduce números impares o un número mayor o igual a 3!!!\n");
                    } else {
                        correcto = false;
                    }
                } while (correcto);

                int fila = altura - 1;

                for (i = 0; i < altura; i++) {
                    for (int j = 0; j < altura; j++) {
                        if (i == j || j == fila) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println(" ");
                    fila--;

                }
                break;

            case 36: // EJERCICIO 36
                System.out.println(ut.GREEN_BOLD + "EJERCICIO 36" + ut.RESET);
                System.out.println(
                        """
                                Escribe un programa que diga si un número introducido por teclado es o no capicúa. Los números capicúa se leen igual
                                hacia delante y hacia atraás. El programa debe aceptar número de cualquier longitud siempre que lo permita el tipo, en caso contrario
                                el ejercicio no se dará por bueno. Se recomienda usar long en lugar de int ya que el primero admite números más largos.
                                    """);
                numero_long = Long
                        .parseLong(System.console().readLine("Por favor introduzca un número entero positivo: "));

                aux_long = numero_long;
                long aux_longReverse = 0;

                while (aux_long > 0) {
                    aux_longReverse = aux_longReverse * 10 + (aux_long % 10);
                    aux_long /= 10;
                }

                if (numero_long == aux_longReverse) {
                    System.out.printf("El %d es capicúa", numero_long);
                } else
                    System.out.printf("El %d no es capicúa", numero_long);

                break;

            case 37: // EJERCICIO 37
                System.out.println(ut.GREEN_BOLD + "EJERCICIO 37" + ut.RESET);
                System.out.println(
                        """
                                Realiza un conversor del sistema decimal al sistema de "palotes". En este sistema cada dígito se representa por
                                su correspondiente números de palotes. Por ejemplo ek 1 se representa con un palote (|), el 2 con dos palotes (||) y
                                así sucesivamente. El cero es la ausencia de palotes. Cada dígito se separa del siguiente con n guión (-).
                                        """);

                numero = Integer
                        .parseInt(System.console().readLine("Por favor introduzca un número entero positivo: "));

                correcto = false;
                aux = numero;
                digitosn = 0;

                while (aux > 0) {
                    aux /= 10;
                    digitosn++;
                }

                aux = numero;
                System.out.printf("El %d en decimal es el ", numero);
                for (i = 1; i <= digitosn; i++) {
                    aux = numero / (int) (Math.pow(10, digitosn - i));
                    for (int j = 0; j < aux; j++) {
                        System.out.print("| ");
                    }
                    numero = numero % (int) (Math.pow(10, digitosn - i));
                    if (i != digitosn) {
                        System.out.print("- ");
                    }
                }
                System.out.print("en el sistema de palotes.");
                break;

            case 38: // EJERCICIO 38
                System.out.println(ut.GREEN_BOLD + "EJERCICIO 38" + ut.RESET);
                System.out.println(
                        """
                                Realiza un programa que pinte un reloj de arena relleno hecho de asteriscos. El programa
                                debe pedir la altura. Se debe comprobar que la altura se un número impar mayor o igual a 3, en caso
                                contrariose debe mostrar un mensaje de error.
                                        """);
                altura = Integer.parseInt(System.console().readLine("Introduce la altura mayor a 2: "));

                int asteriscos = altura;
                int espacios = 0;
                aux = altura;
                int mitad = (int) Math.ceil(altura / 2);

                for (i = 0; i < altura; i++) {
                    for (int j = 0; j < espacios; j++) {
                        System.out.print(" ");
                    }
                    for (int j = 0; j < asteriscos; j++) {
                        System.out.print("*");
                    }

                    if (i >= mitad) {
                        espacios--;
                        asteriscos += 2;
                    } else {
                        espacios++;
                        asteriscos -= 2;
                    }
                    System.out.println("");
                }
                break;

            case 39: // EJERCICIO 39
                System.out.println(ut.GREEN_BOLD + "EJERCICIO 39" + ut.RESET);
                System.out.println(
                        """
                                Escribe un programa que pida un número entero positivo por teclado y que muestre a continuación
                                los números desde el 1 al número introducido junto con su factorial.
                                        """);

                numero = Integer
                        .parseInt(System.console().readLine("Por favor, introduzca un número entero positivo: "));

                for (i = 1; i <= numero; i++) {
                    int factorial = 1;
                    for (int j = 1; j <= i; j++) {
                        factorial *= j;
                    }
                    System.out.printf("%d! = %d%n", i, factorial);
                }
                break;

            case 40: // EJERCICIO 40
                System.out.println(ut.GREEN_BOLD + "EJERCICIO 40" + ut.RESET);
                System.out.println(
                        """
                                Realiza un programa que pinte por pantalla un rombo hueco hecho con asteriscos.
                                El programa debe pedir la altura. Se debe comprobar que la altura sea un número
                                impar mayor o igual a 3, en case contrario se debe mostrar un mensaje de error.
                                        """);

                altura = Integer.parseInt(System.console().readLine("Por favor introduzca la altura del rombo: "));

                mitad = (int) Math.ceil(altura / 2);
                espacios = altura - mitad;
                asteriscos = 1;

                for (i = 0; i < altura; i++) {
                    for (int j = 0; j < espacios; j++) {
                        System.out.print(" ");
                    }
                    for (int j = 1; j <= asteriscos; j++) {
                        if (asteriscos == j || j == 1) {
                            System.out.print("*");
                        } else
                            System.out.print(" ");
                    }
                    if (i < mitad) {
                        espacios--;
                        asteriscos += 2;
                    } else {
                        espacios++;
                        asteriscos -= 2;
                    }

                    System.out.println(" ");
                }
                break;

            case 41: // EJERCICIO 41
                System.out.println(ut.GREEN_BOLD + "EJERCICIO 41" + ut.RESET);
                System.out.println(
                        """
                                Escribe un programa que diga cuántos dígitos pares y cuántos dígitos impares hay dentro de un número.
                                Se recomienda usar long en lugar de int ya que el primero admite números más largos.
                                        """);

                numero_long = Long.parseLong(System.console().readLine("Introduce un número positivo: "));

                aux_long = numero_long;
                contador_impar = 0;
                int contador_par = 0;
                long digiton_long = 0;

                while (aux_long > 0) {
                    digiton_long = aux_long % 10;
                    if (digiton_long % 2 == 0) {
                        contador_par++;
                    } else {
                        contador_impar++;
                    }
                    aux_long /= 10;
                }
                System.out.printf("Numero: %d | Pares: %d | Impares: %d%n", numero_long, contador_par, contador_impar);
                break;

            case 42: // EJERCICIO 42
                System.out.println(ut.GREEN_BOLD + "EJERCICIO 42" + ut.RESET);
                System.out.println(
                        """
                                Escribe un programa que pida un número entero positivo por teclado y que muestre a continuación los 5 números consecutivo a
                                partir del número introducido. Al lado de cada número se debe indicar si se trata de un primo o no.
                                        """);
                numero = Integer
                        .parseInt(System.console().readLine("Por favor, introduzca un número entero positivo: "));

                for (i = numero; i < numero + 5; i++) {
                    esprimo = true;
                    for (int j = 2; j <= Math.sqrt(i); j++) {
                        if (i % j == 0) {
                            System.out.printf("%d no es primo%n", i);
                            esprimo = false;
                            j = (int) Math.sqrt(i);
                        }
                    }
                    if (esprimo) {
                        System.out.printf("%d es primo%n", i);
                    }
                }
                break;

            case 43: // EJERCICIO 43
                System.out.println(ut.GREEN_BOLD + "EJERCICIO 43" + ut.RESET);
                System.out.println(
                        """
                                Escribe un programa que permita partir un número introducido por teclado en dos partes.
                                Las posiciones se cuentan de izquierda a derecha empezando por el 1. Suponemos que el usuario
                                introduce correctamente los datos, es decir, el número introducido tiene dos dígitos como
                                mínimo y la posición en la que se parte el número está entre 2 y la longitud del número.
                                No se permiten el uso de funciones de manejo de Strings.
                                        """);
                numero = Integer
                        .parseInt(System.console().readLine("Por favor, introduzca un número entero positivo: "));
                digitosn = Integer.parseInt(System.console()
                        .readLine("Introduzca la posicióna partir de la cual quiere partir el número: "));

                aux = numero * 10 + 1;
                aux_longReverse = 0;
                int contador = 0;

                while (aux > 0) {
                    aux_longReverse = aux_longReverse * 10 + (aux % 10);
                    aux /= 10;
                    contador++;
                }

                numeron = 0;
                int numeron2 = 0;

                for (i = 1; i < contador; i++) {
                    if (i < digitosn) {
                        numeron = numeron * 10 + (int) (aux_longReverse % 10);
                    } else {
                        numeron2 = numeron2 * 10 + (int) (aux_longReverse % 10);
                    }
                    aux_longReverse /= 10;
                }

                System.out.printf("Los números partidos son el %d y el %d.", numeron, numeron2);
                break;

            case 44: // EJERCICIO 44
                System.out.println(ut.GREEN_BOLD + "EJERCICIO 44" + ut.RESET);
                System.out.println(
                        """
                                Escribe un programa que sea capaz de insertar un dígito dentro de un núermo indicando
                                la posición. El nuevodígito se colocará en la posición indicada y el resto de dígitos se
                                desplazará hacia la derecha.
                                        """);
                numero = Integer
                        .parseInt(System.console().readLine("Por favor, introduzca un número entero positivo: "));

                int posicion = Integer
                        .parseInt(System.console().readLine("Introduzca la posición donde quiere insertar: "));
                digitosn = Integer.parseInt(System.console()
                        .readLine("Introduzca el dígtito que quiere insertar: "));

                aux = numero * 10 + 1;
                aux_longReverse = 0;
                contador = 0;

                while (aux > 0) {
                    aux_longReverse = aux_longReverse * 10 + (aux % 10);
                    aux /= 10;
                    contador++;
                }
                

                for (i = 1; i < contador; i++) {
                    if (i == posicion) {
                        aux = aux * 10 + digitosn;
                    }
                    aux = aux * 10 + (int)(aux_longReverse % 10);
                    aux_longReverse /= 10;
                }
                System.out.println("El número resultante es " + aux);
                break;

                case 45: // EJERCICIO 45
                System.out.println(ut.GREEN_BOLD + "EJERCICIO 45" + ut.RESET);
                System.out.println(
                        """
                                Escribe un programa que cambie un dígito dentro de un número dando la posición y 
                                el valor nuevo. Las posiciones se cuentan de izquierda a derecha empezando por el I. 
                                Se recomienda usar long en lugar de int ya que el primero admite números más largos. 
                                Suponemos que el usuario introduce correctamente los datos.
                                        """);

                numero_long = Long
                        .parseLong(System.console().readLine("Por favor, introduzca un número entero positivo: "));

                posicion = Integer
                        .parseInt(System.console().readLine("Introduzca la posición donde quiere insertar: "));

                digitosn = Integer.parseInt(System.console()
                        .readLine("Introduzca el dígtito que quiere insertar: "));

                aux_long = numero_long * 10 + 1;
                aux_longReverse = 0;
                contador = 0;

                while (aux_long > 0) {
                    aux_longReverse = aux_longReverse * 10 + (aux_long % 10);
                    aux_long /= 10;
                    contador++;
                }
                

                for (i = 1; i < contador; i++) {
                    if (i == posicion) {
                        aux_long = aux_long * 10 + digitosn;
                    } else {
                        aux_long = aux_long * 10 + (int)(aux_longReverse % 10);
                    }
                    aux_longReverse /= 10;
                }
                System.out.println("El número resultante es " + aux_long);
                break;

                case 46: // EJERCICIO 46
                System.out.println(ut.GREEN_BOLD + "EJERCICIO 45" + ut.RESET);
                System.out.println(
                        """
                                Realiza un programa que pinte por pantalla un rectángulo hueco hecho con asteriscos. 
                                Se debe pedir al usuario la anchura y la altura. Hay que comprobar que tanto la anchura
                                como la altura sean mayores o iguales que 2, en caso contrario se debe mostrar
                                un mensaje de error.
                                        """);

                anchon = Integer
                        .parseInt(System.console().readLine("Anchura rectángulo: "));

                altura = Integer
                        .parseInt(System.console().readLine("Altura rectángulo: "));

                for (i = 1; i <= altura; i++){
                    for (int j = 1; j <= anchon; j++) {
                        if (i == 1 || i == altura || j == 1 || j == anchon) {
                            System.out.print("* ");
                        } else {
                            System.out.print("  ");
                        }
                    }
                    System.out.println(" ");
                }

                case 59: // EJERCICIO 59
                System.out.println(ut.GREEN_BOLD + "EJERCICIO 59" + ut.RESET);
                System.out.println(
                        """
                                Escribe un programa que pinte por pantalla un árbol de navidad.El usuario debe introducir la altura.
                                Suponemos que el usuario introduce una altura mayor o igual a 4.
                                        """);

                                        altura = Integer
                                        .parseInt(System.console().readLine("Altura : "));

                                        aux = altura;
                                        espacios = (altura - 2);
                                        System.out.printf("%" + (espacios + 1) + "s%n", "*");
                                        int pintar = 1;


                                        for (i = 0; i < altura-2; i++) {
                                            System.out.printf("%" + espacios + "s", " ");
                                            espacios--;
                                            for (int j = 0; j < pintar; j++) {
                                                if (j == 0 || j == pintar-1 || i == altura-3) {
                                                    System.out.print("^");
                                                } else {
                                                    System.out.print(" ");
                                                }
                                            }
                                            pintar += 2;
                                            System.out.println(" ");
                                        }
                                        System.out.printf("%" + (altura - 1) + "s%n", "Y");
        }
    }
}