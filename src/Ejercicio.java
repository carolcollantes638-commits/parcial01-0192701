import java.util.Scanner;

public class Ejercicio {

        public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int[] consumo = new int[10];

        int total = 0;
        int mayor;
        int sectorMayor = 1;

        for (int i = 0; i < 10; i++) {

            System.out.print("Ingrese el consumo del sector " + (i + 1) + ": ");
            int valor = teclado.nextInt();

            while (valor < 0) {
                System.out.print("El consumo no puede ser negativo. "
                        + "Ingrese nuevamente: ");
                valor = teclado.nextInt();
            }

            consumo[i] = valor;
            total = total + consumo[i];
        }

        double promedio = (double) total / 10;

        mayor = consumo[0];

        for (int i = 1; i < 10; i++) {

            if (consumo[i] > mayor) {
                mayor = consumo[i];
                sectorMayor = i + 1;
            }
        }

        int cantidadSuperior = 0;
        int rachaActual = 0;
        int rachaMayor = 0;

        for (int i = 0; i < 10; i++) {

            if (consumo[i] > promedio) {

                cantidadSuperior++;
                rachaActual++;

                if (rachaActual > rachaMayor) {
                    rachaMayor = rachaActual;
                }

            } else {
                rachaActual = 0;
            }
        }

        System.out.println("RESULTADOS");

        System.out.println("Consumo total: " + total + " m3");
        System.out.println("Promedio de consumo: " + promedio + " m3");
        System.out.println("Sector con mayor consumo: "
                + sectorMayor + " (" + mayor + " m3)");
        System.out.println("Sectores con consumo superior al promedio: "
                + cantidadSuperior);
        System.out.println("Racha más larga de sectores consecutivos "
                + "superior al promedio: " + rachaMayor);

        
        System.out.println("LISTADO DE SECTORES");

        for (int i = 0; i < 10; i++) {
            System.out.println("Sector " + (i + 1)
                    + ": " + consumo[i] + " m3");
        }

        teclado.close();
    }
}