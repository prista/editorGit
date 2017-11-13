package patterns.factoryMethod;

public class CommunityExecutive implements Interviewer{
    @Override
    public void askQuestion() {
        System.out.println("Спросить об общественном строительстве");
    }
}
