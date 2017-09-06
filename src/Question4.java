public class Question4 {
    public static void main(String[] args){

        outerFor:
        for(int i = 1; i <= 100; i++){
            for(int j = 0; j <= 300; j++){
                if((i + j) % 5 == 2) {
                    System.out.println("The number is " + (i + j) + ". Breaking out of the inner loop.");
                    break;
                }else if((i + j) % 10 == 0){
                    System.out.println("The number is " + (i + j) + ". Breaking out of outer loop.");
                    break outerFor;
                }
            }
        }
    }
}
