public class BankAccount {
    private double amount;

    public BankAccount(double amount) {
        this.amount = amount;
    }

    public BankAccount() {
    }

    public double getAmount() {
        return amount;
    }

    public void deposit(double sum) {
        amount += sum;
        System.out.println("Успешное пополнение счета на " + sum);
    }

    public void withDraw(double sum) throws LimitException {
        if (amount - sum < 0) {
            throw new LimitException("Сумма списание " + sum + " превышает остаток ", amount);
        }
        System.out.println("Сумма списания " + sum);
        amount -= sum;
    }
}
