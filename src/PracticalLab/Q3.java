package PracticalLab;
import java.util.Arrays;
import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        String s1 = "varshith";
        String s2 = "varshith";            
        String s3 = new String("varshith");  

        System.out.println((s1 == s2)+" for ==");             
        System.out.println((s1 == s3)+" for ==");              
        System.out.println(s1.equals(s3)+" for .equals");     

        String s4 = "Varshith";
        String s5 = s1.concat(" Reddy");
        
        System.out.println("Original String: " + s4);
        System.out.println("Modified String: " + s5);         

        int n = sc.nextInt();
        sc.nextLine(); 

        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
        }

        System.out.println("\nOriginal array:");
        for (String ele : arr) {
            System.out.print(ele + " ");
        }

        Arrays.sort(arr);
        System.out.println("\nSorted array:");
        for (String ele : arr) {
            System.out.print(ele + " ");
        }

        System.out.println("\nReversed array:");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }

        StringBuilder sb = new StringBuilder();
        for (String ele : arr) {
            sb.append(ele).append(" ");
        }
        System.out.println("\nConcatenated String: " + sb.toString().trim());
	}

}
