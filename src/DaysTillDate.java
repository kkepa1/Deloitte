import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;


public class DaysTillDate {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int year = 0;
        int month = 0;
        int day = 0;

        System.out.print("Enter year: ");
        year = scan.nextInt();

        System.out.print("Enter month (number): ");
        month = scan.nextInt();

        System.out.print("Enter day: ");
        day = scan.nextInt();

        getDateDifference(year, month, day);
    }

    public static void getDateDifference(int year, int month, int day) {
        try {
            LocalDate startDate = LocalDate.now();
            LocalDate endDate = LocalDate.of(year, month, day);

            System.out.println(ChronoUnit.DAYS.between(endDate, startDate));
        } catch (Exception e) {
            System.err.println("Invalid date!");
        }
    }
}
