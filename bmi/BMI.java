package bmi;
import java.util.Scanner;
public class BMI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);    //System.in is a standard input stream  
		System.out.println("Enter your weight: ");  
		int weight= sc.nextInt();  
		System.out.println("Enter your height: ");  
		double height= sc.nextInt(); 
		double BMI = (weight)/(height*height);
		System.out.println(BMI);
		} 
	

}
