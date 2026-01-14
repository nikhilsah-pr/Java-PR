import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TimeAPI
{
    public static void main(String[] args)
    {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-YYYY HH:mm:ss" );
        System.out.println("Current Date & Time : "+now.format(formatter));

    }
}