import java.util.ArrayList;
import java.util.List;

public class KBC {
    public static void main(String[] args)  throws InterruptedException{
        List questions = new ArrayList();

        questions.add(new Question("What is the capital of India?",new String[] {"Paris","New Delhi","Los Angles","Colombia"},1));
        questions.add(new Question("Who is the present captian of team india?", new String[]{"Dhoni", "Bumrah", "Virat", "Rohit"}, 3));
        questions.add(new Question("Who is the President of india?",new String[] {"Droupadi Murmu","Ramnath Kovind","Narendra Modi","ABJ Abdul Kalam"},0));
        questions.add(new Question("Who is the Prime minister of india?",new String[] {"Droupadi Murmu","Ramnath Kovind","Narendra Modi","ABJ Abdul Kalam"},2));
        questions.add(new Question("Who is the Chief Minister of AP?",new String[] {"Chiranjeevi","Chandrababu Naidu","Jagan Mohan reddy","Pawan kalyan"},1));
        questions.add(new Question("Who is the Deputy CM of Ap?", new String[] {"Nara Lokesh","Roja","Pawan kalyan","Jagan Mohan reddy"},2));
        questions.add(new Question("What is the capital of France?", new String[]{"London", "Berlin", "New Delhi", "Paris"}, 3));
        questions.add(new Question("What is the solution of this 2+2*2-2?",new String[] {"4","9","3","6"},0));
        questions.add(new Question("What is the chemical symbol for gold?",new String[] {"Ag","Au","Al","Ar"},1));
        questions.add(new Question("When was IPL is introduced?",new String[] {"2005","2003","2008","2010"},2));

        Quiz quiz = new Quiz(questions);
        quiz.start();
    }
}