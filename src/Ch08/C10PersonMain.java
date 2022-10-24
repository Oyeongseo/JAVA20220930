package Ch08;


class C10Person
{
	//속성(=필드,멤버변수)
	String name;
	int age;
	String addr;
	//기능(멤버매서드)

void ShowInfo() {
		System.out.printf("");
	}
	
	void setPerson(String name) {
		
		this.name = name;
		
		
	}void setPerson(String name, int age){
		this.name = name;
		this.age = age;
		
	}
	void setPerson(String name, int age,String addr)
	{
		this.name = name;
		this.age = age;
		this.addr = addr;
		
	}
	
		
}
public class C10PersonMain {

	
	public static void main(String[] args) {
		
		C10Person obj = new C10Person();
		obj.setPerson("홍길동"); //멤버변수 name에 "홍길동"저장
		obj.ShowInfo();
		obj.setPerson("서길동",10);//멤버변수 name,age에 각각 저장
		obj.ShowInfo();
		obj.setPerson("강호동",55,"서울"); //멤버면수 name,age,addr에 각각저장
		obj.ShowInfo();
		
	}

}
