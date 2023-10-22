import java.util.Scanner;

public class QuestionsData {
    // marks
    int marks=0;
    // to give the Questions to Quiz Service Class
    QuizService [] questionsArray = new QuizService[5];
    // Entering the Data
    public void input()
    {
    questionsArray[0] = new QuizService(1,"How Many Bytes are Required to Store int DataType?","1","2","4","8","4");
    questionsArray[1] = new QuizService(1,"How Many Bytes are Required to Store char DataType?","1","2","4","8","1");
    questionsArray[2] = new QuizService(1,"How Many Bytes are Required to Store float DataType?","1","2","4","8","4");
    questionsArray[3] = new QuizService(1,"How Many Bytes are Required to Store double DataType?","1","2","4","8","8");
    questionsArray[4] = new QuizService(1,"How Many Bytes are Required to Store long DataType?","1","2","4","8","8");
    }
    public void quiz1()
    {
        for(int i=0;i<questionsArray.length;i++)
        {
            System.out.println(questionsArray[i]);
        }
        System.out.println(marks);
    }
    public void checkanswer(int Qid)
    {
        Scanner sc = new Scanner(System.in);
       String answer = sc.nextLine();
       if(answer.equals(questionsArray[Qid-1].Answer))
        {
            marks=marks+2;
        }
       else
       {
           marks = marks-1;
       }

    }
}
