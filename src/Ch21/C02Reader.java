package Ch21;

import java.io.FileNotFoundException;
import java.io.FileReader;

import java.io.Reader;

public class C02Reader {

	public static void main(String[] args) throws Exception {
		Reader in = new FileReader("c:\\iotest\\test.txt");
		
		while(true) {
			int data = in.read();
			if(data == -1) {
				break;
			}
			System.out.print((char)data); //출력전 (char)강제형변환 시켜주면 문자를 확인할수있음.
										 //writer에서 입력한 문자를 확인할수있다
		}

	}

}
