public class Question4 {
    public static void main(String[] args){

        int x = 2098234;
        for(int i=0;i<35;i++){

            System.out.printf("%d\t\t%32s\n",i,Integer.toBinaryString(x>>>i));

        }

        System.out.println();

        int y = 2098234;
        for(int i=0;i<35;i++){

            System.out.printf("%d\t\t%32s\n",i,Integer.toBinaryString(y));
            y = y >>> i;

        }
    }
}
