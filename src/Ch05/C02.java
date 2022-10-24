package Ch05;

public class C02 {

	public static void main(String[] args) {
		
		int num = 56789;
		
		System.out.println("오른쪽 끝 1자리 : "+(num%10));
		System.out.println("오른쪽 끝 2자리 : "+(num%100));
		System.out.println("오른쪽 끝 3자리 : "+(num%1000));
		System.out.println("오른쪽 끝 4자리 : "+(num%10000));
		System.out.println();
		System.out.println("왼쪽 끝 1자리 : "+(num/10000));
		System.out.println("왼쪽 끝 2자리 : "+(num/1000));
		System.out.println("왼쪽 끝 3자리 : "+(num/100));
		System.out.println("왼쪽 끝 4자리 : "+(num/10));
		
		//정수 하나를 입력받아 거꾸로 저장하기
		//예 (반복문 후 풀이해보기)
		
//		입력 :1234
//		저장
//		int reverse = 4321;
//		출력 : 4321
		 
		

	}

}
