/**
 * class: Fibonacci
 * author: Kingsley Nguyen
 * Course: Itec2140 fall 2022
 * written : oct 5 2022
 * description: generate the first 30 number of finabonacci
 */
public class Fibonacci {
    public static void main(String [] args){
        int num1 =0;
        int num2 = 1;
        int sum =0;
        for(int i = 0; i < 30; i++){
            sum = num1 + num2;
            num1 = num2;
            num2 = sum;
            System.out.print(num1);
            System.out.print(",");
        }
        System.out.println();
    }
}
