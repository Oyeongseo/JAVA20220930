package Ch14;
class C05Super{
	int num1;
		
}
class C05Sub extends C05Super{
	int num2;
	
}
public class C05Upcasting {

	public static void main(String[] args) {
		//Nocasting
		C05Super ob1 = new C05Super();
		ob1.num1 = 100;
		C05Sub ob2 = new C05Sub();
		ob2.num1=10;
		ob2.num2=20;
		
		C05Super ob3 = new C05Sub();
		ob1.num1 = 10;
//		ob1.num2 = 20;
		
		C05Sub down = (C05Sub)ob3;
		down.num2=10;
		
		
		

	}

}