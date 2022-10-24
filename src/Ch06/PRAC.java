package Ch06;

import java.util.Scanner;

public class PRAC {

	public static void main(String[] args) {
			//문제
			// 정수 한개값을 입력받아 3의 배수이면 해당 수를 출력하세요
				
			Scanner sc = new Scanner(System.in);
		
			System.out.print("정수한개를 입력해주세요: ");
			int num1 = sc.nextInt();
			
			if(num1%3==0) {
				System.out.println("3의배수입니다");
			}
			else {System.out.println("3의 배수가 아닙니다");}
		
		
		//문제
		// 두수를 입력받아 두수 중에 큰수를 출력
			Scanner sc2 = new Scanner(System.in);
			System.out.print("정수를 입력해주세요 : ");
			int num2 = sc2.nextInt();
			System.out.print("정수를 입력해주세요 : ");
			int num3 = sc2.nextInt();
			
			if (num2 > num3)
			
				System.out.println("큰수 : "+num2);
			
				if (num2 < num3){
				System.out.println("큰수 :"+num3);
			}
				else {
					System.out.println("두수가 같습니다");
				}
			
		//문제
		// 세 정수를 입력받아 세 정수 중에 가장 큰수와 가장 작은수를 출력
				Scanner sc3 = new Scanner(System.in);
				System.out.println("정수 3개를 입력받습니다.");
				System.out.print("정수를 입력하세요");
				int num4 = sc3.nextInt();
				System.out.print("정수를 입력하세요");
				int num5 = sc3.nextInt();
				System.out.print("정수를 입력하세요");
				int num6 = sc3.nextInt();
				
				if (num4 > num5 && num4 > num6) {System.out.println("제일 큰 수는 :"+num4);}
				
					if (num5 > num4 && num5 > num6) { System.out.println("제일 큰 수는 : "+num5);}

						if (num6 > num5 && num6 > num4) {System.out.println("제일 큰 수는 : "+num6);}
					
				
				
				
		//문제
		// 세개의 정수를 입력받아 해당수의 합과 평균을 출력
		
					Scanner sc4 = new Scanner(System.in);
					System.out.println("정수 3개를 입력받습니다");
					System.out.print("정수를 입력하세요");
					int num7 = sc4.nextInt();
					System.out.print("정수를 입력하세요");
					int num8 = sc4.nextInt();
					System.out.print("정수를 입력하세요");
					int num9 = sc4.nextInt();
					
					int sum = num7+num8+num9 ;
					double result = (double)sum/3 ;
					
					System.out.printf("%d + %d + %d 의 합계는 = %d\n",num7,num8,num9,sum);
					System.out.printf("%d 의 평균점수는 =%d\n ",sum,(int)result);
		
					
	}

	}

