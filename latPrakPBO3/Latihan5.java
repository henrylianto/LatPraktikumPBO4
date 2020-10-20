import java.util.Scanner;
public class Latihan5{
	
	public static void main(String[] args)
	
{ String output;

Scanner input = new Scanner(System.in);
System.out.print("Masukan Bilangan Positif atau Negatif = ");

int angka = input.nextInt();

if (angka > 0){
	System.out.println("Bilangan "+angka+" : Positif");
	} else if(angka <0){
		System.out.println("Bilangan "+angka+" : Negatif");
	}else {
		System.out.println("Bilangan tidak positif maupun negatif");
        }
}
}

