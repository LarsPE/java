// lowerUpper.java
// Summarize number from 1 to 100
// Using while loop

public class lowerUpper{
    public static void main(String[] args) {
        int lowNumber = 1;
        int upperNumber = 100;
        int sum = 0;

        int number = lowNumber;
        while(number <= upperNumber){
            sum = sum + number;
            ++number;
        }

        System.out.println(sum);
    }
}