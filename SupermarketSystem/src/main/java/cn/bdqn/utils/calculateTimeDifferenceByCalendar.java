package cn.bdqn.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class calculateTimeDifferenceByCalendar {
	public void calculateTimeDifference(Date birthday) {
		SimpleDateFormat simpleFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm");
		Date nDate = new Date();
		long nDate1 = nDate.getTime();
		long birthday1 =birthday.getTime();
		int days = (int) ((nDate1 - birthday1)/(1000 * 60 * 60 *24));
		System.out.println(days);
	}
	/**
	* 用SimpleDateFormat计算时间差
	* @throws ParseException 
	*/
	public void calculateTimeDifferenceBySimpleDateFormat() throws ParseException {
	    SimpleDateFormat simpleFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm");
	    /*天数差*/
	    Date fromDate1 = simpleFormat.parse("2018-03-01 12:00");  
	    Date toDate1 = simpleFormat.parse("2018-03-12 12:00");  
	    long from1 = fromDate1.getTime();  
	    long to1 = toDate1.getTime();  
	    int days = (int) ((to1 - from1) / (1000 * 60 * 60 * 24));  
	    System.out.println("两个时间之间的天数差为：" + days);

	    /*小时差*/
	    Date fromDate2 = simpleFormat.parse("2018-03-01 12:00");  
	    Date toDate2 = simpleFormat.parse("2018-03-12 12:00");  
	    long from2 = fromDate2.getTime();  
	    long to2 = toDate2.getTime();  
	    int hours = (int) ((to2 - from2) / (1000 * 60 * 60));
	    System.out.println("两个时间之间的小时差为：" + hours);

	    /*分钟差*/
	    Date fromDate3 = simpleFormat.parse("2018-03-01 12:00");  
	    Date toDate3 = simpleFormat.parse("2018-03-12 12:00");  
	    long from3 = fromDate3.getTime();  
	    long to3 = toDate3.getTime();  
	    int minutes = (int) ((to3 - from3) / (1000 * 60));  
	    System.out.println("两个时间之间的分钟差为：" + minutes);
	}

	public static void main(String[] args) throws ParseException {
		
		String strDate;
		Date d = new Date();
		System.out.println(d);
		calculateTimeDifferenceByCalendar c =new calculateTimeDifferenceByCalendar();
		c.calculateTimeDifferenceBySimpleDateFormat();
	};
}
