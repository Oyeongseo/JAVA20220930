package Ch15;


class par1 {
	void method1() {
		
	}
}
class son1 extends par1{
	void method1() {
		System.out.println("Son1 의 자율적 재정의된 메서드");
	}
}
abstract class par2{
	abstract void method2();
}

class son2 extends par2{
	@Override
	void method2() {
		System.out.println("Son2의 강제 재정의된 메서드");
	}
}
public class C01AbstractTest {

	public static void main(String[] args) {
		 par1 obj1 =new par1();
		 son1 obj2 =new son1();
		 obj1 = obj2;
		 obj1.method1();
		 
		 par2 obj3 = new par2;
		 par2 obj3 = null;
		 son2 obj4 = new son2;

	}

}
