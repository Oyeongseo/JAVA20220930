package Ch01;

		public class C02BasicOutputMethod {

		 			public static void main(String[] args) {
		 				//00 System.out 		:표준 출력 스트림
		 				//01 System.out.print 	:

		 				//ESCAPE 문자사용
		 				// \n :개행문자
		 				// \b :백스페이스 	(C언어)
		 				// \a :알람기능  	(C언어)
		 				
//		 				 System.out.print("HELLO WORLD");
//		 				 System.out.print("HELLO WORLD");
//		 				 System.out.print("HELLO WORLD"); 
		 			 
		 				  
		 				 //문제

		 				 //		*
		 				 //	   ***
		 				 //	  *****
		 				 //	 *******
		 				 //	*********
		 				
		 System.out.println("	    *");
		 System.out.println("	   ***");
		 System.out.println("	  *****");
		 System.out.println("	 *******");
		 System.out.println("	*********");
		 
	 	 //02 System.out.printf() format: 형식,서식
		 //-서식문자를 사용할 수 있는 출력 메서드
		 //서식 : 서류를 꾸미는 양식
		 //%d:10진 정수
		 //%f:실수
		 //%c:한글자
		 //^s:문자열
		 
	 	System.out.printf("%d %d %d \n",10,20,30);
	 	System.out.printf("%f %f %f \n", 10.1,20.1,30.1);
	 	System.out.printf("%c %c %c \n",'A','B','C');
	 	System.out.printf("%s %s %s \n","This is","String","Test");
	 	System.out.printf("%d.%s : %d \n", 1,"국어",100);
		 
	 	//문제
	 	//다음과 같이 출력
	 	
//	 	NO	 	이름		나이		주소
//	 	1		김광수	35		대구
//	 	2		이태수	55		울산	
//	 	3		이지성 	44		김해
	 	
	 	
	 	System.out.printf("%s	%s	%s	%s \n","NO","이름","나이","주소");
	 	System.out.printf("%d	%s	%d	%s \n", 1,"김광수",35,"대구");
	 	System.out.printf("%d	%s	%d	%s \n", 2,"이태수",55,"울산");
	 	System.out.printf("%d	%s	%d	%s \n", 3,"이지성",44,"김해");
	 	
	 //퍼센트 앞에 숫자 적으면 정렬 가능. 
	 	
	 	
	 	
	 	//03 System.out.println()
		 
	 	System.out.println("HELLO WORLD");
	 	System.out.println("HELLO WORLD");
	 	System.out.println("HELLO WORLD");
	 	System.out.println("HELLO WORLD");

	 	System.out.println("I SAY \"HELLO\"?");
	 	
		 
	 
	}

}