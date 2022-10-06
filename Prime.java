/**
 * Class: Prime
 * author: Kingsley Nguyen
 * course: ITEC 2140 Fall 2022
 * written : oct 5, 2022
 * description: check the prime number
 */

import java.util.Scanner;
public class Prime {

        public static void main(String [] args){
            Scanner input = new Scanner(System.in);
            System.out.println("enter a number: ");
            int num = input.nextInt();
            for (int i = 2; i < num ; i++){
                if(num % i ==0){
                    System.out.println(num + "is not a prime number");
                }
                else {
                    System.out.println(num + "is a prime number");
                }
            }
        }
    }


