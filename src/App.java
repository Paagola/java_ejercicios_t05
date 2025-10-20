public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("""
                            ELIGE UN EJERCICIO
                -----------------------------------------
                EJERCICIO 1 -> 1   |
                EJERCICIO 2 -> 2   |
                EJERCICIO 3 -> 3   |
                EJERCICIO 4 -> 4   |
                """);
        System.out.print("-> ");
        int num = Integer.parseInt(System.console().readLine());
        System.out.println();

        switch (num) {

            case 1: // EJERCICIO 1
                System.out.println(ut.GREEN_BOLD + "EJERCICIO 1" + ut.RESET);
                System.out.println(
                        """
                                Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle for. Los números se pueden mostrar uno
                                debajo del otro, en una sola columna; o bien uno al lado del otro, en una misma fila.
                                        """);

                int numero_uno = 5;
                for (int i = 0; i < 21; i += 1) {
                    System.out.print(numero_uno * i + " ");
                }
                System.out.println();
                break;

            case 2: // EJERCICIO 2
                System.out.println(ut.GREEN_BOLD + "EJERCICIO 2" + ut.RESET);
                System.out.println(
                        """
                                Muestra dos números múltiplos de 5 de 0 a 100 utilizando un bucle while.
                                """);

                int numero_dos = 5;
                int i = 0;
                while (i < 21) {
                    System.err.print(numero_dos * i + " ");
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

                int numero_tres = 5;
                i = 0;

                do {
                    System.out.print(numero_tres * i + " ");
                    i += 1;
                } while (i < 21);
                System.err.println();
                break;
            
            case 4: // EJERCICIO 4
                 System.out.println(ut.GREEN_BOLD + "EJERCICIO 4" + ut.RESET);
                System.out.println(
                        """
                        Muestra los números del 320 al 160, contando de 20 en 20 utilizando un bucle for.
                                """);
                
                int numero_cuatro;
                for (numero_cuatro = 340; numero_cuatro >= 160; numero_cuatro -= 20);
                    System.out.println(numero_cuatro + " ");


                break;
                            

            default:
                System.err.println("El ejercicio que has seleccionado no existe.");
        }
    }
}
