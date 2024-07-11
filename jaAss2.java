import java.util.Scanner;

public class jaAss2 {
    public static void main (String[]args){
        System.out.println("Enter the marks of all 5 subjects");
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter the marks of Maths:");
        float a = sc.nextFloat();

        System.out.println("Enter the marks of Science:");
        float b = sc.nextFloat();

        System.out.println("Enter the marks of English:");
        float c = sc.nextFloat();

        System.out.println("Enter the marks of Hindi:");
        float d = sc.nextFloat();

        System.out.println("Enter the marks of Social Studies:");
        float e = sc.nextFloat();

        float sum = ((a+b+c+d+e/500.0f)*100);
        System.out.println("The Percentage is");
        System.out.println(sum);
        


    }
}
