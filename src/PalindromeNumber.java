import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[]args){
     Scanner scan=new Scanner(System.in);
     System.out.print("Input: "); //insert an integer number
     int a=scan.nextInt();
     ReversedInt reversedInt=new ReversedInt();
     reversedInt.isPalindrome(a);
    }
}
