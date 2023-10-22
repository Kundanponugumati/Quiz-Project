public class QuizService {
     int Qid;
     String Qtitle;
     String Options1;
     String Options2;
     String Options3;
     String Options4;
     String Answer;

    public QuizService(int qid, String qtitle, String options1, String options2, String options3, String options4, String answer) {
        Qid = qid;
        Qtitle = qtitle;
        Options1 = options1;
        Options2 = options2;
        Options3 = options3;
        Options4 = options4;
        Answer = answer;
    }

    public QuizService() {
    }
    // to print Questions on Console
    public void out()
    {
        QuestionsData qd = new QuestionsData();
        qd.input();
        qd.quiz1();
    }

    @Override
    public String toString()
    {
        System.out.println(Qid);
        System.out.println(Qtitle);
        System.out.println(Options1);
        System.out.println(Options2);
        System.out.println(Options3);
        System.out.println(Options4);
        QuestionsData qd = new QuestionsData();
        qd.checkanswer(Qid);
        return "*************************";
    }
}
