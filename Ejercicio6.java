import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int cifras = 0;
		System.out.println("Introduce digito positivo");
		int num = sc.nextInt();
		
		if (num <= 0) {
			System.out.println("Te dije positivo");
		}else {
			cifras = cifras(num);
			System.out.println("Numero de cifras del digito es: " + cifras);
		}

	}
	public static int cifras(int num) {
		int cifras = 0; 
		while(num != 0) {
			num = num/10;
			cifras++;
		}
		return cifras;
	}

}
