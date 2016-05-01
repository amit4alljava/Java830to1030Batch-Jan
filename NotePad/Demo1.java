import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;


public class Demo1 {

	public static void main(String[] args) {//throws IOException {
		//System.out.println("\t\n");
		File file = new File("d:\\testfile\\qq\\ww\\pp\\ee\\ty.pdf");
		//file.mkdir();
		//file.mkdirs();
		try {
			if(file.exists()){
			//file.delete();
			File f = new File("d:\\testfile\\qq\\ww\\pp\\ee\\ty12.pdf");
				//file.renameTo(f);
			Locale locale = new Locale("en","US");
			DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT,locale);
			NumberFormat nf = NumberFormat.getCurrencyInstance(locale);
			String d = nf.format(100000.00);
			System.out.println("Data is "+d);
			Date date= new Date();
			// Used to Modify Date
			Calendar c = Calendar.getInstance();
			c.setTime(date);
			c.roll(Calendar.MONTH,15);
			//c.add(Calendar.DATE,10);
			//c.add(Calendar.YEAR, -10);
			//c.add(Calendar.MONTH, 6);
			System.out.println(c.getTime());
			//Date date = new Date(file.lastModified());
			String formattedDate = df.format(date);
			//System.out.println("Today is "+date);
				System.out.println("File details "+formattedDate);
			}
			else
			{
				file.createNewFile();
				System.out.println("File Created..");
			}
			
			//System.out.println("File Created..");
		} catch (IOException e) {
			System.out.println("Some Problem in File Creation "+e);
			//e.printStackTrace();
		}			
		

	}

}
