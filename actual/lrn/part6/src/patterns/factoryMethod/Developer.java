package patterns.factoryMethod;

public class Developer implements Interviewer {
    @Override
    public void askQuestion() {
        System.out.println("Спросить о шаблонах проектирования");
    }
}
