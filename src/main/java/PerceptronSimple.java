import java.util.Random;
import java.util.Scanner;

public class PerceptronSimple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        float w0, w1, w2;
        int opcion;

        System.out.println("Seleccione una opción:");
        System.out.println("1. Iniciar con Xteta = 1, w1 = 0.5, w2 = 1.5, wteta = 1.5");
        System.out.println("2. Iniciar con pesos aleatorios de w1 y w2");
        opcion = scanner.nextInt();

        if (opcion == 1) {
            w0 = 1.5f;
            w1 = 0.5f;
            w2 = 1.5f;
        } else {
            w0 = random.nextFloat();
            w1 = random.nextFloat();
            w2 = random.nextFloat();
        }

        float[][] entradas = {
                {1f, 1f, 1f},
                {1f, 1f, -1f},
                {1f, -1f, 1f},
                {1f, -1f, -1f},
        };

        float[] salidas = {1f, -1f, -1f, -1f};
        float factorAprendizaje = (random.nextInt(8) + 2) / 10.0f;
        float y, error;
        int fila = 0, repeticion = 1;

        System.out.println("Perceptrón AND");
        System.out.println("Factor de Aprendizaje: " + factorAprendizaje);
        System.out.println("Pesos Iniciales: w0 = " + w0 + ", w1 = " + w1 + ", w2 = " + w2);

        while (fila < 4) {
            y = w0 * entradas[fila][0] + w1 * entradas[fila][1] + w2 * entradas[fila][2];
            y = (y >= 0) ? 1 : -1;
            error = salidas[fila] - y;

            if (error == 0) {
                fila++;
            } else {
                w0 += factorAprendizaje * error * entradas[fila][0];
                w1 += factorAprendizaje * error * entradas[fila][1];
                w2 += factorAprendizaje * error * entradas[fila][2];
                fila = 0;
                repeticion++;
            }
        }

        System.out.println("Pesos Finales: w0 = " + w0 + ", w1 = " + w1 + ", w2 = " + w2);
        System.out.println("Total de iteraciones: " + repeticion);

        System.out.println("Ingrese la entrada 1 (1,-1):");
        int entrada1 = scanner.nextInt();
        System.out.println("Ingrese la entrada 2 (1,-1):");
        int entrada2 = scanner.nextInt();

        y = (w0 * 1) + (w1 * entrada1) + (w2 * entrada2);
        y = (y >= 0) ? 1 : -1;
        System.out.println("La salida es: " + y);

        scanner.close();
    }
}
