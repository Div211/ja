import java.util.*;
public class sorting {

    //bubble sort

    // public static void main (String args[]){
    //     int arr[] = {7,8,5,3,1,2};
    //     bubble(arr);
    //     System.out.println(Arrays.toString(arr));

    // }
    // public static void bubble(int arr[]){
    //     boolean swapped;
    //     for(int i=0; i<arr.length; i++){
    //         swapped =false;
    //         for(int j=1; j<arr.length-i; j++){
    //             if(arr[j] < arr[j-1]){
    //                     int temp = arr[j];
    //                     arr[j] = arr[j-1];
    //                     arr[j-1] = temp;
    //                     swapped =true;
    //             }
    //         }
    //         if(swapped == false){
    //             break;
    //         }
    //     }
    // }

    //selection sort
    // public static void main(String args[]){
    //     int arr[] = {7,8,3,1,2};
    //     selection(arr);
    //     System.out.println(Arrays.toString(arr));
    // }
    // public static void selection(int arr[]){
    // for(int i =0; i<arr.length; i++){
    //     System.out.print(arr[i]);
    // }
    //     for(int i=0; i<arr.length-1; i++){
    //         int smallest = i;
    //         for(int j=i+1; j<arr.length; j++){
    //             if(arr[smallest]>arr[j]){
    //                 smallest = j;
    //             }
    //         }
    //         int temp = arr[smallest];
    //         arr[smallest] = arr[i];
    //         arr[i] = temp;
    //     }
    // }


    //insertion sort
//   public static void main(String aargs[]){
//     int arr[] = {7,8,5,3,1,2};
//     insertion(arr);
//     System.out.println(Arrays.toString(arr));
//   }
//   public static void insertion(int arr[]){
//         for(int i=1; i<arr.length; i++){
//             int j=i;
//             while(j>0 && arr[j]<arr[j-1]){
//                 int temp = arr[j];
//                 arr[j] = arr[j-1];
//                 arr[j-1] = temp;
//                 j--;
//             }
//         }
//   }


//selection ka upgraded version jisme unnecessary run nhi kr rahre hai;

public static void main (String args[]){
    int arr[] = {7,8,5,3,1,2};
    selection(arr);
    // System.out.println(Arrays.toString(arr));
}
public static void selection(int arr[]){
    boolean sort =true;
    for(int i=0; i<arr.length-1; i++){
        int smallest = i;
        for(int j=i+1; j<arr.length; j++){
            if(arr[smallest]>arr[j]){
                smallest = j;
            }
        }
        int temp = arr[smallest];
        arr[smallest] = arr[i];
        arr[i] = temp;

        //to print each swapping iteratioin
        System.out.println();
        for(int l =0; l<arr.length; l++){
            System.out.print(arr[l]+" ");
        }
          //check if the array is already sorted  in one loop
        for(int m=i;m<arr.length-1;m++){
            if(arr[m]<arr[m+1]){
                sort = true;
            }else{
                sort =false;
                break;
            }
        }
        if(sort==true){
            break;
        }
    }

            
//         check if the array is already sorted in two loops
//         for(int m=i; m<arr.length-1; m++){
//             for(int k=m+1; k<arr.length; k++){
//                 if(arr[m]<arr[k]){
//                     sort = true;
//                 }else{
//                     sort = false;
//                     break;
//                 }
//             }
//             if(sort == false){
//                 break;
//             }        
//         }
//         if ( sort == true) {
//             break;
//         }
//     }

 }
//Sorting with the help of collection class.
// public static void main(String args[]){
//     Integer arr[] = {4,3,2,5,6,1};
//     ArrayList<Integer> al = new ArrayList<>();
//     sorting(arr,al);
// }
// public static void sorting(Integer arr[], ArrayList<Integer>al){
//     Collections.addAll(al,arr);
//         Collections.sort(al);
//         System.out.println(al);
// }








}
   

   
