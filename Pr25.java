import java.util.Scanner;

// Class with synchronized method
class TablePrinter {

    // Synchronized method
    synchronized void printTable(int num) {
        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Table of " + num + ": " + num + " x " + i + " = " + (num * i));
                Thread.sleep(300); // delay for visibility
            }
            System.out.println();
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
    }
}

// Thread class
class MyThread extends Thread {
    TablePrinter tp;
    int num;

    MyThread(TablePrinter tp, int num) {
        this.tp = tp;
        this.num = num;
    }

    public void run() {
        tp.printTable(num);
    }
}

// Main class
public class Pr25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // User input
        System.out.print("Enter first number: ");
        int n1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int n2 = sc.nextInt();

        TablePrinter tp = new TablePrinter();

        // Create threads
        MyThread t1 = new MyThread(tp, n1);
        MyThread t2 = new MyThread(tp, n2);

        // Start threads
        t1.start();
        t2.start();

        sc.close();
    }
}
/* output 
  Enter first number: 5
Enter second number: 7

Table of 5: 5 x 1 = 5
Table of 5: 5 x 2 = 10
...
Table of 5: 5 x 10 = 50

Table of 7: 7 x 1 = 7
Table of 7: 7 x 2 = 14
...
Table of 7: 7 x 10 = 70 */
