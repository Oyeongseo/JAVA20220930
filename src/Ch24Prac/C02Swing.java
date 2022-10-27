package Ch24Prac;

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

class C02GUI extends JFrame implements ActionListener,KeyListener
{

	private static final long serialVersionUID = 1L;
	JTextArea area;
	JScrollPane scroll;
	JTextField txt1;
	JButton bt1;
	JButton bt2;
	JButton bt3;
	JButton bt4;
	
	C02GUI()
	{
		super("Chatting Server");
		
		JPanel pan = new JPanel();
		
		pan.setLayout(null);
		
		area= new JTextArea();
		
		scroll = new JScrollPane(area);
		scroll.setBounds(10,10,240,240);
		
		txt1 = new JTextField();
		txt1.setBounds(10,260,240,30);
		txt1.addActionListener(this);
		
		bt1 = new JButton("파일로 저장");
		bt1.setBounds(300, 30, 120, 30);
		bt1.addActionListener(this);
		
		bt2 = new JButton("1 : 1 요청");
		bt2.setBounds(300, 80, 120, 30);
		bt2.addActionListener(this);
		
		bt3 = new JButton("대화기록보기");
		bt3.setBounds(300,130,120,30);
		bt3.addActionListener(this);
		
		bt4 = new JButton("입력");
		bt4.setBounds(300,260,120,30);
		bt4.addActionListener(this);
		
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
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==bt1) {
			System.out.println("파일저장버튼 클릭");
		}
		if(e.getSource()==bt2) {
			System.out.println("1 : 1 요청버튼 클릭");
		}
		if(e.getSource()==bt3) {
			System.out.println("대화기록보기버튼 클릭");
		}
		if(e.getSource()==bt4) {
			System.out.println("입력 클릭");
		}
		
	}
	@Override
	public void keyTyped(KeyEvent e) {
		
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		
		System.out.println("KEYPRESSED 함수 : "+e.getKeyChar());
		System.out.println("KEYPRESSED 함수 : "+e.getKeyCode());
		if(e.getKeyCode()==10) {
			area.append(txt1.getText()+"\n");
			txt1.setText("");
		
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		System.out.println();
		
	}


}
public class C02Swing {

	
	public static void main(String[] args) {
		
		JFrame frame = new JFrame("첫번째 프레임 장입니다");
		frame.setBounds(100,100,700,700);	//x,y,width,height
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		frame.setVisible(true);				//프레임장 표시여부
		
		new C02GUI();

	}

}
