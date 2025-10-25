public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("""
                            ELIGE UN EJERCICIO
                -----------------------------------------
                EJERCICIO 1 -> 1   | EJERCICIO 8 -> 8   |
                EJERCICIO 2 -> 2   | EJERCICIO 9 -> 9   |
                EJERCICIO 3 -> 3   | EJERCICIO 10 -> 10 |
                EJERCICIO 4 -> 4   |
                EJERCICIO 5 -> 5   |
                EJERCICIO 6 -> 6   |
                EJERCICIO 7 -> 7   |
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
                long aux = numero_long;
                i = 1;
                boolean verdadero = true;
                if (numero_long > 1)
                    while (verdadero) {
                        aux /= 10;
                        if (aux > 0)
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

            default:
                System.out.println("El ejercicio que has seleccionado no existe.");
        }
    }
}
