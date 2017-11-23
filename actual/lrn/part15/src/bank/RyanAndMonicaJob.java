package bank;

public class RyanAndMonicaJob implements Runnable{

    private BankAccount account = new BankAccount();

    public static void main(String[] args) {
        RyanAndMonicaJob theJob = new RyanAndMonicaJob();
        Thread one = new Thread(theJob);
        Thread two = new Thread(theJob);
        one.setName("Ryan");
        two.setName("Monica");
        one.start();
        two.start();
    }

    @Override
    public void run() {
        for (int x = 0; x < 10; x++) {
            doStuff();
            makeWithdraw(10);
            if (account.getBalance() < 0) {
                System.out.println("Exceeding the limit");
            }
        }
    }

    public void doStuff() {
        System.out.println(Thread.currentThread().getName() + " SOME SOME SOME");
    }

    private synchronized void makeWithdraw(int amount) {
        if (account.getBalance() >= amount) {
            System.out.println(Thread.currentThread().getName() + " is going to withdraw money.");
            try {
                System.out.println(Thread.currentThread().getName() + " is going to sleep");
                Thread.sleep(5000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " is waking up");
            account.withdraw(amount);
            System.out.println(Thread.currentThread().getName() + " completes the transaction");

        } else {
            System.out.println("Sorry, Insufficient funds for " + Thread.currentThread().getName() + " balance " + account.getBalance());
        }
    }
}
