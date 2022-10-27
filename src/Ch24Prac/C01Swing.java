package Ch24Prac;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class C01GUI extends JFrame
{

	private static final long serialVersionUID = 1L;

	C01GUI()
	{
		super("Chatting Server");
		
		JPanel pan = new JPanel();
		
		pan.setLayout(null);
		
		JTextArea area= new JTextArea();
		
		JScrollPane scroll = new JScrollPane(area);
		scroll.setBounds(10,10,240,240);
		
		JTextField txt1 = new JTextField();
		txt1.setBounds(10,260,240,30);
		
		JButton bt1 = new JButton("파일로 저장");
		bt1.setBounds(300, 30, 120, 30);
		JButton bt2 = new JButton("1 : 1 요청");
		bt2.setBounds(300, 80, 120, 30);
		JButton bt3 = new JButton("대화기록보기");
		bt3.setBounds(300,130,120,30);
		JButton bt4 = new JButton("입력");
		bt4.setBounds(300,260,120,30);

		
		pan.add(bt1);
		pan.add(bt2);
		pan.add(bt3);
		
		pan.add(bt4);
		pan.add(txt1);
//		pan.add(area);
		pan.add(scroll);
		add(pan);
		
		setBounds(80,80,450,350);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}
}
public class C01Swing {

	
	public static void main(String[] args) {
		
		JFrame frame = new JFrame("첫번째 프레임 장입니다");
		frame.setBounds(100,100,700,700);	//x,y,width,height
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		frame.setVisible(true);				//프레임장 표시여부
		
		new C01GUI();

	}

}
