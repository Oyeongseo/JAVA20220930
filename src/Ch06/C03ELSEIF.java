package Ch06;

import java.util.Scanner;

public class C03ELSEIF {

	public static void main(String[] args) {
		
		
//		Scanner sc = new Scanner(System.in);
//		int kor = sc.nextInt(); int eng = sc.nextInt(); int mat = sc.nextInt();
//		double avg = (kor+eng+mat)/3;
//		
//		if (kor<40) {System.out.println("불합격");
//		}else if(eng<40) {System.out.println("불합격");
//		}else if(mat<40) {System.out.println("불합격");
//		}else if(avg<60) {System.out.println("불합격");		
//		}else {System.out.println("합격");
//		}
		
		
		
		// 90점이상 : A				x >= 90
		// 80 이상 90점 미만 : B		80<=x<90
		// 70 이상 80점 미만 : C		70<=x<80
				
		
		
		/*
		int num=85;
		if(num>=90)
		{
			System.out.println("A");
		}
		else	//90점 미만
		{
			if(num>=80) //80<=x<90
			{
				System.out.println("B");
			}
			else	//80점 미만
			{
				if(num>=70) // 70<= x < 80
				{
					System.out.println("C");
				}
	
			}
		}
		*/
		
		/*
		int num=80;
		
		if(num>=90)
		{
			System.out.printf("A");
		}
		else if(num>=80)
		{
			System.out.printf("B");
		}
		else if(num>=70)
		{
			System.out.printf("C");
		}
		else if(num>=60)
		{
			System.out.println("D");
		}
		else
		{
			
		}
		*/
		
		//나이별로 요금을 부과하는 else if문을 만드세요
		//8세 미만  : 요금은 1000원
		//14세미만 : 요금은 2000원
		//20세미만 : 요금은 2500원
		//20세이상 : 요금은 3000원
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("나이를 입력하세요  : ");
//		int age=sc.nextInt();
//		
//		if(age<8)
//		{
//			System.out.println("요금 : 1000원");
//		}
//		else if(age<14)
//		{
//			System.out.println("요금 : 2000원");
//		}
//		else if(age<20)
//		{
//			System.out.println("요금 : 2500원");
//		}
//		else
//		{
//			System.out.println("요금 : 3000원");
//		}
			

		
		//문제 
		//시험점수 입력받아서 90~100 A
		//80~89 B, 70~79 C
		//60~69 D, 나머지 점수는 F
		
		//점수 >= 90A
		//점수 >= 80B
		//점수 >= 70C
		//점수 >= 60D
		//그외 F
//		or
		//점수<60F
		//점수<70D
		//점수<80C
		//점수<90B
		//그외 A
		
		Scanner sc = new Scanner(System.in);
		int score = sc. nextInt();
		
		if (score >= 90) {System.out.println("A");
		}else if(score >=80) {System.out.println("B");
		}else if(score>=70) {System.out.println("C");
		}else if(score>=60) {System.out.println("D");
		}else {System.out.println("F");
		
		
		if (score <60) {System.out.println("F");		
		}else if (score <70) {System.out.println("D");
		}else if (score <80) {System.out.println("C");
		}else if (score <90) {System.out.println("B");
		}else {System.out.println("A");
		}
		
		
		
		
		
	}
	}
}
