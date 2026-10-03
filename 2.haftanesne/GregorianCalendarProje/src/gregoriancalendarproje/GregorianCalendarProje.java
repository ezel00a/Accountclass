
package gregoriancalendarproje;
import java.util.GregorianCalendar;

public class GregorianCalendarProje {

    
    public static void main(String[] args) {
GregorianCalendar calendar1= new GregorianCalendar();

System.out.println(calendar1.get(GregorianCalendar.YEAR));
System.out.println(calendar1.get(GregorianCalendar.MONTH));
System.out.println(calendar1.get(GregorianCalendar.DAY_OF_MONTH));
calendar1.setTimeInMillis(1234567898765L);
System.out.println(calendar1.get(GregorianCalendar.YEAR));
System.out.println(calendar1.get(GregorianCalendar.MONTH));
System.out.println(calendar1.get(GregorianCalendar.DAY_OF_MONTH));



    }
    
}
