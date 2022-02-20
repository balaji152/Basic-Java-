import java.util.Scanner;

public class ResultDeclaration {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int mark1,mark2,mark3;
        mark1 = sc.nextInt();
        mark2 = sc.nextInt();
        mark3 = sc.nextInt();
        if(mark1>60 && mark2>60 && mark3>60)
            System.out.println("Passed");
        else if((mark1>60 && mark2> 60)||(mark2>60 && mark3>60)||(mark1>60 && mark3 >60))
            System.out.println("Promoted");
        else
            System.out.println("Failed");







    }
}