import java.util.ArrayList;

public class DotComBust {
    GameHelper helper = new GameHelper();
    ArrayList<DotCom> dotComList = new ArrayList<>();
    int numOfGuesses = 0;

    private void setUpGame() {
        DotCom first = new DotCom();
        DotCom second = new DotCom();
        DotCom third = new DotCom();

        first.setName("Pets");

        second.setName("eToys");
        third.setName("Go2");


        dotComList.add(first);
        dotComList.add(second);
        dotComList.add(third);

        System.out.println("Вы должны потопить 3 корабля за меньшее количество ходов!");
        System.out.println("Pets, eToys, Go2");
        System.out.println("Доска 7х7");
        for (DotCom current : dotComList) {
            ArrayList<String> locForCurrent = helper.placeDotCom(3);
            current.setLocationCells(locForCurrent);
        }
    }

    private void startPlaying() {
        while (!dotComList.isEmpty()) {
            String userGuess = helper.getUserInput("Сделайте ход: ");
            checkUserGuesses(userGuess);
        }
        finishGame();
    }

    public String checkUserGuesses(String userGuess) {
        numOfGuesses++;
        String result = "Мимо";
        for (DotCom dotComToTest: dotComList) {
            result = dotComToTest.checkYourself(userGuess);
            if ("Попал".equals(result)) {
                break;
            } else if ("Потопил".equals(result)) {
                dotComList.remove(dotComToTest);
                break;
            }
        }
        System.out.println(result);

        return result;
    }

    private void finishGame() {
        System.out.println("Все корабли ушли ко дну!");
        if (numOfGuesses <= 18) {
            System.out.println("Это заняло у вас всего " + numOfGuesses + " попыток");
        } else {
            System.out.println("Это заняло у вас много времени. " + numOfGuesses + " попыток");
        }
    }

    public static void main(String[] args) {
        DotComBust game = new DotComBust();
        game.setUpGame();
        game.startPlaying();
    }
}
