package Ch24;

import javax.swing.JFrame;

public class C01Swing {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("첫번째 프레임 장입니다");
		frame.setBounds(100,100,700,700);	//x,y,width,height
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		frame.setVisible(true);				//프레임장 표시여부
		
		

	}

}
