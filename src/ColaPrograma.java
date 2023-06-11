

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
//Autor Nelson Enriquez
public class ColaPrograma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Cola basada en arrays
        Queue<Integer> colaArray = new ArrayDeque<>();

        // Cola basada en listas
        Queue<Integer> colaLista = new LinkedList<>();

        int opcion;

        do {
            System.out.println("Colas");
            System.out.println("1. Basada en Arrays");
            System.out.println("2. Basada en Listas");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    menuCola(colaArray, scanner);
                    break;
                case 2:
                    menuCola(colaLista, scanner);
                    break;
                case 3:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
                    break;
            }

            System.out.println();
        } while (opcion != 3);

        scanner.close();
    }

    public static void menuCola(Queue<Integer> cola, Scanner scanner) {
        int opcion;

        do {
            System.out.println("1. Encolar");
            System.out.println("2. Desencolar");
            System.out.println("3. Cima");
            System.out.println("4. Tamaño");
            System.out.println("5. Volver al menú principal");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el elemento a encolar: ");
                    int elemento = scanner.nextInt();
                    cola.offer(elemento);
                    System.out.println("Elemento encolado correctamente.");
                    break;
                case 2:
                    if (!cola.isEmpty()) {
                        int elementoDesencolado = cola.poll();
                        System.out.println("Elemento desencolado: " + elementoDesencolado);
                    } else {
                        System.out.println("La cola está vacía. No se puede desencolar.");
                    }
                    break;
                case 3:
                    if (!cola.isEmpty()) {
                        int cima = cola.peek();
                        System.out.println("Cima de la cola: " + cima);
                    } else {
                        System.out.println("La cola está vacía.");
                    }
                    break;
                case 4:
                    System.out.println("Tamaño de la cola: " + cola.size());
                    break;
                case 5:
                    System.out.println("Volviendo al menú principal...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
                    break;
            }

            System.out.println();
        } while (opcion != 5);
    }
}




