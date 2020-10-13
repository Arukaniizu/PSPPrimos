import java.math.BigInteger;



public class Hilo  extends Thread{
	public int numero = 0;
	public int numero2 = 0;
	
	public Hilo(int numero, int numero2) {
		
		this.numero = numero;
		this.numero2 = numero2;
	}
	public void run() {
		calculo();
	}

	public void calculo() {
		BigInteger bi ;
		for (int i = numero; i < numero2; i++) {
			bi = new BigInteger(String.valueOf(i));
			if (bi.isProbablePrime(1) ) {
				System.out.println(i +"   "+ Thread.currentThread().getName());
			}

		}
	}
}
