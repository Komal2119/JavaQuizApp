package quiz.java;

//import java.net.MulticastSocket;
import java.util.Scanner;

public class QuestionService  {
Question [] questions=new Question[5];
String selection[]=new String[5];
private Object userAnswer;

public QuestionService() {
	        questions[0]=new Question(1,"Which of the following statements about ArrayList in Java is correct?"," It is synchronized"," It allows duplicate elements","It stores data in key-value pairs","It has a fixed size","It allows duplicate elements" );
			questions[1]=new Question(2,"Which of the following is not a Java primitive data type?","int","float","String","char","String");
			questions[2]=new Question(3,"Which concept allows a subclass to provide a specific implementation of a method already defined in its superclass?","Method overloading","Method overriding","Abstraction","Encapsulation","Method overriding");
			questions[3]=new Question(4,"Which of these is a checked exception in Java?","ArithmeticException","IOException","NullPointerException","ArrayIndexOutOfBoundsException","IOException");
			questions[4]=new Question(5,"Which keyword is used to inherit a class in Java?","this","super","extends","implements","extends");
}
public void playQuiz() {
	int i=0;
	Scanner sc=new Scanner(System.in);
    for (Question q : questions) {
        System.out.println(q.getId() + ". " + q.getQuestion());
        System.out.println("a) " + q.getOpt1());
        System.out.println("b) " + q.getOpt2());
        System.out.println("c) " + q.getOpt3());
        System.out.println("d) " + q.getOpt4() );
        selection[i]=sc.nextLine().trim();
        i++;
    }
        System.out.println("your answer");
        for(String s:selection) {
        	System.out.println(s);
        }
        
        
    }
public void printScore() {
	int score=0;
	for(int i=0;i<questions.length;i++) {
		//Question que=questions[i];
		String actualAnswer=questions[i].getAnswer();
		String userAnswerString=selection[i];
		 String actualAnswerText = "";
         switch (userAnswerString) {
             case "a":
            	 actualAnswerText = questions[i].getOpt1();
                 break;
             case "b":
            	 actualAnswerText = questions[i].getOpt2();
                 break;
             case "c":
            	 actualAnswerText = questions[i].getOpt3();
                 break;
             case "d":
            	 actualAnswerText = questions[i].getOpt4();
                 break;
         }

         if (actualAnswer != null && actualAnswer.equalsIgnoreCase(actualAnswerText.trim())) {
             score++;
         }
     }
		System.out.println("your score is:"+score);
		
		}
	
	public static void main(String[] args) {
	QuestionService service = new QuestionService();
	service.playQuiz();
	service.printScore();
	
}
}







