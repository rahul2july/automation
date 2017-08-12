package Day7;

import java.text.SimpleDateFormat;
import java.util.Date;

public class datetimestamps {
	
	public static void main(String[] args) {
		
		Date date = new Date();
		System.out.println(date);
//		dd-MMM-yyyy hh-mm-ss
		SimpleDateFormat sformat = new SimpleDateFormat("dd-MMM-yyyy hh-mm-ss");
		String output = sformat.format(date);
		System.out.println(output);
		
	}

}
