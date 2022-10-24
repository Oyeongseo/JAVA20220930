package Ch10;
class Buyer{
	int myMoney;
	int appleCnt;


	void pay(Seller seller, int money) {
		myMoney -=money;
		int cnt = seller.returnapple(money);
		appleCnt+=cnt;
	}


	public Buyer(int myMoney, int appleCnt) {
		super();
		this.myMoney = myMoney;
		this.appleCnt = appleCnt;
	}


	@Override
	public String toString() {
		return "Buyer [myMoney=" + myMoney + ", appleCnt=" + appleCnt + "]";
	}
}
class Seller{
	int myMoney;
	int appleCnt;
	int price;
	int returnapple(int money) {
		myMoney+=money;
		int cnt=money/price;
		appleCnt-=cnt;
		return cnt;
	}
	public Seller(int myMoney, int appleCnt, int price) {
		super();
		this.myMoney = myMoney;
		this.appleCnt = appleCnt;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Seller [myMoney=" + myMoney + ", appleCnt=" + appleCnt + ", price=" + price + "]";
	}
	
}

public class PRAC {

	public static void main(String[] args) {
		Seller seller = new Seller(10000,100,1000);
		Buyer buyer = new Buyer(5000,0);
		buyer.pay(seller,2000);
		
		System.out.println(seller);	//보유금액,사과개수 출력
		System.out.println(buyer);	//보유금액,사과개수 출력

	}

}
