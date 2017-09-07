import com.sun.org.apache.bcel.internal.classfile.SourceFile;

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
                System.out.printf("%" + 25 + "s\n", "January " + year);
                System.out.printf("%3s%4s%4s%4s%4s%4s%4s\n", "Sun","Mon", "Tue", "Wed", "Thu", "Fri", "Sat");
                break;
            case 2:
                System.out.printf("%" + 25 + "s\n", "February " + year);
                System.out.printf("%3s%4s%4s%4s%4s%4s%4s\n", "Sun","Mon", "Tue", "Wed", "Thu", "Fri", "Sat");
                break;
            case 3:
                System.out.printf("%" + 25 + "s\n", "March " + year);
                System.out.printf("%3s%4s%4s%4s%4s%4s%4s\n", "Sun","Mon", "Tue", "Wed", "Thu", "Fri", "Sat");
                break;
            case 4:
                System.out.printf("%" + 25 + "s\n", "April " + year);
                System.out.printf("%3s%4s%4s%4s%4s%4s%4s\n", "Sun","Mon", "Tue", "Wed", "Thu", "Fri", "Sat");
                break;
            case 5:
                System.out.printf("%" + 25 + "s\n", "May " + year);
                System.out.printf("%3s%4s%4s%4s%4s%4s%4s\n", "Sun","Mon", "Tue", "Wed", "Thu", "Fri", "Sat");
                break;
            case 6:
                System.out.printf("%" + 25 + "s\n", "June " + year);
                System.out.printf("%3s%4s%4s%4s%4s%4s%4s\n", "Sun","Mon", "Tue", "Wed", "Thu", "Fri", "Sat");
                break;
            case 7:
                System.out.printf("%" + 25 + "s\n", "July " + year);
                System.out.printf("%3s%4s%4s%4s%4s%4s%4s\n", "Sun","Mon", "Tue", "Wed", "Thu", "Fri", "Sat");
                break;
            case 8:
                System.out.printf("%" + 25 + "s\n", "August " + year);
                System.out.printf("%3s%4s%4s%4s%4s%4s%4s\n", "Sun","Mon", "Tue", "Wed", "Thu", "Fri", "Sat");
                break;
            case 9:
                System.out.printf("%" + 25 + "s\n", "September " + year);
                System.out.printf("%3s%4s%4s%4s%4s%4s%4s\n", "Sun","Mon", "Tue", "Wed", "Thu", "Fri", "Sat");
                break;
            case 10:
                System.out.printf("%" + 25 + "s\n", "October " + year);
                System.out.printf("%3s%4s%4s%4s%4s%4s%4s\n", "Sun","Mon", "Tue", "Wed", "Thu", "Fri", "Sat");
                break;
            case 11:
                System.out.printf("%" + 25 + "s\n", "November " + year);
                System.out.printf("%3s%4s%4s%4s%4s%4s%4s\n", "Sun","Mon", "Tue", "Wed", "Thu", "Fri", "Sat");
                break;
            case 12:
                System.out.printf("%" + 25 + "s\n", "December " + year);
                System.out.printf("%3s%4s%4s%4s%4s%4s%4s\n", "Sun","Mon", "Tue", "Wed", "Thu", "Fri", "Sat");
                break;
        }
        printCalender((month + 1), year, day, leapYear);

    }
    public static void printMonth(int month, String day, boolean isLeapYear){
        
    }
}
