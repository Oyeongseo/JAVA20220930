package Ch14;

//[1번] 다음 main() 메소드와 실행 결과를 참고하여 TV를 상속받은 ColorTV 클래스를 작성하라.


class TV{
	   private int size;
	   public TV(int size) { this.size = size; }
	   protected int getSize() { return size; }
}
	   
class ColorTV  extends TV{
	private int resolution;
	 ColorTV(int size,int resolution) {
		 super(size);
		 this.resolution=resolution;
			 

	 }
	 
	 public void printProperty() {
		 System.out.println(getSize()+"인치"+resolution+"컬러");
	}


}
public class C01Prac {

		public static void main(String[] args) {
			   ColorTV myTV = new ColorTV(32, 1024);
			   myTV.printProperty();
			}
}
