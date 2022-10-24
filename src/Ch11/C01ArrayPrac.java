package Ch11;

import java.util.Scanner;

public class C01ArrayPrac {

	public static void main(String[] args) {
		//10 크기의  int형 배열을 만들어서
		//반복문과 함께 해당배열의 0-9 까지 요소에 각각 정수값을 입력
		//합,평균,최대값,최소값을 구합시다
		Scanner sc = new Scanner(System.in);
		
		int[] ar1 = new int[10];
		ar1[0]=sc.nextInt();
		ar1[1]=sc.nextInt();
		ar1[2]=sc.nextInt();
		ar1[3]=sc.nextInt();
		ar1[4]=sc.nextInt();
		ar1[5]=sc.nextInt();
		ar1[6]=sc.nextInt();
		ar1[7]=sc.nextInt();
		ar1[8]=sc.nextInt();
		ar1[9]=sc.nextInt();

		int sum = 0;
		
		for(int i : ar1){
				sum += i;
				
		
		} System.out.println("합계 : "+sum);
		double average = sum/ ar1.length;
		System.out.println("평균 : "+average);
		System.out.println("최대값 : "+ar1[ar1.length-1]);
		System.out.println("최소값 : "+ar1[0]);
		
		
	}

}
