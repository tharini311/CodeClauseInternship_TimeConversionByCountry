package tharini174;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
public class timeconversion1 {
    private static final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-M-yyyy hh:mm:ss a z");
	public static void main(String[] args) {
		 Scanner in =new Scanner (System.in);
		 System.out.println("NOTE: Enter the time zone which already exist");
		System.out.println("Enter the time zone ");
	
		String inputzone= in.nextLine(); 
		//Getting Source timezone Id
		ZoneId sourceTimeZone = ZoneId.of(inputzone); 
		//Getting Target timezone Id
		System.out.println("Enter the Target Time zone");
		 String inputtargetzone=in.nextLine();
        ZoneId destinationTimeZone = ZoneId.of(inputtargetzone);
        
        //Current DateTime time
        LocalDateTime todayDateTime = LocalDateTime.now();
         
        //Zoned date time at source timezone
        ZonedDateTime currentISTZonedDateTime = todayDateTime.atZone(sourceTimeZone);      
         
        //Zoned date time at target timezone
        ZonedDateTime currentBSTZonedDateTime = currentISTZonedDateTime.withZoneSameInstant(destinationTimeZone);
         
        //Now let's format date time 
        System.out.println("Time in "+inputzone+"::");
        System.out.println(dateTimeFormatter.format(currentISTZonedDateTime));
        System.out.println("Time in "+inputtargetzone+"::");
        System.out.println(dateTimeFormatter.format(currentBSTZonedDateTime));
	}
}
