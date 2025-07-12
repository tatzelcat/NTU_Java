import java.util.ArrayList;

public class LoopAssignment{
  public static void main(String[] args){

    //Create ArrayList to store odd numbers
    ArrayList<Integer> oddNumbersList = new ArrayList<>();

    //While loop to print out all odd numbers from 1 to 50
    int i = 1;
    while (i <= 50){
        if (i % 2 == 1){
        System.out.print(i + " ");
        oddNumbersList.add(i);
        }
        i++;
    }

    System.out.println();

    
    //Computing average value in oddNumbersList array
    int sum =0;
    for (int num:oddNumbersList) {
        sum+= num;
    }

    double average = (double) sum / oddNumbersList.size();
    System.out.println("Sum: " + sum);
    System.out.println("Count: " + oddNumbersList.size());
    System.out.println("Average: " + average);


    System.out.println();
    System.out.println();



    //Do-while loop for fizz buzz pop pattern
    int p = 1;
    do {
        System.out.print(p + " - ");
                    if (p % 3 == 0 && p % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (p % 3 == 0) {
                System.out.println("Fizz");
            } else if (p % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println("Pop");
            }
            p++;
        } while (p <= 20);
    
  }

}