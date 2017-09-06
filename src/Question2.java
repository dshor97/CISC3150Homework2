import java.util.Scanner;

public class Question2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int month = 1;

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
    public static void printCalender(int month, String day){
        switch (month){
            default:
                System.out.println("Month is an invalid");
                break;
            case 1:
                System.out.printf("","January " + 2015);

                break;
            case 2:
                System.out.printf("","January " + 2015);
                break;
            case 3:
                System.out.printf("","January " + 2015);
                break;
            case 4:
                System.out.printf("","January " + 2015);
                break;
            case 5:
                System.out.printf("","January " + 2015);
                break;
            case 6:
                System.out.printf("","January " + 2015);
                break;
            case 7:
                System.out.printf("","January " + 2015);
                break;
            case 8:
                System.out.printf("","January " + 2015);
                break;
            case 9:
                System.out.printf("","January " + 2015);
                break;
            case 10:

                break;
            case 11:

                break;
            case 12:

                break;
        }
        printCalender((month + 1), day);

    }
}
