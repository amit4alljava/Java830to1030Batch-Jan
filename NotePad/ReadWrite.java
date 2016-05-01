import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class ReadWrite {

	public static String readFile(String path) throws IOException{
		FileInputStream fi = new FileInputStream(path);
		int singleByte = fi.read();
		while(singleByte!=-1){
			System.out.print((char)singleByte);
			singleByte = fi.read();
		}
		fi.close();
		return null;
		
	}
	public static void main(String[] args) throws IOException {
		readFile("D:\\scanfolder\\virus1.attach");

	}

}
