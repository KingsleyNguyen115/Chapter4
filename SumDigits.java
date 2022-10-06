/**
 * class: SumDigit
 * author: Kingsley Nguyen
 * written : oct 5 2022
 * description: sum the digits from user number
 */

import java.util.Scanner;
public class SumDigits {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your digits ");
        int num = input.nextInt();
        int digit = num;
        int sum = 0;
        while(num != 0){
            sum = sum + digit%10;
            digit = digit/10;
        }
        System.out.println("sum of digits " + num + "is: " + sum);
    }
}
