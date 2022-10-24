package Ch09;
//접근한정자
//public 	:모든 클래스에서 접근가능
//default 	:동일 패키지에 속한 클래스에서만 접근 가능
//private 	:현재 클래스에서만 접근가능
//protected :동일 패키지에 속한 클래스 or 상속관계에서 하위클래스에서만 접근가능		
		

class C01Person
{
	//속성
	public String name;		//이름	
	private String id;		//주민등록번호
	private int age;		//나이
	private float weight;	//몸무게
	private double height;	//시장
	private int salary;		//연봉
	
	//생성자
	public C01Person(String name, String id, int age, float weight, double height, int salary) {
		super();
		this.name = name;
		this.id = id;
		this.age = age;
		this.weight = weight;
		this.height = height;
		this.salary = salary;
	}
	
	//Setter 함수 지정
	public void setId(String id) {
		this.id=id;
		
		
	}
	public String getId() {
		return id;
	}
	//age Getter and Setter 만들기

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	
	//weight Getter 만 만들기

		
	}
	//salary Setter 만 만들기
	
	

public class C01InfoHide {
	

	public static void main(String[] args) {
		 C01Person hong = new C01Person("홍길동","1111-1111",44,70.2f,177.5,250);
//		hong.id="2222-2222";
		hong.setId("2222-2222");
		System.out.println("ID : "+hong.getId());
		hong.setAge(55);
		System.out.println("AGE : "+hong.getAge());
		hong.getWeight();
		System.out.println("WEIGHT : "+hong.getWeight());
		hong.setSalary(0);
		System.out.println("SALARY : "+hong.setSalary());
		
	
		
	}

}
