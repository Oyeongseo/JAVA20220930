package Ch08;

class C12Simple{
	
	int x;		//0
	double y;	//0.0
	char z;		//' '
	boolean b;	//false
	String str; //null
	
	@Override
	public String toString() {
		return "C12Simple [x=" + x + ", y=" + y + ", z=" + z + ", b=" + b + ", str=" + str + "]";
	}

	C12Simple(){
		System.out.println("디폴트 생성자 호출");
	
	}
}
public class C12Constructor {

	public static void main(String[] args) {

		C12Simple obj = new C12Simple();
		System.out.println(obj.toString());
		
		

	}

}
