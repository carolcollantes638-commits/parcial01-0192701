import java.util.Scanner;

public class Ejercicio2{

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int[][] produccion = new int[4][5];

        for (int i = 0; i < 4; i++) {

            for (int j = 0; j < 5; j++) {

                System.out.print("Ingrese la producción de la máquina "
                        + (i + 1) + " del día " + (j + 1) + ": ");

                int valor = teclado.nextInt();

            
                while (valor < 0) {
                    System.out.print("El valor no puede ser negativo. "
                            + "Ingrese nuevamente: ");
                    valor = teclado.nextInt();
                }

                produccion[i][j] = valor;
            }
        }

        System.out.println("TOTAL POR MÁQUINA");

        int mayorProduccion = 0;
        int maquinaMayor = 1;

        for (int i = 0; i < 4; i++) {

            int totalMaquina = 0;

            for (int j = 0; j < 5; j++) {
                totalMaquina = totalMaquina + produccion[i][j];
            }

            System.out.println("Máquina " + (i + 1) + ": "
                    + totalMaquina + " piezas");

            if (i == 0 || totalMaquina > mayorProduccion) {
                mayorProduccion = totalMaquina;
                maquinaMayor = i + 1;
            }
        }

        System.out.println("TOTAL POR DÍA");

        int menorProduccion = 0;
        int diaMenor = 1;

        for (int j = 0; j < 5; j++) {

            int totalDia = 0;

            for (int i = 0; i < 4; i++) {
                totalDia = totalDia + produccion[i][j];
            }

            System.out.println("Día " + (j + 1) + ": "
                    + totalDia + " piezas");

            if (j == 0 || totalDia < menorProduccion) {
                menorProduccion = totalDia;
                diaMenor = j + 1;
            }
        }

        int cantidadMenores20 = 0;

        for (int i = 0; i < 4; i++) {

            for (int j = 0; j < 5; j++) {

                if (produccion[i][j] < 20) {
                    cantidadMenores20++;
                }
            }
        }

        
        System.out.println(" RESULTADOS ");

        System.out.println("Máquina con mayor producción: Máquina "
                + maquinaMayor + " con " + mayorProduccion + " piezas");

        System.out.println("Día con menor producción: Día "
                + diaMenor + " con " + menorProduccion + " piezas");

        System.out.println("Registros inferiores a 20 piezas: "
                + cantidadMenores20);

        
        System.out.println(" MATRIZ DE PRODUCCIÓN");

        System.out.print("          ");
        for (int j = 0; j < 5; j++) {
            System.out.print("Día " + (j + 1) + "    ");
        }

        System.out.println();

        for (int i = 0; i < 4; i++) {

            System.out.print("Máquina " + (i + 1) + "   ");

            for (int j = 0; j < 5; j++) {
                System.out.print(produccion[i][j] + "          ");
            }

            System.out.println();
        }

        teclado.close();
    }
}