/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sd.code.container.date;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author motaz
 */
public class DateExtra {
    
    private static int getCalendarValue(Date aday, int tag){
	
      Calendar cal = Calendar.getInstance();
      cal.setTime(aday);
      return cal.get(tag);
      
    }
    
    public static int getDay(Date aday){
	
	return getCalendarValue(aday, Calendar.DAY_OF_MONTH);
    }
    
    public static int getMonth(Date aday){
	
      return getCalendarValue(aday, Calendar.MONTH) +1;
      
    }
    
    public static int getYear(Date aday){
	
      return getCalendarValue(aday, Calendar.YEAR);
      
    }
    
    public static int GetCurrentYear(){
        
        Date now = new Date();
        return getYear(now);
    }
    
    public static int getLastDayInMonth(Date aday){
        
        Calendar cal = Calendar.getInstance();
        cal.setTime(aday);
        int lastDay =  cal.getActualMaximum(Calendar.DAY_OF_MONTH);
        return lastDay;
    }
    
    public static Date getEndOfToday() {

        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.HOUR_OF_DAY, 23);
        calendar.set(Calendar.MINUTE, 59);
        calendar.set(Calendar.SECOND, 59);
        calendar.set(Calendar.MILLISECOND, 999);

        return  calendar.getTime();
    } 
    
    public static Date increaseDay(Date aday, int increaseBy){
	
      Calendar cal = Calendar.getInstance();
      cal.setTime(aday);
      cal.add(Calendar.HOUR, increaseBy * 24);
      
      return cal.getTime();
      
    }  
    

}
