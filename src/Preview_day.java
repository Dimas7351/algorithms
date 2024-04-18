import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Preview_day {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int count_days = 0;
        int last_sec = 59+59*60+23*60*60;

        DateTimeFormatter parseFormat = DateTimeFormatter.ofPattern("H:mm:ss");


        for(int i = 0; i<n; i++) {
            String timeString = sc.nextLine();
            LocalTime time = LocalTime.parse(timeString, parseFormat);
            int h = time.getHour();
            int m = time.getMinute();
            int s = time.getSecond();
            int totalmilisec = s+m*60+h*60*60;
            if(totalmilisec<=last_sec) {
                count_days++;
            }
            last_sec = totalmilisec;
        }
        System.out.println(count_days);

    }
}
