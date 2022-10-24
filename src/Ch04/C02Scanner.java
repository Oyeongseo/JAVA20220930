package Ch04;

import java.util.Scanner;

public class C02Scanner {

	public static void main(String[] args) {

			System.out.println("--------------Scanner Test--------------");
			Scanner sc = new Scanner(System.in);
			System.out.print("정수입력 : ");
			int num1 = sc.nextInt();
			System.out.println("입력된 정수값 : "+num1);
			
			System.out.print("실수입력 : ");
			double num2 = sc.nextDouble();
			System.out.println("입력된 실수값 : "+num2);
			
			
			System.out.print("문자열입력 : ");
			String str1 = sc.next();
			System.out.println("입력된 실수값 : "+str1);			
	
			
			sc.nextLine();
			
			System.out.print("문자열 입력(띄어쓰기포함 문자열) :");
			String str2 = sc.nextLine();
			System.out.println("입력된 문자열 : "+str2);
			
			
	}

}
