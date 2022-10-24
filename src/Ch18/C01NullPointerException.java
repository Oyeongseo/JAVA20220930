package Ch18;

public class C01NullPointerException {


	public static void main(String[] args) {
		 
		try {
		String str = null;
		System.out.println(str.toString());
		}
		catch(NullPointerException e)
		{
//			System.out.println("예외발생");
			System.out.println("-----e.getCause()-----");
			System.out.println(e.getCause());			//원인가져오기
//			System.out.println("-----e.toString()-----");
//			System.out.println(e.toString());			//예외객체 정보
//			System.out.println("-----e.getStackTrace()-----");
//			System.out.println(e.getStackTrace());		//
//			System.out.println("-----e.printStackTrace()-----");
//			e.printStackTrace();
		}
		System.out.println("실행코드1");
		System.out.println("실행코드2"); 
		
	}

}
