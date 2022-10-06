/**
 * class: MinMax
 * author: Kingsley Nguyen
 * course: ITEC2140 Fall 2022
 * written oct 5 2022
 * description: check the highest and lowest grade
 */

import java.util.Scanner;
public class MInMax {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your student grade: ");
        int max = input.nextInt();
        int min = max;
        do{
            int value = input.nextInt();
            if (value > max) {
                max = value;
            }
            if (value < min){
                min = value;
            }
        }while(input.hasNextInt());
        System.out.println("highest student grade: " + max);
        System.out.println("lowest student grades: " + min);

    }
}
