import java.util.HashSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.*;
public class hash {

    //HashSet*****************************************************************************
    // public static void main(String args[]){
    //     //creation
    //     HashSet<Integer> set = new HashSet<>(); 
    //     //adding
    //     set.add(1);
    //     set.add(2);
    //     set.add(3);
    //     set.add(1);
    //     //omly unique values will get stored in hashset
    //     //to check the size of set
    //     System.out.println("The size of set is: "+ set.size());

    //     //to print all elements of set
    //     System.out.println(set);

    //     //Search - contains or not
    //     if(set.contains(1)){
    //         System.out.println("1 is present");
    //     }
    //     if(!set.contains(6)){
    //         System.out.println("6 not present");
    //     }

    //     //deltion or remove
    //     set.remove(1);
    //     if(!set.contains(1)){  //to check whether 1 is deleted or not
    //         System.out.println("1 got deleted");
    //     }


    //     //Iterator -- set doesnot have its index as we have in array where we use i ,j for indexing so here we cannot use them so we use iterator. 
    //     Iterator it = set.iterator();
    //     while(it.hasNext()){
    //         System.out.println(it.next());
    //     }
    // }


    //HashMap************************************************************************
    public static void main(String args[]){
        //for eg--- country(key)  population(value)  key is always unique. 
        //creation of hashmap
        HashMap<String, Integer> hm = new HashMap<>();

        //Insertion
        hm.put("India", 125);
        hm.put("China", 150);
        hm.put("USA", 25);
        System.out.println(hm);


        //Search (contains or not to check)
        if(hm.containsKey("China")){
            System.out.println("It is present"); 
            //to get a particular key value
            System.out.println(hm.get("China"));
        }  
        if(!hm.containsKey("Pakistan")){
            System.out.println("Not Present");
            System.out.println(hm.get("Pakistan"));   //null print hoga kyuki it doesnot exists. 
        }

        int arr[] = {12,4,56};
        // 1st way purana wala to print array
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        //2nd way in hashmap isme index ki jarurat nahi hai jaise 1st vale mai i ki hai direct value nikalte hai
        for(int val: arr){
            System.out.print(val+" ");
        }

        //syntax of for loop for hasmap (through entryset)          prefer this
        for(Map.Entry<String,Integer> e: hm.entrySet()){ 
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
        //through keyset
        Set<String> e = hm.keySet();
        for(String key : e){
            System.out.println(key +" "+ hm.get(key));
        }

        //to remove key
        hm.remove("China");
        System.out.println(hm);
        //size dekhne ke liye 
        System.out.println(hm.size());
    }
            
        

}
