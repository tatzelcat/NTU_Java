package ntu;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Logger;

public class App {
  
  private final static Logger logger = Logger.getLogger(App.class.getName());

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a number: ");
    
    try {
      int number = scanner.nextInt();
      System.out.println(number);
    } catch (InputMismatchException exception) {
      System.out.println(exception);
    } finally {
      logger.warning("Be careful!");
    }
  }
}
