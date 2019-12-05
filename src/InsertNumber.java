import java.util.Scanner;

public class InsertNumber {
    void Number(){
        Scanner scan=new Scanner(System.in);
        System.out.print("Input: "); //insert an integer number
        int a=scan.nextInt();
        ReversedInt reversedInt = new ReversedInt();
        reversedInt.isPalindrome(a);
    }
}
