import java.util.Scanner;

// Thread 1: prints 1 to 10 (1 second interval)
class ThreadOne extends Thread {
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Thread 1: " + i);
                Thread.sleep(1000); // 1 second
            }
        } catch (InterruptedException e) {
            System.out.println("Thread 1 interrupted");
        }
    }
}

// Thread 2: prints 11 to 20 (500 ms interval)
class ThreadTwo extends Thread {
    public void run() {
        try {
            for (int i = 11; i <= 20; i++) {
                System.out.println("Thread 2: " + i);
                Thread.sleep(500); // 0.5 second
            }
        } catch (InterruptedException e) {
            System.out.println("Thread 2 interrupted");
        }
    }
}

// Main class
public class Pr23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Press any number to start threads: ");
        sc.nextInt(); // just to simulate user input

        // Create threads
        ThreadOne t1 = new ThreadOne();
        ThreadTwo t2 = new ThreadTwo();

        // Start threads
        t1.start();
        t2.start();

        sc.close();
    }
}
/* output 
  Press any number to start threads: 1
Thread 1: 1
Thread 2: 11
Thread 2: 12
Thread 1: 2
Thread 2: 13
Thread 2: 14
Thread 1: 3
...
Thread 2: 20
Thread 1: 10 */
