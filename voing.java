import java.lang.*;
import java.util.*;
class VotingSystem
{
    public static void main(String[] args) 
    {
       String names[] = {"Amit","Anil","Praveen","Sushant","Suhani"};
       int arr[] = new int[5];
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter -1 to exit or 0 to 4 for voting : ");
       int n = 1;
       while(n != -1)
       {
         System.out.println("Press 0 to vote Amit -");
         System.out.println("Press 1 to vote Anil -");
         System.out.println("Press 2 to vote Praveen -");
         System.out.println("Press 3 to vote Sushant -");
         System.out.println("Press 4 to vote Suhani -");
         arr[n] = arr[n]+1;
         n = sc.nextInt();
       }
       
       System.out.println("Candidate Name \t Votes Received \t Percentage of votes received");
       int i = 0, sum = 0;
       
       for(int k : arr) {
         sum += k;
       }
       
       while(i < 5) {
	       System.out.println(names[i] + "\t\t\t" + arr[i] + "\t\t\t" + (float)arr[i]/sum*100 + "%");
	       i++;
       }
       i=0;
       int max = 0, index = -1;
       
       while(i<5) {
         if(arr[i] > max) {
           max = arr[i];
           index = i;
         }
           i++;
      }
      System.out.println("Winner is " + names[index] + " with votes " + arr[index]);
    }
}
