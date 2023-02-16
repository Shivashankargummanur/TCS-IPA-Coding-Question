import java.util.Scanner;
public class Question_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Integer Number : ");
        int number = sc.nextInt();
        int reminder,sum=0;
        while(number>0)
        {
            reminder = number % 10;
            sum = sum + reminder;
            number = number / 10;
        }
        // System.out.println(sum);
        if(sum%3==0)
        {
            System.out.println("TRUE");
        }
        else {
            System.out.println("FALSE");
        }
    }
    
}
