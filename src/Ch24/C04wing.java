package Ch24;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
 
class C04GUI extends JFrame //상속
{
	C04GUI() //생성자
	{
		super("네번째 프레임 입니다.");		//프레임창 제목
		
		JPanel pannel = new JPanel();	//패널생성
		
		
		pannel.setLayout(null);			//layout설정x
		
		JTextArea area = new JTextArea();	//텍스트 영역창
//		area.setBounds(10,10,260,240);		
		
		JScrollPane scroll = new JScrollPane(area);	//area에 스크롤 추가하기
		scroll.setBounds(10,10,260,240);
		
		JTextField txt1 = new JTextField();	//텍스트 입력창
		txt1.setBounds(10,260,260,30);		//크기
		
		JButton btn1 = new JButton("버튼1");	//버튼생성
		btn1.setBounds(10,300,120,30);		//버튼위치, 크기지정
		
		JButton btn2 = new JButton("버튼2");	//버튼생성
		btn2.setBounds(150,300,120,30);		//버튼위치, 크기지정
		
		
		pannel.add(btn1);					//패널에 추가
		pannel.add(btn2);					//패널에 추가
		pannel.add(txt1);
//		pannel.add(area);					//scroll만들시 생략가능
		pannel.add(scroll);					
		add(pannel); 						//프레임에 페널 추가
		
		setBounds(80,80,300,400);			//프레임창 위치
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//종료버튼 사용가능 상태
		setVisible(true);			//프레임창 보여주기
									//JFrame이 가지고있는함수이기때문에 상속받는게 가능하다.
				
	}

}
public class C04wing {

	public static void main(String[] args) {

		JFrame frame = new JFrame("첫번째 프레임 입니다");
		frame.setBounds(100,100,700,700);	//x,y,width,height
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		frame.setVisible(true);				//프레임장 표시여부
		
		new C04GUI();

	}

}
