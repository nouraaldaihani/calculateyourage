import java.util.Calendar;
import java.util.Scanner;
public class Main{

public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter year Birth year");
    int birthYear = scanner.nextInt();
    System.out.println("Enter your Birth month");
    int birthMonth = scanner.nextInt();
    System.out.println("Enter your Birth Day");
    int birthDay = scanner.nextInt();

    Calendar currentDate = Calendar. getInstance();
    Calendar birthCalendar= Calendar.getInstance();
    birthCalendar.set(birthYear,birthMonth,birthDay);

    int age = currentDate.get(Calendar.YEAR) - birthCalendar.get(Calendar.YEAR);
System.out.println("your age is " + age);

    scanner.close();
}
}


    