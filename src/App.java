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
                
                for (i = 340; i >= 160; i-= 20 ) {
                    System.out.println(i + "");
                    
                }

            case 5: //EJERCICIO 5
            System.out.println(ut.GREEN_BOLD + "EJERCICIO 4" + ut.RESET);
            System.out.println(
                    """
                        Muestra los números del 320 al 160, contando de 20 en 20 utilizando un bucle while.
                            """);

                numero = 340;
                
                
                break;
                            

            default:
                System.out.println("El ejercicio que has seleccionado no existe.");
        }
    }
}
