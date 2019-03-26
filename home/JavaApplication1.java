package javaapplication1;

import java.util.Scanner;

public class JavaApplication1 {
///////////////////////////////////////////////////////////////////////
    public static void main(String[] args) {

        int[] randomNumber = addNumber(20);
        
        for (int a : randomNumber) {
            System.out.print(a + " ");
        }

    }///////////////////////////////////////////////////////////////////////////////
    public static int [] addNumber(int number_of_elements) {
       Scanner sc = new Scanner(System.in);
        int[] numbers = new int [number_of_elements];
        
        for (int i = 0; i < numbers.length; i++) {
            int userInput = sc.nextInt();
            numbers[i] = userInput;
        }
        return numbers;
    }
}
