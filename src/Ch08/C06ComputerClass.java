package Ch08;

class C06Computer
{
	String SerialNo ;
	String CPUSpec;
	String RAMSpec;
	String DISKSpec;
	//SerialNO+의 전원을 켭니다 가 출력
	void PowerON() {
		System.out.println(SerialNo+"의 전원을 켭니다");
	}
	//SerialNO+의 전원을 끕니다 가 출력
	void PowerOFF() {
		System.out.println(SerialNo+"의 전원을 끕니다");
	}
	//Computer객체의 모든 속성이 출력
	void ShowInfo() {
		System.out.printf(" SerialNo : %s\n CPUSpec : %s\n RAMSpec : %s\n DISKSpec : %s\n",SerialNo,CPUSpec,RAMSpec,DISKSpec);
	}
}
public class C06ComputerClass {

	public static void main(String[] args) {
		
		
	}

}
