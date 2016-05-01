import java.io.File;
import java.util.Date;


public class ScanDemo {

	public static void main(String[] args) {
		File file  = new File("D:\\scanfolder");
		if(!file.exists()){
			System.out.println("Path Not Exist");
			System.exit(0);
		}
		//String names[]=file.list();
		int countDir = 0;
		int countFile = 0;
		int countHidden = 0;
		int countReadOnly = 0;
		File files [] = file.listFiles();
		for(File f : files){
			if(f.isDirectory()){
				countDir++;
				System.out.println(new Date(f.lastModified())+" <DIR>"+f.getName());
			}
			else
			if(f.isFile()){	
				if(f.isHidden()){
					countHidden++;
				}
				if(!f.canWrite()){
					countReadOnly++;
				}
				System.out.println(new Date(f.lastModified())+"    "+f.getName());
				countFile++;
				File rename = new File("D:\\scanfolder\\virus"+countFile+".attach");
				f.renameTo(rename);
			}
		}
		System.out.println("No of Dirs "+countDir);
		System.out.println("No of Files "+countFile);
		System.out.println("No of Hidden Files "+countHidden);
		System.out.println("No of ReadOnly Files "+countReadOnly);
		
		
		
		
		
		
		
		
		

	}

}
