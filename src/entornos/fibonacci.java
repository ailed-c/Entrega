package entornos;


public class fibonacci {
	public static void main(String[] args) {
		
		int n=Integer.valueOf(args[0]);
		int f1,f2,suma;
		f1=0;
		f2=1;
		
		
		
		
		for(int i=0;i<=n;i++){
		suma=f1+f2;
		System.out.println(suma);
		f1=f2;
		f2=suma;
		}
	}
}
