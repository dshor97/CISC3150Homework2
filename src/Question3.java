import java.util.Scanner;

public class Question3 {
    public static void main(String[] args){
        String word;
        Scanner input = new Scanner(System.in);
        boolean isPalindrome;


        System.out.print("Check if this word is a palindrome: ");
        word = input.next();
        word = word.toLowerCase();

        isPalindrome = checkPalindrome(word);

        if(isPalindrome){
            System.out.println("The word is a palindrome.");
        }else{
            System.out.println("The word is not a palindrome.");
        }

        System.out.print("Check if this word is a palindrome: ");
        word = input.next();
        word = word.toLowerCase();

        isPalindrome = checkPalindrome(word);

        if(isPalindrome){
            System.out.println("The word is a palindrome.");
        }else{
            System.out.println("The word is not a palindrome.");
        }
        System.out.println();




    }
    public static boolean checkPalindrome(String word){
        char[] wordForward = new char[word.length()];
        char[] wordBackward = new char[word.length()];

        for(int i = 0; i<word.length(); i++){
            wordForward[i] = word.charAt(i);
        }

        int count = 0;//used for word backwards count

        for(int j = word.length() - 1; j >= 0; j--){
            wordBackward[count++] = word.charAt(j);
        }

        return checkSame(wordForward, wordBackward);
    }
    public static boolean checkSame(char[] a,char[] b){

        for(int i = 0; i < a.length; i++){
            if(a[i] != b[i]){
                return false;
            }
        }
        return true;
    }
}
