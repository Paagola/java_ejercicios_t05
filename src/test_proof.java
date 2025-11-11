public class test_proof {
    
    
    public static void main(String[] args) throws InterruptedException {
        int tamaño = 11; // Tamaño impar para tener centro exacto
        
        // Los 4 patrones de la esvástica rotada - MEJORADOS
        String[] patrones = {
            // 0 grados - ESVÁSTICA CORRECTA
            "11111111111" +
            "00000000001" +
            "00000000001" +
            "00000000001" +
            "00000000001" +
            "11111111111" +
            "00000000001" +
            "00000000001" +
            "00000000001" +
            "00000000001" +
            "11111111111",
            
            // 90 grados - ESVÁSTICA CORRECTA
            "11111011111" +
            "00001000000" +
            "00001000000" +
            "00001000000" +
            "11111111111" +
            "00001000000" +
            "00001000000" +
            "00001000000" +
            "00001000000" +
            "00001000000" +
            "11111011111",
            
            // 180 grados - ESVÁSTICA CORRECTA
            "11111111111" +
            "10000000000" +
            "10000000000" +
            "10000000000" +
            "10000000000" +
            "11111111111" +
            "10000000000" +
            "10000000000" +
            "10000000000" +
            "10000000000" +
            "11111111111",
            
            // 270 grados - ESVÁSTICA CORRECTA
            "11111111111" +
            "10000010000" +
            "10000010000" +
            "10000010000" +
            "11111111111" +
            "10000010000" +
            "10000010000" +
            "10000010000" +
            "10000010000" +
            "10000010000" +
            "11111111111"
        };
        
        int patronActual = 0;
        
        while (true) {
            // Limpiar consola
            for (int i = 0; i < 20; i++) {
                System.out.println();
            }
            
            System.out.println("Esvástica girando - Posición: " + (patronActual * 90) + "°");
            System.out.println();
            
            // Dibujar el patrón actual
            String patron = patrones[patronActual];
            for (int i = 0; i < tamaño; i++) {
                for (int j = 0; j < tamaño; j++) {
                    char c = patron.charAt(i * tamaño + j);
                    System.out.print(c == '1' ? "██" : "  ");
                }
                System.out.println();
            }
            
            patronActual = (patronActual + 1) % 4;
            Thread.sleep(1000);
        }
    }
}


