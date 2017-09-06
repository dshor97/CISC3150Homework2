import java.util.Scanner;

public class Question2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int year;
        String firstDay;
        boolean isLeapYear = false;

        System.out.print("What year would you like the calender of: ");
        year = input.nextInt();
        System.out.print("What is the first day of that year: ");
        firstDay = input.next();

        if(year % 4 == 0){
            isLeapYear = true;
        }




    }
}
