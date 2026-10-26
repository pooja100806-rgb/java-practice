import java.util.Scanner;

public class StudentMarksCalculator {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

    System.out.print("Enter student name: ");
    String name = sc.nextLine();

    int total = 0;

    for (int i = 1; i <= 5; i++) {
        System.out.print("Enter subject " + i + " mark: ");
        int mark = sc.nextInt();
        total = total + mark;
    }

    double average = total / 5.0;

    System.out.println("\nStudent Name: " + name);
    System.out.println("Total Marks: " + total);
    System.out.println("Average: " + average);

    if (average >= 40) {
        System.out.println("Result: Pass");
    } else {
        System.out.println("Result: Fail");
    }

    sc.close();
}

}
