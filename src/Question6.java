import java.util.Scanner;

public class Question6 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string to tokenize: ");
        String test = input.nextLine();

        input = new Scanner(test).useDelimiter(""); // To tokenize every character use a empty string as a delimiter

        System.out.println();

        while(input.hasNext()){
            System.out.println(input.next());
        }
    }
}

