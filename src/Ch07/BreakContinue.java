package Ch07;

import java.util.Scanner;

public class BreakContinue {

	public static void main(String[] args) {
		 
		//1
		//break
		//-1을 입력하기 전까지 계속 정수값을 받아 누적 합을 출력
//		Scanner sc = new Scanner(System.in);
//		
//		
//		int n ;
//		int sum = 0;
//		
//		while(true)
//		{
//			n = sc.nextInt();
//			if(n==-1) {
//				break;
//			}
//			sum+=n;
//		}System.out.println("SUM : "+sum);
		
		
		//2
		//continue
		// 1부터 10까지의 수중에 3의 배수를 제외한 합 출력

		int i = 1;
		int sum = 0;
		
		while(i<=10) {
			if(i%3==0) {
				i++;
				continue;
			}
			System.out.println("I : "+i);
			sum+=i;
			i++;
			
			
			
		}System.out.println("SUM : "+sum);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
