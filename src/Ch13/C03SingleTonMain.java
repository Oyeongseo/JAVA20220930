package Ch13;

class C03Company { 
	int x;
	int y;
	pr
	private static C03Company instance= new C03Company();
	
	private C03Company() {}
	
	public static C03Company getInstance() {
		if(instance == null) {
			instance = new C03Company();
			
		}
		return instance;
	}
}
public class C03SingleTonMain {

	public static void main(String[] args) {
		C03Company myCompany1 = C03Company.getInstance();
		C03Company myCompany2 = C03Company.getInstance();
		System.out.println(myCompany1 == myCompany2);
	}

}
