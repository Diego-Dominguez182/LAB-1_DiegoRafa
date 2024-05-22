
public class ConsoleBasedFizzBuzz implements FizzBuzz {
    public static void print(int from, int to) {
        String mensaje;
        for (int i = from; i < to; i++){
            if (i % 3 == 0 && i % 5 == 0){
                mensaje = "Fizbuzz";
            } else if (i % 3 == 0){
                mensaje = "Fizz";
            } else if (i % 5 == 0) {
                mensaje = "Buzz";
            } else {
                mensaje = String.valueOf(i);
            }
            System.out.println(mensaje);
        }
    }
}
