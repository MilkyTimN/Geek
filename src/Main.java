public class Main {
    public static void main(String[] args) throws LimitException {


        BankAccount account = new BankAccount();
        account.deposit(15000);

        while (true) {
            try {
                account.withDraw(6000);
                System.out.println("Успешно списано, остаток на счете " + account.getAmount());
            } catch (LimitException e) {
                System.out.println(e.getMessage() + " " + e.getRemainingAmount());
                System.out.println("Был автоматически снят остаток со счета в размере" + account.getAmount());
                account.withDraw(account.getAmount());
                System.out.println("На балансе " + account.getAmount());
                break;
            }
        }
    }
}