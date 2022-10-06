/**
 * class: grade
 * author: Kingsley Nguyen
 * course: ITEC2140 fall 2022
 * written: oct 5 2022
 * description: calculate average grade
 */

import java.util.Scanner;
public class Grade {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);


        System.out.println(" Enter your students grade and stop providing by enter a character");
        double grades = input.nextDouble();
        int count = 0;

        while(grades.hasNextDouble()){
            double sum = grades + grades;
            count++;
             double avg = sum/count;
             System.out.println("Average student grade is: " + avg);
        }
    }
}
