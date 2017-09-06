import java.util.Scanner;

public class Question1 {
    public static void main(String[] args){
        int numPyramid;
        String layer = new String("");

        Scanner input = new Scanner(System.in);
        System.out.print("How many layers do you want: ");
        numPyramid = input.nextInt();

        for(int i = 1; i <= numPyramid; i++){
            for(int k = 1; k<= i; k++){
                 layer = layer + k;
            }
            for (int j = i-1; j >= 1; j--){
                layer = layer + j;
            }
            //System.out.println(layer.length());
            System.out.printf("%"+ ((numPyramid - i) + layer.length()) + "s\n",layer);
            layer = "";
        }

    }
}
