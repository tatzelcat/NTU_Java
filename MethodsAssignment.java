import java.utils.Arrays;

public class MethodsAssignment {
    
    //Method to check if number is even or odd
    public static void checkOddEven(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " is even");
        } else {
            System.out.println(number + " is odd");
        }
    }

    //Methodto convert two srings to uppercase and join with space
    public static String joinCaps(String str1, String str2) {
        return str1.toUpperCase() + " " + str2.toUpperCase();
    }

    //Method to caculate the average value of an array 
    public static double getAverage(int[] numbers) {
        if (numbers.length == 0){
            return 0.0;
        }

        int sum = 0;
        for (int num:numbers){
            sum += num;
        }

        return (double) sum/numbers.length;
    }

    public static void main(String[] args) {
        System.out.println("Checking if number is odd or even:");
        checkOddEven(5);
        checkOddEven(8);
        checkOddEven(15);

        System.out.println();

        System.out.println("Combining two sentences:");
        String combinedstr = joinCaps("hello", "world");
        System.out.println(combinedstr);

        System.out.println();

        System.out.println("Calculating average value of Array");
        int[] testscores = {85, 72, 90, 68, 82, 77, 73, 69};
        double average1 = getAverage(testscores);
        
        System.out.println("Test Scores: ");
        for (int score : testscores) {
            System.out.print(score + " ");
        }
        
        System.out.println("Average score: " + average1);
    }
}