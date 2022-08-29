import java.util.Scanner;
public class ArmstrongNumberKoushik {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.println("Emter the number");
		int n=s.nextInt();
		ArmstrongNumberKoushik2 k=new ArmstrongNumberKoushik2();
		boolean c=k.chack(n);
		if(c) {
			System.out.println(n+" is armstrong number");
		}else {
			System.out.println(n+" is not armstrong number");
		}
	}

}
