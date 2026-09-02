import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static void main() {
        // Como inbstanciar una Lista?

        ArrayList<String> nombres = new ArrayList<>();
        //Agregar elementos dentro del array
        nombres.add("Francisco");
        nombres.add("Felipe");
        nombres.add("Fernando");

        // Obtener info específica
        System.out.println("Nombre específico: " + nombres.get(1));

        // Modificar elementos de una Lista
        nombres.set(0, "Juan");

        // Eliminar elementos de un array -> posicion
        // nombres.remove(0);

        // Tamaño de la Lista
        System.out.println("Largo de la Lista: " + nombres.size());

        // Buscar elemento dentro del array
        System.out.println(nombres.contains("Felipe"));

        // Obtener posicion de un elemento
        System.out.println(nombres.indexOf("Felipe"));

        // Vaciar la Lista
        // nombres.clear();

        // Saber si la Lista está vacía
        System.out.println("Lista vacia?: " + nombres.isEmpty());

        // Imprimir contenido de la Lista
        System.out.println(nombres);

        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        // numeros.remove(1);
        System.out.println(numeros);

        // Ciclos de Repeticón
        // Repetir (valor inicial; condicion T; paso)
        int totalAlumnos = 30;

        for (int i = 0; i < 5; i++) {
            System.out.println("Imprimiendo: " + i);
        }

        for (int i = 10; i > 0 ; i--) {
            System.out.println("Cuenta Regresiva: " + i);
        }

        for (String nombre : nombres){
            System.out.println(nombre);
        }

        for (Integer num : numeros) {
            System.out.println(num);
        }

        Scanner sc = new Scanner(System.in);
        // Ciclo while se puede ejecutar cuando no sabemos con certeza
        // cuantas iteraciones hará el código y además la condición debe
        // ser verdadera
        int numero ;
        boolean acceso = false;
        while(acceso){
            System.out.println("Ingrese un numero positivo");
            numero = sc.nextInt();
            if (numero%2==0){
                break;
            }
        }
        // do while funciona igual que el while, con la diferencia
        //que lo que este en el do se ejecutará al menos una vez
        int opcion;
        do {
            System.out.println("1 Agregar Usuario");
            System.out.println("2 Buscar Usuario");
            System.out.println("3 Salir");
            System.out.println("Ingrese Opcion");
            opcion = sc.nextInt();
        }while(opcion != 3);
    }
}