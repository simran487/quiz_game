import java.util.Scanner;

public class Quiz {
    private Question[] questions;
    private int score;

    public Quiz(Question[] questions) {
        this.questions = questions;
        this.score = 0;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);

        for (Question question : questions) {
            System.out.println(question.getQuestionText());
            String[] options = question.getOptions();
            for (int i = 0; i < options.length; i++) {
                System.out.println((i + 1) + ". " + options[i]);
            }

            System.out.print("Enter your answer (1-" + options.length + "): ");
            int userAnswer = scanner.nextInt() - 1;

            if (userAnswer == question.getCorrectAnswerIndex()) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong! The correct answer was: " +
                        options[question.getCorrectAnswerIndex()]);
            }
        }

        System.out.println("Quiz finished! Your score: " + score + "/" + questions.length);
        scanner.close();
    }
}
