// OddEvenSum.java
// Sum the odd numbers and the even numbers from lower to upper

public class OddEvenSum{
    public static void main(String[] args) {
        int lowerbound = 1, upperbound = 1000;
        int sumOdd = 0;
        int sumEven = 0;
        int number = lowerbound;

        while(number <= upperbound){
            if (number % 2 == 0){
                sumEven += number;
            } else{
                sumOdd += number;
            }
            ++number;
        }

        System.out.println(sumOdd);
        System.out.println(sumEven);
        System.out.println("Difference between the two numbers is" + (sumOdd - sumEven));
    }
}