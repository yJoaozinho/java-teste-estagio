package questoesEstagio;
import java.util.Scanner;
public class Questao2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um numero ppara saber se ele faz parte da sequencia de Fibonacci.");
		int number = sc.nextInt();
		System.out.println("O numero" + fazParteFibo(number));
		
	}
	
	public static String fazParteFibo(int number) {
		int fib1 =0;
		int fib2 =1;
		int nextFib = fib1 +fib2;
		
		if(number<0) {
			return(" Nao faz parte da sequencia de fibonacci. ");
		}
		
		while(number > nextFib ) {
			fib1 = fib2;
			fib2 = nextFib;
			nextFib = fib1 + fib2;
			
		}
		if(number == 0 || number ==1 || number == nextFib ) {
			return(" faz parte da sequencia de fibonacci. ");
		}else {
			return(" nao faz parte da sequencia de fibonacci. ");
		}
	}

}
