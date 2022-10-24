package Ch14;
class Super{
	int num1;
	public void sound() {
		System.out.println("Sound()");}
	
}
class Sub extends Super{
	int num2;
	public void move() {System.out.println("Sub1 move1()");}
	
	public void sound() {System.out.println("Sub's Sound1()");}
}
public class C04MethodInfo {

	public static void main(String[] args) {
		// 정상범위
		Super ob1 = new Super();
		Super ob2 = new Super();
		
		Sub ob3 = new Sub();
		
		System.out.println();
		

	}

}
