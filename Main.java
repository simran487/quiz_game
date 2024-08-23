public class Main {
    public static void main(String[] args) {
        Question[] questions = new Question[]{
                new Question("What is the capital of France?",
                        new String[]{"Berlin", "Madrid", "Paris", "Rome"}, 2),
                new Question("Which language is used for Android development?",
                        new String[]{"Python", "Java", "C#", "Swift"}, 1),
                // Add more questions here
        };

        Quiz quiz = new Quiz(questions);
        quiz.start();
    }
}
