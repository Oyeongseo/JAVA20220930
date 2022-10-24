package Ch14;
class C07Super{
	int num1;
	public void sound() {System.out.println("Sub1 sound()");}
}
class C07Sub extends C05Super{
	int num2;
	public void move() {System.out.println("Sub1 move()");}
	public void sound() {System.out.println("Sub1 sound()");}
}
public class C07Upcasting {

	public static void main(String[] args) {
	
		C07Super ob = new C07Super();
		
		ob.num1 =10;
//		ob.num2 =20;
//		ob.move();
	}

}
