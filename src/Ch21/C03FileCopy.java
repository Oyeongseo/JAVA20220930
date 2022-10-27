package Ch21;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class C03FileCopy {

	public static void main(String[] args)throws Exception {
		
		
		Reader in = new FileReader("c:\\iotest\\original.txt");		//원본
		Writer out = new FileWriter("c:\\iotest\\copyfile.txt");	//복사본

		
		//버퍼배열
		char buff[] =new char[100];
		
		while(true)
		{
			int cnt = in.read(buff); 	//buff크기만큼 읽어서 buff에 저장한뒤 읽은개수를 cnt 에 전달
			if(cnt==-1) {
				break;
			}
			System.out.println("CNT : "+cnt); //
			out.write(buff);
			out.flush();
		}
		in.close();
		out.close();
	}

}
