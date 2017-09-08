import java.util.Scanner;

public class Question5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter some text separated by commas: ");

        String test = input.nextLine();

        System.out.println();

        input = new Scanner(test).useDelimiter(",");

        while(input.hasNext()){
            System.out.println(input.next());
        }

    }
}
