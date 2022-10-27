package Ch24;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
 
class C03GUI extends JFrame //상속
{
	C03GUI() //생성자
	{
		super("세번째 프레임 입니다.");		//프레임창 제목
		JPanel pannel = new JPanel();	//패널생성
		Color col = new Color(207,211,37);	//RGB(Red(0-255),Green(0-255),Blue(0-255)
		pannel.setBackground(col);
		
		add(pannel); 						//프레임에 페널 추가
		
		setBounds(100,100,700,700);			//프레임창 위치
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//종료버튼 사용가능 상태
		setVisible(true);			//프레임창 보여주기
									//JFrame이 가지고있는함수이기때문에 상속받는게 가능하다.
				
	}

}
public class C03wing {

	public static void main(String[] args) {

		JFrame frame = new JFrame("첫번째 프레임 입니다");
		frame.setBounds(100,100,700,700);	//x,y,width,height
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		frame.setVisible(true);				//프레임장 표시여부
		
		new C03GUI();

	}

}
