package Ch12;

class TV{
	
 String more;
 int year;
 int inc;
 TV(String more, int year, int inc){
	 this.more=more;
	 this.year=year;
	 this.inc=inc;
 }
 void show() {
	System.out.println(more+"에서 만든"+year+"년"+inc+"인치TV");
}

}
	
public class PRAC {

	public static void main(String[] args) {
//		1 자바 클래스를 작성하는 연습을 해보자. 다음 main() 메소드를 실행하였을 때 예시와 같이 출력되도록 TV 클래스를 작성하라.
		

		   TV myTV = new TV("LG", 2017, 32); //LG에서 만든 2017년 32인치
		   myTV.show();
	
		
//		출력 결과
//		LG에서 만든 2017년형 32인치 TV
		
		


		
	}

}
