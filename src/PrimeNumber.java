import java.util.Scanner;

public class PrimeNumber {

  public static void main(String[] args) {
    System.out.println("Enter the number til which you want the prime numbers to be printed");
    Scanner scan = new Scanner(System.in);
    int limit = scan.nextInt();

    System.out.println("Printing prime numbers from 1 to " + limit);
    for (int number = 2; number <= limit ; number++) {
      if (isPrime(number)) {
        System.out.println(number);
      }

    }

  }

  public static boolean isPrime(int number) {
    for (int  i = 2;  i < number ;  i++) {
      if (number % i == 0) {
        return false;
      }
    }
      return true;
    }

}
