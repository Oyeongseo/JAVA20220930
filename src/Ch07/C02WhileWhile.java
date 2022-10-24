package Ch07;

import java.util.Scanner;

public class C02WhileWhile {

	public static void main(String[] args) {
	
		//전체 구구단 출력(2단~9단)출력하기
//		int dan = 2;
//		int i ;
//		while(dan <=9)
//		{
//			i=1;
//			while(i<=9) {
//				System.out.printf("%d x %d = %d\n",dan,i,dan*i);
//				i++;
//			}
//			System.out.println();
//			dan++;
//		}
		
		//전체 구구단 출력(2단~9단)출력하기(역순)
		
//		int dan = 2;
//		int i ;
//		while(dan <=9)
//		{
//			i=9;
//			while(i>=1) {
//				System.out.printf("%d x %d = %d\n",dan,i,dan*i);
//				i--;
//			}
//			System.out.println();
//			dan++;
//		}
		
		//N단 부터 9단까지 전체 출력
	
//		Scanner sc =new Scanner(System.in);
//		int n = sc.nextInt();
//		int i ;
//		while(n<=9) {
//			i=1;
//			while(i<=9)
//			{
//				System.out.printf("%d x %d = %d \n ",n,i,n*i);
//				i++;
//			}System.out.println();
//			n++;
//		}
		
		
		
//		1
//		*****
//		*****
//		*****
//		*****
//		*****
//		-----------------------------
//		int i = 0;
//		int j = 0;
//		
//		while(i<4) {
//			
//			j=0;
//			while(j<5) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//			
//		}
		
		//높이 : 4
//		*****
//		*****
//		*****
//		*****
		
//		Scanner sc =new Scanner(System.in);
//		System.out.print("높이 : ");
//		int n = sc.nextInt();
//		int i = 0;
//		int j = 0;
//		while(i<n) {
//			j=0;
//			while(j<5)
//			{
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
//		
//		-----------------------------
//		2
//		*
//		**
//		***
//		****

//		int i = 0;
//		int j = 0;
//		while(i<4) {
//			j=0;
//			while(j<=i) {
//				
//				j++;
//				System.out.print("*");
//				
//			}
//			System.out.println();
//			i++;
//		}
		
		
//		높이 입력받기
//		*
//		**
//		***
//		****
//		Scanner sc = new Scanner(System.in);
//		System.out.print("높이 : ");
//		int n = sc.nextInt();
//		int i = 0;
//		int j = 0;
//		while(i<n) {
//			j=0;
//			while(j<=i) {
//				
//				j++;
//				System.out.print("*");
//				
//			}
//			System.out.println();
//			i++;
//		}
//		
		
//		3
//		****
//		***
//		**
//		*
//		int i =0;
//		int j =0;
//		while(i<4) {
//			j=3;
//			while(j>=i)
//			{j--;
//			System.out.print("*");
//				
//			}
//			System.out.println();
//			i++;
//		}
		
		

		
		
		
//		4
//		   *
//		  ***
//		 *****
//		*******
		
//		int i = 0; //행
//		int j = 0; //공백
//		int m = 0; //별
//		while(i<4) {
//			m=0;
//			j=0;
//			while(j<2-i) {
//				System.out.print(" ");
//				j++;}
//				while(m<2*i) {
//					System.out.print("*");
//					m++;
//				}
//			
//			System.out.println();
//			i++;
//		}
//		

		
//		   *
//		  ***
//		 *****
//		*******
		//높이 입력받기
//		Scanner sc = new Scanner(System.in);
//		System.out.print("높이  : ");
//		int n = sc.nextInt();
//		int i = 0; //행
//		int j = 0; //공백
//		int m = 0; //별
//		while(i<n) {
//			m=0;
//			
//			while(j<=(n-2)-i) {
//				System.out.print(" ");
//				j++;}
//				j=0;
//				while(m<=2*i) {
//					System.out.print("*");
//					m++;
//				}
//			
//			System.out.println();
//			i++;
//		}
//		

		
		
		
		
//		5
//		*******
//		 *****
//		  ***
//		   *
//		int i = 0;
//		int j = 0;
//		int m = 0;
//		while(i<4) {
//			j=0;
//			
//			while(j<i) {
//				
//				System.out.print(" ");
//				j++;
//			}
//			
//			m=0;
//			while(m<=6-2*i) {
//				System.out.print("*");
//				m++;
//			}
//			System.out.println();
//			i++;
//		}
		
		

//		*******
//		 *****
//		  ***
//		   *
		
		//높이 입력받기 
		
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int i = 0;
//		int j = 0;
//		int m = 0;
//		while(i<n) {
//			j=0;
//			
//			while(j<i) {
//				
//				System.out.print(" ");
//				j++;
//			}
//			
//			m=0;
//			while(m<=n-2*i) {
//				System.out.print("*");
//				m++;
//			}
//			System.out.println();
//			i++;
//		}
		
//		6					j		k
//		   *				0-2		0
//		  ***				0-1		0-2
//		 *****				0		0-4
//		*******				x		0-6
//		 *****				0		0-4
//		  ***				0-1		0-2
//		   *				0-2		0
		
		
		int i = 0;
		int j = 0;
		int k = 0;
		
		while(i<7) {
			
			
//			공백
			j=0;
			while(j<=2-i) {
				System.out.print(" ");
				j++;
			
				
			}
			
			
//			별
			k=0;
			while(k<2*i) {
				System.out.print("*");
				k++;
				
			}
			
			
			System.out.println();
			i++;
		}
			
		
		
		
		
		
	}
	
}