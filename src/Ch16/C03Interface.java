package Ch16;

interface Remocon
{
	//필드
	int MAX_VOLUMN=10;
	int MIN_VOLUMN=0;
	
	//기능
	void turnIn();
	void turnOff();
	void setVolumn(int vol);
	
}
class TV implements Remocon
{

	@Override
	public void turnIn() {
		System.out.println("TV를 켭니다");
		
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다");
		
	}

	@Override
	public void setVolumn(int vol) {
		if()
		
	}
	
	
}
class Radio implements Remocon
{

	@Override
	public void turnIn() {
		System.out.println("Radio 를 켭니다");
		
	}

	@Override
	public void turnOff() {
		System.out.println("Radio 를 끕니다");
		
	}

	@Override
	public void setVolumn(int vol) {
		// TODO Auto-generated method stub
		
	}
	
}
public class C03Interface {
	public static void TurnOn(Remocon controller) {
		controller.turnIn();
	}
	public static void TurnOff(Remocon controller) {
		controller.turnOff();
	}
	public static void main(String[] args) {
		 
		TV tv = new TV();
		Radio radio = new Radio();
		TurnOn(tv);
		TurnOn(radio);
		TurnOff(tv);
		TurnOff(radio);
	}

}
