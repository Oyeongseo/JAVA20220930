package Ch19;
class 치킨{
	String meterial;
	치킨(String meterial){this.meterial= meterial;}
	@Override
	public String toString() {
		return "치킨 [meterial=" + meterial + "]";
	}
	
}

class 단호박{
	String meterial;
	단호박(String meterial){this.meterial=meterial;}
	@Override
	public String toString() {
		return "단호박 [meterial=" + meterial + "]";
	}
}



class 피자{
	String meterial;
	피자(String meterial ){this.meterial=meterial;}
	@Override
	public String toString() {
		return "피자 [meterial=" + meterial + "]";
	}

	
}
class 슈크림{
	String meterial;
	슈크림(String meterial){this.meterial=meterial;}
	@Override
	public String toString() {
		return "슈크림 [meterial=" + meterial + "]";
	}
	
}

class 야채{
	String meterial;
	야채(String meterial){this.meterial=meterial;}
	@Override
	public String toString() {
		return "야채 [meterial=" + meterial + "]";
	}
	
}

class 팥 {
	String meterial;
	팥(String meterial){this.meterial=meterial;}
	//toString재정의
	@Override
	public String toString() {
		return "팥 [meterial=" + meterial + "]";
	}
	
}
class 호빵<T>
{
	private T meterial;
	호빵(T meterial){
		this.meterial=meterial;
	}
	void ShowInfo() {
		System.out.println(meterial.toString()+"으로 만든 호빵!");
	}
}
public class C01Generic {

	public static void main(String[] args) {
		호빵<팥> ob1 = new 호빵<팥>(new 팥("단팥"));
		ob1.ShowInfo();
		호빵<야채> ob2 = new 호빵<야채>(new 야채("맛있는 야채"));
		ob2.ShowInfo();
		호빵<슈크림> ob3 = new 호빵<슈크림>(new 슈크림("슈크림"));
		ob3.ShowInfo();
		호빵<피자> ob4 = new 호빵<피자>(new  피자("피자토핑"));
		ob4.ShowInfo();
		호빵<치킨> ob5 =new 호빵<치킨>(new 치킨("치킨"));
		ob5.ShowInfo();
		호빵<단호박>ob6 =new 호빵<단호박>(new 단호박("단호박"));
		ob6.ShowInfo();
		
		
		

	}

}
