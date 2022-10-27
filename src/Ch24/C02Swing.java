package Ch24;

import javax.swing.JFrame;
 
class C02GUI extends JFrame //상속
{
	C02GUI() //생성자
	{
		super("두번째 프레임 입니다.");
		setBounds(100,100,700,700);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);	//JFrame이 가지고있는함수이기때문에 상속받는게 가능하다.
				
	}

}
public class C02Swing {

	public static void main(String[] args) {

		JFrame frame = new JFrame("첫번째 프레임 입니다");
		frame.setBounds(100,100,700,700);	//x,y,width,height
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		frame.setVisible(true);				//프레임장 표시여부
		
		new C02GUI();

	}

}
