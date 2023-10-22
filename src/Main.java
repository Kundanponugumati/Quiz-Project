import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Hey Welcome to the Quiz App");
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Your Name");
        String name = sc.nextLine();
        System.out.println(name+" are You Student ? {Yes/No}");
        String result = sc.nextLine();
        if(result.equalsIgnoreCase("yes"))
        {
            System.out.println("Do You Want To Play The Quiz");
            String result2 = sc.nextLine();
            if(result2.equalsIgnoreCase("yes"))
            {
               QuizService qs = new QuizService();
               qs.out();

            }
            else
            {
                EndQuizMsg.finalMsg();
            }
        }
        else
        {
            System.out.println("Sorry The Application Was Only Built For Students. But, We Will Back With New Update");
            EndQuizMsg.finalMsg();
        }
    }
}