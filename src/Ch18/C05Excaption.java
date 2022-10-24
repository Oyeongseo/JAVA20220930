package Ch18;

public class C05Excaption {

	public static void main(String[] args) {
		
		try {
		String str = null;
		System.out.println(str.toString());
		int arr[]=new int[3];
		arr[4] =10;
		System.out.println(10/0); //산술 오류
		Animal cat = new Cat();
		Dog dog =(Dog)cat;
		}
		catch(Exception e) {e.printStackTrace();}
//		catch(NullPointerException e) 
//		{
//			System.out.println("NULL 예외");
//		}
//		catch(ArrayIndexOutOfBoundsException e) 
//		{
//			System.out.println("IDX 예외");
//		}
//		catch(ClassCastException e) 
//		{
//			System.out.println("CLASS 예외");
//		}
		System.out.println("실행코드1");
		System.out.println("실행코드2");
		System.out.println("실행코드3");
	}

}
