import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digita el númeor máximo");
        int max = sc.nextInt();
        ConsoleBasedFizzBuzz.print(1,max);
    }
}
