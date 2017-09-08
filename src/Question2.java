
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

        System.out.println();
        printCalender(month,year,firstDay,isLeapYear);

    }
    public static void printCalender(int month, int year, String day, boolean isleapYear){
        String nextDay;
        switch (month){
            default:
                return;
            case 1:
                System.out.printf("%" + 20 + "s\n", "January " + year);
                System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "Sun","Mon", "Tue", "Wed", "Thu", "Fri", "Sat");
                nextDay = printMonth(month,day,isleapYear);
                break;
            case 2:
                System.out.printf("%" + 20 + "s\n", "February " + year);
                System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "Sun","Mon", "Tue", "Wed", "Thu", "Fri", "Sat");
                nextDay = printMonth(month,day,isleapYear);
                break;
            case 3:
                System.out.printf("%" + 18 + "s\n", "March " + year);
                System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "Sun","Mon", "Tue", "Wed", "Thu", "Fri", "Sat");
                nextDay = printMonth(month,day,isleapYear);
                break;
            case 4:
                System.out.printf("%" + 18 + "s\n", "April " + year);
                System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "Sun","Mon", "Tue", "Wed", "Thu", "Fri", "Sat");
                nextDay = printMonth(month,day,isleapYear);
                break;
            case 5:
                System.out.printf("%" + 17 + "s\n", "May " + year);
                System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "Sun","Mon", "Tue", "Wed", "Thu", "Fri", "Sat");
                nextDay = printMonth(month,day,isleapYear);
                break;
            case 6:
                System.out.printf("%" + 17 + "s\n", "June " + year);
                System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "Sun","Mon", "Tue", "Wed", "Thu", "Fri", "Sat");
                nextDay = printMonth(month,day,isleapYear);
                break;
            case 7:
                System.out.printf("%" + 18 + "s\n", "July " + year);
                System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "Sun","Mon", "Tue", "Wed", "Thu", "Fri", "Sat");
                nextDay = printMonth(month,day,isleapYear);
                break;
            case 8:
                System.out.printf("%" + 18 + "s\n", "August " + year);
                System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "Sun","Mon", "Tue", "Wed", "Thu", "Fri", "Sat");
                nextDay = printMonth(month,day,isleapYear);
                break;
            case 9:
                System.out.printf("%" + 19 + "s\n", "September " + year);
                System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "Sun","Mon", "Tue", "Wed", "Thu", "Fri", "Sat");
                nextDay = printMonth(month,day,isleapYear);
                break;
            case 10:
                System.out.printf("%" + 20 + "s\n", "October " + year);
                System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "Sun","Mon", "Tue", "Wed", "Thu", "Fri", "Sat");
                nextDay = printMonth(month,day,isleapYear);
                break;
            case 11:
                System.out.printf("%" + 20 + "s\n", "November " + year);
                System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "Sun","Mon", "Tue", "Wed", "Thu", "Fri", "Sat");
                nextDay = printMonth(month,day,isleapYear);
                break;
            case 12:
                System.out.printf("%" + 20 + "s\n", "December " + year);
                System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "Sun","Mon", "Tue", "Wed", "Thu", "Fri", "Sat");
                nextDay = printMonth(month,day,isleapYear);
                break;
        }
        System.out.println();
        printCalender((month + 1), year, nextDay, isleapYear);

    }
    public static String printMonth(int month, String day, boolean isLeapYear){
        int dayNum = dayNumber(day);
        if(month == 2){
            if(isLeapYear) {
                switch (dayNum) {
                    default:
                        System.out.println("Invalid month");
                        break;
                    case 1:
                        System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "1", "2", "3", "4", "5", "6", "7");
                        System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "8", "9", "10", "11", "12", "13", "14");
                        System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "15", "16", "17", "18", "19", "20", "21");
                        System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "22", "23", "24", "25", "26", "27", "28");
                        System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "29", "", "", "", "", "", "");
                        return "Monday";
                    case 2:
                        System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "", "1", "2", "3", "4", "5", "6");
                        System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "7", "8", "9", "10", "11", "12", "13");
                        System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "14", "15", "16", "17", "18", "19", "20");
                        System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "21", "22", "23", "24", "25", "26", "27");
                        System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "28", "29", "", "", "", "", "");
                        return "Tuesday";

                    case 3:
                        System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "", "", "1", "2", "3", "4", "5");
                        System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "6", "7", "8", "9", "10", "11", "12");
                        System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "13", "14", "15", "16", "17", "18", "19");
                        System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "20", "21", "22", "23", "24", "25", "26");
                        System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "27", "28", "29", "", "", "", "");
                        return "Wednesday";

                    case 4:
                        System.out.printf("%4s%4s%4s4s%4s%4s%4s\n", "", "", "", "1", "2", "3", "4");
                        System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "5", "6", "7", "8", "9", "10", "11");
                        System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "12", "13", "14", "15", "16", "17", "18");
                        System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "19", "20", "21", "22", "23", "24", "25");
                        System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "26", "27", "28", "29", "", "", "");
                        return "Thursday";

                    case 5:
                        System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "", "", "", "", "1", "2", "3");
                        System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "4", "5", "6", "7", "8", "9", "10");
                        System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "11", "12", "13", "14", "15", "16", "17");
                        System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "18", "19", "20", "21", "22", "23", "24");
                        System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "25", "26", "27", "28", "29", "", "");
                        return "Friday";

                    case 6:
                        System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "", "", "", "", "", "1", "2");
                        System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "3", "4", "5", "6", "7", "8", "9");
                        System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "10", "11", "12", "13", "14", "15", "16");
                        System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "17", "18", "19", "20", "21", "22", "23");
                        System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "24", "25", "26", "27", "28", "29", "");
                        return "Saturday";

                    case 7:
                        System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "", "", "", "", "", "", "1");
                        System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "2", "3", "4", "5", "6", "7", "8");
                        System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "9", "10", "11", "12", "13", "14", "15");
                        System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "16", "17", "18", "19", "20", "21", "22");
                        System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "23", "24", "25", "26", "27", "28", "29");
                        return "Sunday";

                }
            }else {
                switch (dayNum) {
                    default:
                        System.out.println("Invalid month");
                        break;
                    case 1:
                        System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "1", "2", "3", "4", "5", "6", "7");
                        System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "8", "9", "10", "11", "12", "13", "14");
                        System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "15", "16", "17", "18", "19", "20", "21");
                        System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "22", "23", "24", "25", "26", "27", "28");
                        return "Sunday";

                    case 2:
                        System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "", "1", "2", "3", "4", "5", "6");
                        System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "7", "8", "9", "10", "11", "12", "13");
                        System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "14", "15", "16", "17", "18", "19", "20");
                        System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "21", "22", "23", "24", "25", "26", "27");
                        System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "28", "", "", "", "", "", "");
                        return "Monday";

                    case 3:
                        System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "", "", "1", "2", "3", "4", "5");
                        System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "6", "7", "8", "9", "10", "11", "12");
                        System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "13", "14", "15", "16", "17", "18", "19");
                        System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "20", "21", "22", "23", "24", "25", "26");
                        System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "27", "28", "", "", "", "", "");
                        return "Tuesday";

                    case 4:
                        System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "", "", "", "1", "2", "3", "4");
                        System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "5", "6", "7", "8", "9", "10", "11");
                        System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "12", "13", "14", "15", "16", "17", "18");
                        System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "19", "20", "21", "22", "23", "24", "25");
                        System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "26", "27", "28", "", "", "", "");
                        return "Wednesday";

                    case 5:
                        System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "", "", "", "", "1", "2", "3");
                        System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "4", "5", "6", "7", "8", "9", "10");
                        System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "11", "12", "13", "14", "15", "16", "17");
                        System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "18", "19", "20", "21", "22", "23", "24");
                        System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "25", "26", "27", "28", "", "", "");
                        return "Thursday";

                    case 6:
                        System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "", "", "", "", "", "1", "2");
                        System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "3", "4", "5", "6", "7", "8", "9");
                        System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "10", "11", "12", "13", "14", "15", "16");
                        System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "17", "18", "19", "20", "21", "22", "23");
                        System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "24", "25", "26", "27", "28", "", "");
                        return "Friday";

                    case 7:
                        System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "", "", "", "", "", "", "1");
                        System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "2", "3", "4", "5", "6", "7", "8");
                        System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "9", "10", "11", "12", "13", "14", "15");
                        System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "16", "17", "18", "19", "20", "21", "22");
                        System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "23", "24", "25", "26", "27", "28", "");
                        return "Saturday";

                }
            }
        }else {
            if (has31Days(month)) {
                switch (dayNum) {
                    default:
                        System.out.println("Invalid month");
                        break;
                    case 1:
                        System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "1", "2", "3", "4", "5", "6", "7");
                        System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "8", "9", "10", "11", "12", "13", "14");
                        System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "15", "16", "17", "18", "19", "20", "21");
                        System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "22", "23", "24", "25", "26", "27", "28");
                        System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "29", "30", "31", "", "", "", "");
                        return "Wednesday";

                    case 2:
                        System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "", "1", "2", "3", "4", "5", "6");
                        System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "7", "8", "9", "10", "11", "12", "13");
                        System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "14", "15", "16", "17", "18", "19", "20");
                        System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "21", "22", "23", "24", "25", "26", "27");
                        System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "28", "29", "30", "31", "", "", "");
                        return "Thursday";

                    case 3:
                        System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "", "", "1", "2", "3", "4", "5");
                        System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "6", "7", "8", "9", "10", "11", "12");
                        System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "13", "14", "15", "16", "17", "18", "19");
                        System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "20", "21", "22", "23", "24", "25", "26");
                        System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "27", "28", "29", "30", "31", "", "");
                        return "Friday";

                    case 4:
                        System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "", "", "", "1", "2", "3", "4");
                        System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "5", "6", "7", "8", "9", "10", "11");
                        System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "12", "13", "14", "15", "16", "17", "18");
                        System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "19", "20", "21", "22", "23", "24", "25");
                        System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "26", "27", "28", "29", "30", "31", "");
                        return "Saturday";

                    case 5:
                        System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "", "", "", "", "1", "2", "3");
                        System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "4", "5", "6", "7", "8", "9", "10");
                        System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "11", "12", "13", "14", "15", "16", "17");
                        System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "18", "19", "20", "21", "22", "23", "24");
                        System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "25", "26", "27", "28", "29", "30", "31");
                        return "Sunday";

                    case 6:
                        System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "", "", "", "", "", "1", "2");
                        System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "3", "4", "5", "6", "7", "8", "9");
                        System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "10", "11", "12", "13", "14", "15", "16");
                        System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "17", "18", "19", "20", "21", "22", "23");
                        System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "24", "25", "26", "27", "28", "29", "30");
                        System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "31", "", "", "", "", "", "");
                        return "Monday";

                    case 7:
                        System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "", "", "", "", "", "", "1");
                        System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "2", "3", "4", "5", "6", "7", "8");
                        System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "9", "10", "11", "12", "13", "14", "15");
                        System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "16", "17", "18", "19", "20", "21", "22");
                        System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "23", "24", "25", "26", "27", "28", "29");
                        System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "30", "31", "", "", "", "", "");
                        return "Tuesday";

                }
            } else {
                switch (dayNum) {
                    default:
                        System.out.println("Invalid month");
                        break;
                    case 1:
                        System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "1", "2", "3", "4", "5", "6", "7");
                        System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "8", "9", "10", "11", "12", "13", "14");
                        System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "15", "16", "17", "18", "19", "20", "21");
                        System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "22", "23", "24", "25", "26", "27", "28");
                        System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "29", "30", "", "", "", "", "");
                        return "Tuesday";

                    case 2:
                        System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "", "1", "2", "3", "4", "5", "6");
                        System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "7", "8", "9", "10", "11", "12", "13");
                        System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "14", "15", "16", "17", "18", "19", "20");
                        System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "21", "22", "23", "24", "25", "26", "27");
                        System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "28", "29", "30", "", "", "", "");
                        return "Wednesday";

                    case 3:
                        System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "", "", "1", "2", "3", "4", "5");
                        System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "6", "7", "8", "9", "10", "11", "12");
                        System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "13", "14", "15", "16", "17", "18", "19");
                        System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "20", "21", "22", "23", "24", "25", "26");
                        System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "27", "28", "29", "30", "", "", "");
                        return "Thursday";

                    case 4:
                        System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "", "", "", "1", "2", "3", "4");
                        System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "5", "6", "7", "8", "9", "10", "11");
                        System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "12", "13", "14", "15", "16", "17", "18");
                        System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "19", "20", "21", "22", "23", "24", "25");
                        System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "26", "27", "28", "29", "30", "", "");
                        return "Friday";

                    case 5:
                        System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "", "", "", "", "1", "2", "3");
                        System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "4", "5", "6", "7", "8", "9", "10");
                        System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "11", "12", "13", "14", "15", "16", "17");
                        System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "18", "19", "20", "21", "22", "23", "24");
                        System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "25", "26", "27", "28", "29", "30", "");
                        return "Saturday";

                    case 6:
                        System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "", "", "", "", "", "1", "2");
                        System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "3", "4", "5", "6", "7", "8", "9");
                        System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "10", "11", "12", "13", "14", "15", "16");
                        System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "17", "18", "19", "20", "21", "22", "23");
                        System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "24", "25", "26", "27", "28", "29", "30");
                        return "Sunday";

                    case 7:
                        System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "", "", "", "", "", "", "1");
                        System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "2", "3", "4", "5", "6", "7", "8");
                        System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "9", "10", "11", "12", "13", "14", "15");
                        System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "16", "17", "18", "19", "20", "21", "22");
                        System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "23", "24", "25", "26", "27", "28", "29");
                        System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "30", "", "", "", "", "", "");
                        return "Monday";

                }
            }

        }

        return "An error has occurred.";
    }
    public static boolean has31Days(int month){
        if(month == 1 ||  month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){
            return true;
        }
        else {
            return false;
        }
    }

    public static int dayNumber(String day){
        day.toLowerCase();
        if(day.equalsIgnoreCase("monday")){
            return 2;
        }else if(day.equalsIgnoreCase("tuesday")){
            return 3;
        }else if(day.equalsIgnoreCase("wednesday")){
            return 4;
        }else if(day.equalsIgnoreCase("thursday")){
            return 5;
        }else if(day.equalsIgnoreCase("friday")){
            return 6;
        }else if(day.equalsIgnoreCase("saturday")){
            return 7;
        }else if(day.equalsIgnoreCase("sunday")){
            return 1;
        }
        return 0;
    }
}
