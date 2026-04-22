import java.util.Scanner;

// Thread T1: 1 to 100
class T1 extends Thread {
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\nT1 finished\n");
    }
}

// Thread T2: 101 to 200
class T2 extends Thread {
    public void run() {
        for (int i = 101; i <= 200; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\nT2 finished\n");
    }
}

// Thread T3: 201 to 300
class T3 extends Thread {
    public void run() {
        for (int i = 201; i <= 300; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\nT3 finished\n");
    }
}

// Main class
public class Pr24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any number to start threads: ");
        sc.nextInt(); // user input trigger

        T1 t1 = new T1();
        T2 t2 = new T2();
        T3 t3 = new T3();

        try {
            // Start and wait for each thread
            t1.start();
            t1.join(); // wait for T1 to finish

            t2.start();
            t2.join(); // wait for T2 to finish

            t3.start();
            t3.join(); // wait for T3 to finish

        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }

        System.out.println("All threads executed sequentially.");

        sc.close();
    }
}
/* output 
  Enter any number to start threads: 1
1 2 3 ... 100
T1 finished

101 102 ... 200
T2 finished

201 202 ... 300
T3 finished

All threads executed sequentially. */
