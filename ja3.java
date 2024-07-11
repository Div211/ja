import java.util.Scanner;

public class ja3 {
    public static void main(String[] args) {

        System.out.println("Taking Input From the User");
        Scanner sc = new Scanner(System.in);

        //*********************************************************
        System.out.println("Enter the number one");
        int a = sc.nextInt();
        System.out.println("Enter the number two");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("The sum of two number is: " + sum);
        // Sum of two numbers

        
        // *********************************************************
        boolean b1 = sc.hasNextInt();
        System.out.println(b1);
        //to check whether the input in integer or not.
        
        
        //**********************************************************
        String str = sc.next(); //to a single word from a sentence
        System.out.println(str);
        String str2 = sc.nextLine();  //to read whole sentence
        System.out.println(str2);
        //to take input as a string.
    }

}
