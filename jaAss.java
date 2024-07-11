// import java.util.Scanner;

// public class jaAss {
//     public static void main(String[] args) {
//         System.out.println("Enter the marks systematically:");
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter the subject1:");
//         int a = sc.nextInt();
//         System.out.println("Enter the subject2:");
//         int b = sc.nextInt();
//         System.out.println("Enter the subject3:");
//         int c = sc.nextInt();
//         System.out.println("Enter the subject4:");
//         int d = sc.nextInt();
//         System.out.println("Enter the subject5:");
//         int e = sc.nextInt();

//         float percentage = ((a + b + c + d + e) / 500.0f) * 100;
//         System.out.println("The percentage of the student is: " + percentage);

//     }
// }

//********************************Question 1******************************************

// import java.util.Scanner;

// public class jaAss {
//     public static void main(String[] args) {
//         System.out.println("Enter the proper sgpa in all semester: ");
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the marks of subject 1: ");
//         float a = sc.nextFloat();
//         System.out.println("Enter the marks in subject 2: ");
//         float b = sc.nextFloat();
//         System.out.println("Enter the marks in subject 3: ");
//         float c = sc.nextFloat();

//         double cgpa = (a + b + c) * 9.5;
//         System.out.println("The final cgpa is : " + cgpa);
//     }
// }

//*******************************Question 2********************************************

// import java.util.*;

// public class jaAss {
//     public static void main(String[] args) {

//         System.out.println("Enter your name: ");
//         Scanner sc = new Scanner(System.in);
//         String str = sc.next();
//         System.out.println("Hello " + str + " have a good day ");
//     }
// }

import java.util.*;

public class jaAss {
    public static void main(String[] args) {
        System.out.println("Enter the number only");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the Second number: ");
        int b = sc.nextInt();
        System.out.println("Enter the third number: ");
        int c = sc.nextInt();

        int sum = a + b + c;
        System.out.println("The total Sum is: ");
        System.out.println(sum);

        int z = 9;
        z += 3;
        System.out.println(z);
    }

}