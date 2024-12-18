import java.util.Arrays;

public class Primes {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]) + 1;
        boolean[] arr = new boolean[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i > 1;
        }
        for (int i = 3; i < arr.length; i++) {
            arr[i] = i % 2 != 0;
        }
        int counter = 2;
        while (counter < Math.sqrt(arr.length)) {
            for (int i = counter + 1; i < arr.length; i++) {
                if (arr[i]) {
                    arr[i] = i % counter != 0;
                }
            }
            counter++;
            while (!arr[counter])
                counter++;
        }
        double primeCount = 0;
        System.out.println("Prime numbers up to " + args[0] + ":");
        for (int i = 2; i < arr.length; i++) {
            if (arr[i]) {
                System.out.println(i);
                primeCount++;
            }
        }
        int percentage = (int) Math.floor((primeCount / (n - 1)) * 100);
        System.out
                .println("There are " + (int) primeCount + " primes between 2 and " + args[0] + " (" + percentage
                        + "% are primes)");
    }
}