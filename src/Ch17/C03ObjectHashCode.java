package Ch17;

class C04Simple{
	int x;
	int y;
	C04Simple (int x, int y){this.x=x; this.y=y;}
	
	@Override
	public int hashCode() {
		return x+y;
	}
}
public class C03ObjectHashCode {

	public static void main(String[] args) {
		
		
		
		C04Simple obj1 = new C04Simple(0, 0);
		C04Simple obj2 = new C04Simple(0, 0);
		
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println("---------------");
		System.out.printf("%x \n",obj1.hashCode());
		System.out.printf("%x \n",obj2.hashCode());
		System.out.println("---------------");
		System.out.printf("%x \n",System.identityHashCode(obj1));
		System.out.printf("%x \n",System.identityHashCode(obj2));
		
	}

}
