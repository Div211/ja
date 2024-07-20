import java.util.*;

public class a2zdsa {

    // sorting + finding second largest element
    // public static void main(String args[]){
    // int arr[] = {1,7,7,7,7,7};
    // selection(arr);
    // // System.out.println(Arrays.toString(arr));
    // }

    // public static void selection(int arr[]){
    // for(int i=0; i<arr.length-1;i++){
    // int smallest = i;
    // for(int j = i+1; j<arr.length; j++){
    // if(arr[smallest]>arr[j]){
    // smallest = j;
    // }
    // }
    // int temp = arr[smallest];
    // arr[smallest] = arr[i];
    // arr[i] = temp;
    // }
    // for(int i=arr.length-1;i>0;i--){
    // if(arr[i]==arr[i-1]){
    // continue;
    // }
    // else{
    // System.out.println(arr[i-1]);
    // break;
    // }
    // }
    // }

    // without sorting finding largest element

    // public static void main(String args[]){
    // int arr[] = {1,5,4,7,7,2};
    // test(arr);
    // }
    // public static void test(int arr[]){
    // int max=arr[0];
    // for(int i=1; i<arr.length; i++){
    // if(max<arr[i]){
    // max=arr[i];
    // }
    // }
    // System.out.println(max);
    // }

    // without sorting finding second largest element
    // public static void main(String args[]){
    // int arr[] = {1,5,4,7,7,2,10,8};
    // test(arr);
    // }
    // public static void test(int arr[]){
    // int max=arr[0];
    // int smax = -1;
    // for(int i=1; i<arr.length; i++){
    // if(max<arr[i]){
    // smax=max;
    // max=arr[i];
    // }else if (smax<arr[i] && arr[i]<max) {
    // smax = arr[i];

    // }
    // }
    // System.out.println(smax);
    // }

    // second largest and second min and print them seperately in arr with size 2.
    // public static void main (String args[]){
    // int arr[] = {7,1,3,5,6,4};
    // test(arr);
    // }
    // public static void test(int arr[]){
    // int max = arr[0];
    // int min = arr[0];
    // int smax =-1;
    // int smin =999;
    // for(int i=1;i<arr.length;i++){
    // if(max<arr[i]){
    // smax = max;
    // max = arr[i];
    // }else if(smax<arr[i] && arr[i]<max){
    // smax = arr[i];
    // }
    // }
    // for(int i=1;i<arr.length;i++){
    // if(min>arr[i]){
    // smin = min;
    // min = arr[i];
    // }else if(smin>arr[i] && arr[i]>min){
    // smin=arr[i];
    // }
    // }
    // int arrs[] ={smin,smax};
    // System.out.println(Arrays.toString(arrs));
    // }

    // reverse the array

    // public static void main (String args[]){
    // int arr[] = {7,1,3,5,6,4};
    // reverse(arr,2,arr.length-1);
    // }
    // public static void reverse(int arr[],int start,int end){
    // int i=start;
    // int j =end;
    // while(i<j){
    // int temp = arr[i];
    // arr[i] = arr[j];
    // arr[j] = temp;
    // i++;
    // j--;
    // }
    // System.out.println(Arrays.toString(arr));
    // }

    // rotate the array

    // public static void main (String args[]){
    // int arr[] = {7,1,3,5,6,4};
    // rotate(arr,9);
    // System.out.println(Arrays.toString(arr));
    // }
    // public static void reverse(int arr[],int start,int end){
    // int i=start;
    // int j =end;
    // while(i<j){
    // int temp = arr[i];
    // arr[i] = arr[j];
    // arr[j] = temp;
    // i++;
    // j--;
    // }
    // }
    // static void rotate(int ar[], int r){
    // r=r%ar.length;
    // reverse(ar,0,r-1);
    // reverse(ar,r,ar.length-1);
    // reverse(ar,0,ar.length-1);

    // }

    // [9,0,8,0,0,4] print as [9,8,4,0,0,0]

    // public static void main (String args[]){
    // int arr[] = {1,2,0,0,4,3,0,0,1};
    // reverse(arr);
    // System.out.println(Arrays.toString(arr));
    // }

    // public static void reverse(int arr[]){
    // int temp[] = new int[arr.length];
    // int j =0;
    // for(int i=0;i<arr.length;i++){
    // if(arr[i]!=0){
    // temp[j] = arr[i];
    // j++;
    // }
    // }
    // for(int i=0;i<arr.length;i++){
    // arr[i] = temp[i];
    // }
    // }
    // one more way for same.
    // public static void reverse(int arr[]){

    // int j =0;
    // int i=0;
    // int count =0;
    // while(i<arr.length){
    // if(arr[i]!=0){
    // int temp = arr[i];
    // arr[i]=arr[j];
    // arr[j]=temp;
    // i++;
    // j++;
    // }else{
    // if(count==0){
    // j =i;
    // i++;
    // count++;
    // }else{
    // i++;
    // count++;
    // }
    // }
    // }
    // }

    // to check duplicate values

    // public static void main (String args[]){
    // int arr[] = {1,1,2,2,3,3};
    // duplicate(arr);
    // // System.out.println(Arrays.toString(arr));
    // }

    // public static void duplicate(int arr[]){
    // int i =0;
    // for(int j=1; j<arr.length;j++){
    // if(arr[j]!=arr[i]){
    // arr[i+1] = arr[j];
    // i++;
    // j++;
    // }
    // else{
    // j++;
    // }
    // }
    // for(int m=0; m<=i;m++){
    // System.out.print(arr[m]+" ");
    // }
    // }

    // left rotate an array by one place
    // public static void main(String args[]){
    // int arr[] = {1,2,3,4,5};
    // rotate(arr);
    // System.out.println(Arrays.toString(arr));
    // }
    // public static void rotate(int arr[]){
    // int temp = arr[0];
    // for(int i=1;i<arr.length;i++){
    // arr[i-1] = arr[i];

    // }
    // arr[arr.length-1] = temp;
    // }

    // linear search - search the number in array and return its index
    // public static void main(String args[]){
    // int num = 4;
    // int arr[] = {6,7,4,8,1};
    // linear(arr,num);
    // }
    // public static int linear(int arr[], int num){
    // for(int i=0;i<arr.length; i++){
    // if(arr[i]==num){
    // System.out.println(i);
    // return i;
    // }
    // }
    // return -1;
    // }

    // public static void main(String args[]){
    // int arr1[] = {1,1,2,2,3,3,4,5};
    // int arr2[] = {2,2,3,3,4,5,6,7,7,8};
    // ArrayList<Integer> al = new ArrayList<>();
    // union(arr1,arr2,al);

    // }

    // public static void union(int arr1[], int arr2[],ArrayList<Integer> al){
    // int i=0;
    // int j=0;
    // while(i<arr1.length && j<arr2.length){
    // if(arr1[i]<arr2[j]){
    // if(al.size()==0 || al.get(al.size()-1) != arr1[i] ){
    // al.add(arr1[i]);
    // }
    // i++;
    // }else{
    // if(al.size()==0 || al.get(al.size()-1) != arr2[j]){
    // al.add(arr2[j]);
    // }
    // j++;

    // }
    // }
    // if(i>=arr1.length){
    // for(int k=j;k<arr2.length;k++){
    // if(al.get(al.size()-1)!=arr2[k]){
    // al.add(arr2[k]);

    // }
    // }
    // }
    // else{
    // for(int l=i;l<arr1.length;l++){
    // if(al.get(al.size()-1)!=arr2[l]){
    // al.add(arr2[l]);
    // }
    // }
    // }
    // for(int a: al){
    // System.out.print(a+" ");
    // }
    // }
    // public static void main(String args[]) {
    //     int arr1[] = { 2, 3, 3, 5, 6, 6, 7 };
    //     int arr2[] = { 1, 2, 2, 3, 3, 4, 5, 6 };
    //     ArrayList<Integer> al = new ArrayList<>();
    //     intersection(arr1, arr2, al);
    // }
    //   public static void intersection(int arr1[], int arr2[], ArrayList<Integer> al) {
    //     int i = 0;
    //     int j = 0;
 
    //     while(i<arr1.length && j<arr2.length){
    //         if(arr1[i]<arr2[j]){
    //             if(arr1[i]==arr2[j]){
    //                 al.add(arr1[i]);
    //                 i++;
    //                 j++;
    //             }else{
    //                 i++;
    //             }
    //         }else{
    //             if(arr2[j]==arr1[i]){
    //                 al.add(arr2[j]);
    //                 i++;
    //                 j++;
    //             }else{
    //                 j++;
    //             }
    //         }
    //     }
    //     for(int a: al){
    //         System.out.print(a+" ");
    //     }
    // }

//To find the missing element
// public static void main(String args[]){
//     int arr[] = {1,2,4,5};
//     int n=arr.length+1;
//     num(arr,n);
// }
// public static void num(int arr[], int n){
//     int sum = n*(n+1)/2;
//     int f =0;
//     for(int i=0;i<arr.length;i++){
//         f = f+arr[i];
//     }
//     int MissingNumber = sum -f;
//     System.out.println(MissingNumber);

// }


//Maximum Consecutives one
// public static void main(String args[]){
//     int arr[] = {1,1,0,1,1,1,0,1,1};
//     consecutives(arr);
// }

// public static void consecutives(int arr[]){
//     int count = 0;
//     int max = 0;
//     for(int i=0; i<arr.length; i++){
//         if(arr[i]==1){
//             count++;
//             if(max<count){
//             max = count;
//             } 
//         }else{
//             count =0;
//         }
//     }
//     System.out.println(max);
// }
//Find the number that appears once and the others twice.
//  public static void main(String args[]){
//     int arr[]= {1,1,2,3,3,4,4,6,6};
//     find(arr);
//     System.out.println(Arrays.toString(arr));
//     System.out.println(find(arr));
// }
// public static int find(int arr[]){
//     int xor =0;
//     for(int i=0; i<arr.length; i++){
//         xor = xor ^ arr[i];
//     }
//     return xor;
// }


//Find the longest subarray with sum k
// public static void main(String args[]){
//     int arr[] = {1,2,3,1,1,0,1,1,3,3};
//     lon(arr);
// }
// public static void lon(int arr[]){
//     int k =6;
//     int i =0;
//     int j=0;
//     int maxlength =0;
//     int sum = 0;
//     int length = 0;
//     boolean y = true;
//     while(j<arr.length){
//         if(y == true){
//             sum = sum+arr[j];
//         }
//         if(sum<=3){
//             y = true;
//              j++;
//             if(sum == 3){
//                  length = j-i;
//                 if(length>maxlength){                
//                     maxlength = length;
//                 }
//             }
//         }else{
//             y = false;
//             sum = sum-arr[i];
//             i++;
//          }
//     }
//     System.out.println(length);
//     System.out.println(maxlength);
// }


// Two sum check if the pair exists or not
// by using hashing
// public static void main(String args[]){
//     int target = 14;
//     int arr[] = {2,6,5,8,11};
//     String ans = twoSum(arr,target);
//     System.out.println(ans);
// }
// public static String twoSum(int arr[], int target){
//     HashMap<Integer, Integer> hm = new HashMap<>();
//     for(int i=0; i<arr.length; i++){
//         int num = arr[i];
//         int sum = target - num;
//         if(hm.containsKey(sum)){
//             System.out.println(arr[i]+"+"+sum+"="+ target);
//             return "Yes";
//         }
//         hm.put(arr[i], i);
//     }
//     return "No";
// }



    }

