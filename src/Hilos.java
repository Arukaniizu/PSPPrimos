
import java.util.Scanner;

public class Hilos {
	public static void main(String[] args) {
		final int NUM = 100;
		int inicio = 0;
		int rango = 0;
		int rangototal = 0;
		int numeroHilos = 0;
		int cont = 0;
		// pedir el numero de hilos y calcular los numeros primos del 1 al 100000
		Scanner sc = new Scanner(System.in);
		System.out.println("Inserta el numero de hilos que van a participar");
		numeroHilos = sc.nextInt();
		rango = NUM / numeroHilos;
		rangototal = rango;
		Hilo hilo;
		for (int i = 0; i < numeroHilos; i++) {
			hilo = new Hilo(inicio, rangototal, cont);
			hilo.start();
			inicio = rangototal;
			rangototal = rangototal + rango;
		}
		
		
		sc.close();

	}
	
    
}
