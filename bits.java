import java.util.*;
public class bits {
    //bit mask means to manipulate all the numbers mtlb kisi position pe kuch or le ana numbers change karna. 
    public static void main(String[]args){
    int n =5;
    int pos = 2;
    //get bits
    // int bitmask = 1<<pos;
    // if((bitmask & n)==0){
    //     System.out.println("Bit is zero");                   steps 1- 1<<i  2- perform and operator '&''
    // }
    // else{
    //     System.out.println("Bit is one");
    // }

    //set bits
    // int bitmask = 1<<pos;
    // int num = bitmask | n;                                   steps 1 - i<<1  2- perform or operator '|'
    // System.out.println(num);

    //clear bit 
    // int bitmask = 1<<pos;
    // int notbitmask = ~(bitmask);
    // int num = notbitmask & n;                                  steps 1 - 1<<i  2- perform not operator '~'  3 - perform AND operator'&'
    // System.out.println(num);

    //Update bit  (mixture of set and clear bit  where set for 1 and clear for 0)
    Scanner sc = new Scanner(System.in);
    int oper = sc.nextInt();
     // if we need to update to 1 use set bit method  and if 0 use clear bit method. 

     int bitmask = 1<<pos;
     if(oper==1){
        //set bit method
    int num = bitmask | n;
    System.out.println(num);
    }
    else{
        //clear bit method
            int num = ~(bitmask);
            int notbit = num & n;
            System.out.println(notbit);
    }
       
                                                               
}
}
