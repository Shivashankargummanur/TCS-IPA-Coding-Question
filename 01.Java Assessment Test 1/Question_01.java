import java.util.Scanner;

public class Question_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        int limit_from, limit_to, sum = 0, count = 0;
        for(int i=0;i<arr.length;i++)
        {
            System.out.print("Enter The Number :");
            int input = sc.nextInt();
            arr[i] = input;
        }
        System.out.print("Enter The Limit From: ");
        limit_from = sc.nextInt();
        System.out.print("Enter The Limit To: ");
        limit_to = sc.nextInt();
        for(int i=0;i<arr.length;i++)
        {
            if (arr[i] > limit_from && arr[i] < limit_to) {
                sum = sum + arr[i];
                count++;
            }
        }
        int average = sum / count;
        System.out.println(average);
        
    }
    
}
