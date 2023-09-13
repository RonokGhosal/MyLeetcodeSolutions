import java.io.File;
import java.text.SimpleDateFormat;
import java.time.Instant;

public class fileTest {
   public static void main(String[] args) {


		//   SimpleDateFormat formatter = new SimpleDateFormat("%Y-%m-%dT%H:%M:%S.%fZ");
		//   String timestampTriggered =  "2023-07-13T00:06:00.000Z";
	       Instant now = Instant.now() ;
	       String timestampTriggeredbefore5mins =  "2023-08-09T15:53:06.267380Z";
	       Instant instant = Instant.parse( timestampTriggeredbefore5mins.replace( " " , "T" ) );
	       Instant fiveminsbefore = now.minusSeconds(6*60);
	       System.out.println("Time now is " + now);
	       System.out.println("Time 5 minutes before  is " + fiveminsbefore);
          if (!instant.isBefore( fiveminsbefore ) ) {
          	System.out.println("Tiggering time is within 5 minutes");
          	System.out.println("timestampTriggeredbefore5mins time is " + timestampTriggeredbefore5mins);
          } else {
	          System.out.println("Tiggering time is before  5 minutes");
	          System.out.println("timestampTriggeredbefore5mins time is " + timestampTriggeredbefore5mins);
          }




	}
}
