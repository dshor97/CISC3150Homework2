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

        printCalender(month,year,firstDay,isLeapYear);




    }
    public static void printCalender(int month, int year, String day, boolean leapYear){
        switch (month){
            default:
                System.out.println("Month is an invalid");
                return;
            case 1:
                System.out.println("January " + year);
                System.out.println("Mon Tue Wed Thu Fri Sat Sun");
                break;
            case 2:
                System.out.println("February " + year);
                System.out.println("Mon Tue Wed Thu Fri Sat Sun");
                break;
            case 3:
                System.out.println("March " + year);
                System.out.println("Mon Tue Wed Thu Fri Sat Sun");
                break;
            case 4:
                System.out.println("April " + year);
                System.out.println("Mon Tue Wed Thu Fri Sat Sun");
                break;
            case 5:
                System.out.println("May " + year);
                System.out.println("Mon Tue Wed Thu Fri Sat Sun");
                break;
            case 6:
                System.out.println("June " + year);
                System.out.println("Mon Tue Wed Thu Fri Sat Sun");
                break;
            case 7:
                System.out.println("July " + year);
                System.out.println("Mon Tue Wed Thu Fri Sat Sun");
                break;
            case 8:
                System.out.println("August " + year);
                System.out.println("Mon Tue Wed Thu Fri Sat Sun");
                break;
            case 9:
                System.out.printf("\n","September" + year);
                System.out.println("Mon Tue Wed Thu Fri Sat Sun");
                break;
            case 10:
                System.out.printf("\n","October" + year);
                System.out.println("Mon Tue Wed Thu Fri Sat Sun");
                break;
            case 11:
                System.out.printf("\n","November" + year);
                System.out.println("Mon Tue Wed Thu Fri Sat Sun");
                break;
            case 12:
                System.out.printf("\n","December" + year);
                System.out.println("Mon Tue Wed Thu Fri Sat Sun");
                break;
        }
        printCalender((month + 1), year, day, leapYear);

    }
}
