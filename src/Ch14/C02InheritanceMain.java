package Ch14;
//상속관계에서 생성자 호출
//상위클래스의 생성자 호출 -> 하위클래스 생성자 호출
//상위클래스 생성자 호출시 super() 예약어를 사용하여 상위클래스의 오버로딩된 생성자에 
//접근이 가능하다

class Parent{
	int x;
	int y;
	Parent(){
		System.out.println("Parent()생성자 호출");
	}
	Parent(int x){
		System.out.println("Parent(x)생성자 호출");
		this.x =x;
	}
	Parent(int x,int y){
		System.out.println("Parent(x,y)생성자 호출");
		this.x =x;
		this.y= y;
	
		
	}
}
class Son extends Parent{
	int z;
	Son(){
		
		super();
	
		System.out.println("Son()생성자 호출");
	}
	
	
	
	
	Son(int x){
		super(x);
		System.out.println(this.x);
	}
	
	
	
	Son(int x,int y){
		super(x, y);
		System.out.println(this.x+","+this.y);
	}
	Son(int x,int y,int z){
		this.z = z;
		System.out.println(this.x+","+this.y+","+this.z);
	}
	
}

public class C02InheritanceMain {

	public static void main(String[] args) {
//		Son ob1 = new Son();
		Son ob2 = new Son(10);
//		Son ob3 = new Son(10,20);
//		Son ob4 = new Son(10,20,30);
		
		
		
		
	}

}
