package Ch07;

import java.util.Scanner;

public class C01While {

	public static void main(String[] args) {
//		int i =0;
//		while (i<10)
//		{
//			System.out.println("Hello World");
//			i++;
//		}

//		int i =0;
//		int sum = 0;
//		
//		while (i<=10)
//		{
//			System.out.println("i : "+i);
//			sum = sum+i;
//			i++;
//		}System.out.println("1부터 10까지의합 : "+sum);
//
//		
//---------------------------------------------------
//		문제
//		1부터 입력한 정수 (N)까지 합구하기		
//		Scanner sc =new Scanner(System.in);
//		int N = sc.nextInt();
//		int i=1;
//		int sum = 0;
//		while(i<=N)
//		{
//			System.out.println("i : "+i);
//			sum = sum+i;
//			i++;
//			
//		}System.out.println("1부터 N의 합계는 : "+sum);
//---------------------------------------------------
		//		문제2
//		N,M 을 입력받아서 N부터 M까지의 합 구하기
//		Scanner sc = new Scanner(System.in);
//		System.out.print("정수 두개(N,M)를 입력하세요(N은 M보다 클수없습니다) : ");
//		int N = sc.nextInt();
//		int M = sc.nextInt();
//		int sum = 0;
//
//		while (N<=M)
//		{
//			System.out.println("N :"+N);
//			sum = sum+N;
//			N++;
//			
//		} System.out.println("N부터 M까지의 합계는 :"+sum);
//---------------------------------------------------		
		//문제
		//구구단 2단 출력

//		int i = 1;
//		int j = 2;
//		while (i<10)
//		{
//			System.out.println(j+" x "+i+" = "+(i*j));
//			i++;
//		}
		
		
//---------------------------------------------------				
		//문제
		//구구단 2단 출력(역순출력)
		
//		int i = 9;
//		int j = 2;
//		while (i>0)
//		{
//			System.out.println(j+" x "+i+" = "+(i*j));
//			i--;
//		}
//		
		
//---------------------------------------------------
		//문제
		//구구단 N단 출력(입력받기)
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("정수를 입력하세요 :");
//		int i = sc.nextInt();
//		int j = 1;
//		while(j<10) {
//			System.out.println(i+" x "+j+" = "+(j*i));
//			j++;
//		}
		
//---------------------------------------------------
		//문제
		//구구단 N단 출력(입력받기,역순출력)
//		Scanner sc = new Scanner(System.in);
//		System.out.println("정수를 입력하세요 : ");
//		
//		int i = sc.nextInt();
//		int j = 9;
//		while(j>0)
//		{
//			System.out.println(i+" x "+j+" = "+(i*j));
//			j--;
//		}
//		
//---------------------------------------------------				
		//문제
		//프로그램 사용자로부터 양의 정수를 하나 입력 받은 다음, 그 수만큼 3의 배수를 출력하는
		//프로그램을 작성
		//ex. 5를 입력 받았다면 3, 6, 9, 12, 15 를 출력
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("양의 정수를 하나 입력해주세요 : ");
//		
//		int n1 = sc.nextInt(); //5
//		int i = 0;
//		int sum = 3;
//		while(i<n1)
//		{	i++;
//			System.out.println("i : "+i);
//			
//		
//			System.out.println(sum*i);
//			
//			
//		}
		
		//문제 
		//1부터 100까지 수중에 짝수의 합과 홀수의 합을 각각 구해서 출력하세요
		
//		int i = 0;
//		int sum1 = 0;
//		int sum2 = 0;
//		
//		while (i <=100){
//			
//			if (i%2==0) {
//				sum1 = sum1+i;
//				
//			}else {
//				sum2 = sum2+i;
//				
//				
//			}i++;
//			
//			
//		}System.out.println("짝수의 합"+sum1);
//		System.out.println("홀수의 합 "+sum2);
//			
			
				
		//문제 
		//1부터 N까지 수중에 짝수의 합과 홀수의 합을 각각 구해서 출력하세요
//		Scanner sc =new Scanner(System.in);
//		System.out.print("N의 값을 입력하세요 : ");
//		
//		
//		int i = 0;
//		int N = sc.nextInt();
//		int sum1 = 0;
//		int sum2 = 0;
//		
//		while(i<=N) {
//			i++;
//			if(i%2==0) {
//				sum1 = sum1+i; 
//			}else {
//				sum2 = sum2+i;
//			}
//		}System.out.println("1부터"+N+"까지 수중에 짝수의 합 : "+sum1);
//		System.out.println("1부터"+N+"까지 수중에 홀수의 합 : "+sum2);
		
		//문제
		//1부터 100까지 수중에 3의 배수는 제외한 합을 구해서 출력해보세요
//		int i = 0;
//		int j = 100;
//		int sum =0;
//		int min =0;
//		while(i<=j) {
//			
//			if(i%3==0) {
//				min = min+i;
//			}else {
//				sum = sum+i;
//			}i++;
//			
//		}System.out.println("1부터 100까지 수중 3배수 제외한 합은 : "+sum);
		
		//문제
		//문자열을 입력받아서 각문자를 거꾸로 출력해보세요(같이품)
		//입력 : apple
		//출력 : elppa
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String reverse = "";
		
		int len = str1.length()-1;
		System.out.println("길이 : "+len);
		while(len>=0) {
//			
			System.out.println(str1.charAt(len));
			reverse+= str1.charAt(len);
			len--;
		}		
		System.out.println(reverse);
		
//---------------------------------------------------
	}

}
