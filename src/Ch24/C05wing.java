package Ch24;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
 
class C05GUI extends JFrame implements ActionListener,KeyListener
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JTextArea area;
	JScrollPane scroll;
	JTextField txt1;
	JButton btn1;
	JButton btn2;
	
	C05GUI() //생성자
	{
		super("네번째 프레임 입니다.");		//프레임창 제목
		
		JPanel pannel = new JPanel();	//패널생성
		
		
		pannel.setLayout(null);			//layout설정x
		
		area = new JTextArea();	//텍스트 영역창
//		area.setBounds(10,10,260,240);		
		
		scroll = new JScrollPane(area);	//area에 스크롤 추가하기
		scroll.setBounds(10,10,260,240);
		
		txt1 = new JTextField();			//텍스트 입력창
		txt1.setBounds(10,260,260,30);		//크기
		txt1.addKeyListener(this);			//이벤트 추가
		
		btn1 = new JButton("버튼1");	//버튼생성
		btn1.setBounds(10,300,120,30);		//버튼위치, 크기지정
		btn1.addActionListener(this); 		//이벤트 추가
		
		btn2 = new JButton("버튼2");	//버튼생성
		btn2.setBounds(150,300,120,30);		//버튼위치, 크기지정
		btn2.addActionListener(this);
		
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

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btn1) {
			System.out.println("버튼 1 클릭함");
		}
		if(e.getSource()==btn2) {
			System.out.println("버튼 2 클릭함");
		}
		
	}

	@Override
	public void keyTyped(KeyEvent e) {   
	
//		System.out.println("KEYTYPED 함수 : "+e.getKeyChar());
		
	}

	@Override
	public void keyPressed(KeyEvent e) { //누르는순간
		System.out.println("KEYPRESSED 함수 : "+e.getKeyChar());
		System.out.println("KEYPRESSED 함수 : "+e.getKeyCode());
		if(e.getKeyCode()==10) //엔터키
		{
			//1 필드의 내용 ->Area
			area.append("[CLIENR] : "+txt1.getText()+"\n");
			//2 필드의 내용 삭제
			txt1.setText("");
		}
	}

	@Override
	public void keyReleased(KeyEvent e) { //누른키를때는순간
//		System.out.println("KEYRELEASED 함수 : "+e.getKeyChar());
	}

}
public class C05wing {

	public static void main(String[] args) {

		JFrame frame = new JFrame("첫번째 프레임 입니다");
		frame.setBounds(100,100,700,700);	//x,y,width,height
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		frame.setVisible(true);				//프레임장 표시여부
		
		new C05GUI();

	}

}
