import java.util.*;

public class Pr32 {

    // Generic method
    public static <T> boolean searchElement(LinkedList<T> list, T element) {
        return list.contains(element);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ----- Integer LinkedList (Roll Numbers) -----
        LinkedList<Integer> rollList = new LinkedList<>();

        System.out.print("Enter number of roll numbers: ");
        int n = sc.nextInt();

        System.out.println("Enter roll numbers:");
        for (int i = 0; i < n; i++) {
            rollList.add(sc.nextInt());
        }

        System.out.print("Enter roll number to search: ");
        int rollSearch = sc.nextInt();

        boolean foundRoll = searchElement(rollList, rollSearch);
        System.out.println("Roll number found: " + foundRoll);

        // ----- String LinkedList (Names) -----
        sc.nextLine(); // consume newline
        LinkedList<String> nameList = new LinkedList<>();

        System.out.print("\nEnter number of names: ");
        int m = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter names:");
        for (int i = 0; i < m; i++) {
            nameList.add(sc.nextLine());
        }

        System.out.print("Enter name to search: ");
        String nameSearch = sc.nextLine();

        boolean foundName = searchElement(nameList, nameSearch);
        System.out.println("Name found: " + foundName);

        sc.close();
    }
}
/* output 
  Enter number of roll numbers: 3
Enter roll numbers:
101 102 103
Enter roll number to search: 102
Roll number found: true

Enter number of names: 3
Enter names:
Rahul
Priya
Amit
Enter name to search: Priya
Name found: true */
