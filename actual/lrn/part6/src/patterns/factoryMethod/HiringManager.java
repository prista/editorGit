package patterns.factoryMethod;

public abstract class HiringManager {

    Interviewer interviewer;

    // Factory method
    abstract public Interviewer makeInterviewer ();

    public void takeInterview() {
        this.interviewer = makeInterviewer();
        this.interviewer.askQuestion();
    }
}
