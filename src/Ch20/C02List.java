package Ch20;

import java.util.*;

public class C02List {

	public static void main(String[] args) {
	Set<String> set = new HashSet();
		//추가
		set.add("JAVA");
		set.add("JDBC");
		set.add("OracleDB");
		set.add("JSP");
		set.add("Servlet");
		set.add("SpringFrameWork");
	
		
		
		//확인(저장 수)
		System.out.println("총 개체수 : "+set.size());
		
		//조회
		for(String tmp : set) {
			System.out.println(tmp);
		}
		System.out.println("---------------------");
		//조회(복잡)
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()) {
			String tmp=iter.next();
			System.out.print(tmp);
		}
		set.remove("JAVA");
		//확인
		System.out.println(set.size());
	
	}

}
