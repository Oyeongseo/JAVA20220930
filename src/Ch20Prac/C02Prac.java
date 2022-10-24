package Ch20Prac;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class C02Prac {

	public static void main(String[] args) {
	
		int num = 0;
		//Map 만들기
		Map<String,String> map = new HashMap();
		Scanner sc = new Scanner(System.in);
		String id=null;
		String pw=null;
		while(true) {
			System.out.println("=======M E N U =======");
			System.out.println("1 ID/PW 등록");
			System.out.println("2 ID/PW 조회");
			System.out.println("3 Password 변경");
			System.out.println("4 ID/PW 삭제");
			System.out.println("5 전체조회");
			System.out.println("6 종료");
			System.out.println("=======M E N U =======");
			System.out.print("번호 : " );
			num = sc.nextInt();
			switch(num)
			{
			case 1:
				//map 에 ID/PW등록
				//단! 기존에 동일 ID가 있으면 등록불가(containsKey사용)
				System.out.print("ID를 입력하세요");
				id = sc.next();
				System.out.print("PW를 입력하세요");
				pw = sc.next();
				if ((!map.containsKey(id)) && (!map.containsValue(pw)))
				{
					map.put(id, pw);
					System.out.println("ID와 PW가 등록되었습니다.");
				}else {
					System.out.println("동일한 key가 존재합니다 .. 혹은 추가할수없습니다");
				}
	
				break;
			case 2:
				//ID를 받아서 map에 있는 동일한 Id/pw 를 출력
				System.out.print("ID를 입력하세요");
				id = sc.next();
				if((map.containsKey(id))) {
					System.out.println("ID가 존재합니다");
					System.out.println(id+","+pw);
				}
				else {
					System.out.println("ID가 존재하지 않습니다");
				}
				
				break;
			case 3:
				//ID를 받아서 map에 있는 동일한 id의 password를 변경 
				System.out.print("ID를 입력하세요");
				id = sc.next();
				
				break;
			case 4:
				//ID를 받아서 map에 있는 동일한 id/pw를 삭제
				System.out.print("ID를 입력하세요");
				id = sc.next();
				Remove(id);
					
				break;
			case 5:
				//전체조회
				
				break;
			case 6:
				System.exit(-1);
			default:
				System.out.println("다시 입력...");
			}
		
		}
		
		
		
		
		
		
	}

	private static void Remove(String id) {
		// TODO Auto-generated method stub
		
	}

}
