import java.util.Scanner;

public class EndQuizMsg {
    public static void finalMsg()
    {
        System.out.println("Thank You For Visiting the Application");
        System.out.println("Please Give Your Feedback On This Application");
        Scanner sc = new Scanner(System.in);
       String feedback =  sc.nextLine();
    }
}
