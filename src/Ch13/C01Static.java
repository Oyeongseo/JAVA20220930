package Ch13;
class C01Simple{
	static int Num1 = 0;
	int Num2;
	void ShowNum() {
		System.out.printf("NUM1 : %d NUM2 : %d\n",Num1,Num2);
	}
}
public class C01Static {

	public static void main(String[] args) {
		C01Simple obj1=new C01Simple();
		C01Simple obj2=new C01Simple();
		
		obj1.Num1 = 10;
		obj1.Num2 = 20;
		obj1.ShowNum();
		obj2.ShowNum();
		System.out.println();
	
		obj1.Num1 = 100;
		obj1.Num2 = 200;
		obj1.ShowNum();
		obj2.ShowNum();	
		
		C01Simple.Num1=123;
		System.out.println(C01Simple.Num1);
	
	}
	

}
