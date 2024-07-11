import java.util.Scanner;

public class functions {
    // public static int CalculateSum(int a, int b){
    //     int sum = a+b;
    //     return sum;
    // }
    // public static void main(String []args){
    //     Scanner sc = new Scanner(System.in);
    //     int a = sc.nextInt();
    //     int b = sc.nextInt();
        
    //     int sum = CalculateSum(a,b);
    //     System.out.println("Sum of 2 no is: "+sum);
// ****************************************************************************************************************
        // public static int CalculateMul(int a, int b){
        //     int mul = a*b;
        //     return mul;
        // }
        // public static void main(String [] args){
        //     Scanner sc = new Scanner(System.in);
        //     int a = sc.nextInt();
        //     int b = sc.nextInt();

        //     int mul = CalculateMul(a,b);
        //     System.out.println("Multiplication of 2 num is: "+ mul);
        // }

// ****************************************************************************************************************

            // public static int CalculateFactorial(int n){
            //     int factorial = 1;

            //     if(n<0){
            //         System.out.println("Invalid Number");
            //         return n;
            //     }
            //     for(int i=n; i>=1; i--){
            //         factorial = factorial * i;

            //     }
            //     System.out.println(factorial);
            //     return factorial;
            // }
            // public static void main (String [] args){
            //     Scanner sc = new Scanner(System.in);
            //     int n = sc.nextInt();
            //     CalculateFactorial(n);
            // }
// ****************************************************************************************************************

            // public static int CalculateAverage(int a, int b, int c){
            //     int sum = (a+b+c)/3;
            //     return sum;
            // }
            // public static void main (String [] args){
            //     Scanner sc = new Scanner(System.in);
            //     int a = sc.nextInt();
            //     int b = sc.nextInt();
            //     int c = sc.nextInt();

            //     int sum = CalculateAverage(a,b,c);
            //     System.out.println("the average is:" +sum);
                
            // }
// *****************************************************************************************************************

// public static void main (String [] args){
//     int positive = 0, negative = 0, zeroes = 0;
//     System.out.println("Press 1 to continue and 0 to get out");
//     Scanner sc = new Scanner (System.in);
//     int input = sc.nextInt();

//     while(input == 1){
//         System.out.println("Enter ur number");
//         int num = sc.nextInt();
//         if(num>0){
//             positive++;
//         }else if (num<0){
//             negative++;
//         }else{
//         zeroes++;
//     }
//     System.out.println("Press 1 to continue and 0 to get out");
//     input = sc.nextInt();
//     }
//     System.out.println("Poritive: "+positive);
//     System.out.println("Negative: "+negative);
//     System.out.println("Zeroes: "+zeroes);
// }
// ****************************************************************************************************************


    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
 
 
        while(n1 != n2) { 
            if(n1>n2) {
                n1 = n1 - n2;
            } else {
                n2 = n2 - n1;
            }
        }
        System.out.println("GCD is : "+ n2);
    } 
 
}




    //Functions are called directly  whereas methods are called by class ke objects se.


