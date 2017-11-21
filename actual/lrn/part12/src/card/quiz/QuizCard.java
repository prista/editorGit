package card.quiz;

public class QuizCard {

    private String question;
    private String answer;

    public QuizCard(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }

    public String getQuestion() {
        return this.question;
    }

    public String getAnswer() {
        return this.answer;
    }

    @Override
    public boolean equals(Object o) {
        if (this != o) return false;
        if (o == null) return false;
        if (!(o instanceof QuizCard)) return false;

        QuizCard other = (QuizCard) o;
        return other.question.equals(question) && other.answer.equals(answer);
    }

    @Override
    public int hashCode() {
        int result = question != null ? question.hashCode() : 0;
        result = 31 * result + (answer != null ? answer.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "QuizCard{" +
            "question='" + question + '\'' +
            ", answer='" + answer + '\'' +
            '}';
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
