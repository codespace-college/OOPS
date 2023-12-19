import java.util.Scanner;
class p11{
  public static void main(String [] args){
    int sum=0;
    
    //input the number of elements 
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the number of elements in the array: ");
    int n=sc.nextInt();
    
    //array declaration
    int arr[] = new int[n];

    //User input of array elements
    System.out.println("Enter elements in the array: ");
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }

    //array elements display 
    System.out.println("array elements are: ");
    for(int k=0;k<n;k++){
      System.out.println(""+arr[k]);
    }
    
    //array sum
    for(int j=0;j<arr.length;j++){
      sum=sum+arr[j];
    }
    
    //print sum of array 
    System.out.println("Sum of the elements is: "+sum);
  }
}