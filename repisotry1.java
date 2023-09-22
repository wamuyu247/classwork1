package rep1;
import java.util.Scanner;
public class repisotry1 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter your weight:");
		int a=in.nextInt();
		System.out.println("Enter your height:");
		int b=in.nextInt();
		double bmi=a/(b*b);
		System.out.println("Your BMI is:"+bmi);
		
		
	}

}
