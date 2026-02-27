import java.util.Scanner;
import java.util.Vector;

public class VectorOperations {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Vector<String> students = new Vector<>();

        while (true) {

            int choice = sc.nextInt();

            switch (choice) {

                case 1: // Add
                    String nameToAdd = sc.next();
                    students.add(nameToAdd);
                    System.out.println("Added");
                    break;

                case 2: // Insert
                    String nameToInsert = sc.next();
                    int index = sc.nextInt();

                    if (index >= 1 && index <= students.size() + 1) {
                        students.add(index - 1, nameToInsert);
                        System.out.println("Inserted");
                    }
                    break;

                case 3: // Remove
                    String nameToRemove = sc.next();
                    if (students.remove(nameToRemove)) {
                        System.out.println("Removed");
                    }
                    break;

                case 4: // Display
                    System.out.println(students);
                    break;

                case 5: // Exit
                    sc.close();
                    return;
            }
        }
    }
}