package Ch17;

public class C05StringBuffer {

	public static void main(String[] args) {
	String str1 = "Hello";
	String str2 = "World";
	str1 = str1.concat(str2);
	System.out.println(str1);
	
	System.out.println("str : "+System.identityHashCode(str1));
	System.out.println("str : "+System.identityHashCode(str2));
	
	int start = (int)System.currentTimeMillis();
	System.out.println("start : "+start+"ms");
	String str = "";
	for(int i=0; i<10000;i++) {
		str+="H";}
	
		StringBuffer buffer=new StringBuffer();
		for(int i=0; i<10000;i++) {
			buffer.append("H");
			
		
	}
	long end = System.currentTimeMillis(); 
	System.out.println("소요시간 : "+(end-start)+"ms");
	
	}
}
