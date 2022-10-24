package Ch09;

import java.util.Scanner;

public class C04StringClass {

	public static void main(String[] args) {
		int alength, blength;
		char achar, bchar;
		String str1 = new String("java Powerful");
		String str2 = new String("java Programming");
		String str3 = str1+ str2;
		
		System.out.println(str3);
		
		alength =str1.length();
		blength =str2.length();
		achar = str1.charAt(5);
		bchar = str2.charAt(10);
		System.out.println("Str1에 저장 = "+str1+"길이 = "+alength);
		System.out.println("Str2에 저장 = "+str2+"길이 = "+blength);
		System.out.println("Str1의 5번째 	문자 = "+achar);
		System.out.println("Str1의 10번째 문자 = "+bchar);
		System.out.println("Str1의 대소문자로 변환: "+str1.toUpperCase());
		System.out.println("Str1의 소문자로 변환 : "+str1.toLowerCase());
		System.out.println("Str2의 a를 A로 변환 : "+str2.replace('a','A'));
		System.out.println("-------------------------------------------");
		
		//trim()

		//trim() : 앞뒤 공백 제거

		Scanner sc = new Scanner(System.in);
		String tmp = sc.nextLine();
		
		System.out.println(tmp);
		System.out.println(tmp.trim());
		//sumString() : 문자열 자르기
		System.out.println(tmp.substring(2));
		System.out.println(tmp.substring(2,5));
		//intdexOf('문자') :  문자의 index번호 확인
		System.out.println(tmp.indexOf("H"));
		//lastIndexOf("문자열") : 문자열의 index번호 확인
		System.out.println(tmp.lastIndexOf("H")); //시험에 나옴
		//contains("문자열") :문자열 포함여부
		System.out.println(tmp.contains("HE"));
		
		
		
	}

}
