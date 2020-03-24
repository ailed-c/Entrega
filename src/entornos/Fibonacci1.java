package entornos;

public class Fibonacci1 {
	
	public int calculateFibonacci(int number) {
		int f1,f2,suma=0;
		f1=0;
		f2=1;
		
		
		
		
		for(int i=0;i<=number;i++){
		suma=f1+f2;
		System.out.println(suma);
		f1=f2;
		f2=suma;
		}
		return suma;
	}
}
