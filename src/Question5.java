import java.util.Scanner;

public class Question5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("put in some numbers separated by commas: ");

        String test = input.nextLine();

        input = new Scanner(test).useDelimiter(",");

        while(input.hasNext()){
            System.out.println(input.next());
        }

    }
}
