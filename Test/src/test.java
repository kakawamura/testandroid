import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.omg.CORBA.SystemException;


public class test {

	public static void main(String[] args) {

		String startDate = "2014-04-22 14:55:33";
		String endDate = "2014-04-22 14:55:40";
		getMinutesBetweenDate(startDate, endDate);
	}
	
	public static void getMinutesBetweenDate(String startDate, String endDate) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date start = null;
		Date end = null;
		try {
			start	= sdf.parse(startDate);
			end	= sdf.parse(endDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		String min = String.format("%d min, %d sec", 
			    TimeUnit.MILLISECONDS.toMinutes(start.getTime()),
			    TimeUnit.MILLISECONDS.toSeconds(start.getTime()) - 
			    TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(start.getTime()))
			);		
		System.out.println(start.getTime());
		System.out.println(min);
		System.out.println(start.getTime()-end.getTime());
		String min2 = String.format("%d sec",
			    TimeUnit.MILLISECONDS.toSeconds(start.getTime()-end.getTime()) - 
			    TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(start.getTime()-end.getTime()))
			);	
//		int min2 = Integer.valueOf(String.format("%d", 
	//		    TimeUnit.MILLISECONDS.toMinutes(end.getTime()-start.getTime())
		//	));
		System.out.println(min2);
		
		
	}

}
