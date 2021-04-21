import java.util.Scanner;

public class Zadanie2 {
    public static void main(String[] args) {
        System.out.println("User please enter integer to define table length.");

        Scanner tableLength = new Scanner(System.in);
        int length = tableLength.nextInt();
        System.out.println("Table length is equal to: " + length);

        int[] numbers = new int[length];

        //Filling table with values given by the user
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("User please enter integer to fill the table.");

            Scanner tableValues = new Scanner(System.in);
            int tableValue = tableValues.nextInt();
            numbers[i] = tableValue;
        }

        //Average value calculation
        double sumOfTableValues = 0;
        for (int i = 0; i < numbers.length; i++) {
            sumOfTableValues = sumOfTableValues + numbers[i];
        }

        double averageOfTableValues = sumOfTableValues / numbers.length;
        System.out.println("Average of the numbers entered by user is: " + averageOfTableValues);

        //Maximum value in the table calculation
        int maxTableValue = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > maxTableValue) {
                maxTableValue = numbers[i];
            }
        }
        System.out.println("Max value inserted by user is: " + maxTableValue);
    }
}
