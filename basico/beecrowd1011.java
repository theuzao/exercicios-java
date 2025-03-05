import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

	    double pi = 3.14159; 
	    double raio = sc.nextDouble();
	    
	    double volume = (4.0/3) * pi * Math.pow(raio, 3);
	    
	    System.out.printf("VOLUME = %.3f%n", volume);
	}
}
