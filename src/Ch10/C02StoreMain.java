package Ch10;

class Customer{
	//속성
	int myMoney;	//보유금액	
	int colaCnt;	//콜라보유갯수
	//기능
	//구매하기
	void pay(Store store,int money) {
		//내보유금액에서 money차감
		myMoney -= money;
		//지정된 store 에 money를 전달
		int cnt = store.returnCola(money);
		//콜라 개수를 누적
		colaCnt+=cnt;
		
	}
	@Override
	public String toString() {
		return "Cistomer [myMoney=" + myMoney + ", colaCnt=" + colaCnt + "]";
	}
	public Customer(int myMoney, int colaCnt) {
		super();
		this.myMoney = myMoney;
		this.colaCnt = colaCnt;
	}
}
class Store {
	//속성
	int savedMoney;	//보유 금액
	int colaCnt;	//콜라 재고량
	int price;		//콜라 가격
	//기능
	int returnCola(int money) {
		//1보유금액에 받은 금액 누적
		savedMoney+=money;
		//2받은 금액만큼 콜라 재고량 감소
		int cnt=money/price;
		colaCnt-=cnt;
		//3콜라 개수 리턴
		return cnt;
	}
	public Store(int savedMoney, int colaCnt, int price) {
		super();
		this.savedMoney = savedMoney;
		this.colaCnt = colaCnt;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Store [savedMoney=" + savedMoney + ", colaCnt=" + colaCnt + ", price=" + price + "]";
	}
}
public class C02StoreMain {

	public static void main(String[] args) {
		//고객 객체
		Customer hong = new Customer(10000,0);
		Customer jung = new Customer(20000,0);
		//편의점 객체
		Store GS감삼 = new Store(100000,100,1000);
		Store GS반월 = new Store(100000,100,1000);
		//구매하기
		hong.pay(GS감삼, 2000);
		jung.pay(GS감삼, 3000);
		//확인
		System.out.println("-------------고객 정보 확인-------------");
		System.out.println(hong);
		System.out.println(jung);
		System.out.println("-------------편의점 정보 확인------------");
		System.out.println(GS감삼.toString());
		System.out.println(GS반월.toString());
		
		
		
	}

}
