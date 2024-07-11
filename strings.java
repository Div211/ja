import java.util.*;
public class strings {
    //String cannot be changed, modified, update, delete once created .
    public static void main(String[]args){
        // String firstname = "Tony";
        // String lastname = "Stark";
        // String fullname = firstname + " " + lastname;
        // System.out.println(fullname.length());

        // //charAt to give the indexing of the character
        // for(int i=0; i<fullname.length(); i++){
        //     System.out.println(fullname.charAt(i));
        // }
 

        //comparing
        // String name1 = "Tony";
        // String name2 = "Tony";

        // //or  if(name1=name2){}  same as below  but isko use nhi karna kyuki kuch cases mai error deta hai
        // if(name1.compareTo(name2)==0){
        //     System.out.println("Equal");
        // }else{
        //     System.out.println("Not equal");
        // }


//StringBuilder
    //     StringBuilder sb = new StringBuilder("Tony");
    //     System.out.println(sb);
    //     //charAt
    //     System.out.println(sb.charAt(0));
    //     //setCharAt  to change character from any other character
    //    sb.setCharAt(0,'I');
    //    System.out.println(sb);

    //    //insert statement to insert new ch at any index
    //    sb.insert(0,'S');
    //    System.out.println(sb);

    //    //delete to remove any char
    //    sb.delete(0, 2);
    //    System.out.println(sb);

//     StringBuilder sb = new StringBuilder("h");
//     sb.append("e");
//     sb.append("l");
//     sb.append("l");
//     sb.append("o");
// System.out.println(sb.length());
// System.out.println(sb);
    

//to reverse the string eg hello  to  olleh.  
// StringBuilder sb = new StringBuilder("Divyanshu");
// for(int i =0; i<sb.length()/2;i++){
//     int front = i;
//     int back = sb.length()-1-i;
//     char frontChar = sb.charAt(front);
//     char backChar = sb.charAt(back);
//     sb.setCharAt(front, backChar);
//     sb.setCharAt(back, frontChar);
// }
// System.out.println(sb);




}
}
