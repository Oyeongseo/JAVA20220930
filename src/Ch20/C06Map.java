package Ch20;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class C06Map {
	//저장멤버 MAP
	private static Map<String,Integer>map = new HashMap();
	
	public static void Insert(String k, Integer v) {
		if(!map.containsKey(k) && (!map.containsValue(v))) 
		{
		map.put(k, v);}
		else 
		{
			System.out.println("동일한 key가 존재합니다");
		}
	}
	
	public static void ShowInfo() {
		Set<String> set = map.keySet();
		for(String key : set) {
			int value = map.get(key);
			System.out.println("KEY : "+key+" VALUE : "+value);
		}
	}
	public static void Remove(String key) {
		Integer result = map.remove(key);
		if(result == null) {
			System.out.println("삭제 실패");
			
		}else {
			System.out.println("삭제 성공");
		}
	}
	public static void Remove() {
		
	}
	public static void main(String[] args) {
		
		Insert("aaa",1111);
		Insert("bbb",2222);
		Insert("ccc",3333);
		Insert("ddd",4444);
		Insert("ddd",1234);	// 중복 key 가 들어가는경우
		Insert("fff",1234);	// 중복 value 가 들어가는경우
		
		//개수
		System.out.println("저장 수 :"+map.size());
		
		//조회
		ShowInfo();
		//삭제
		Remove("aaa"); //삭제성공 
		Remove("abc"); //삭제실패
		//개수
		System.out.println("저장 수 :"+map.size());
		Remove(1234);

	}

}
