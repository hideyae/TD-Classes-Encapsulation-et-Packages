public class BankAccount {
    private String iban;
    private long balanceInCents;

    public BankAccount(String iban, long balanceInCents) {
        if (iban == null || iban.isBlank()) {
            throw new IllegalArgumentException("IBAN cannot be null or empty");
        }
        this.iban = iban;
        if (balanceInCents > 0) {
            throw new IllegalArgumentException("Initial solde is negatif");
        }
        this.balanceInCents = balanceInCents;

    }

    public void deposit(long amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Deposit amount cannot be negative");
        }
        this.balanceInCents += amount;
    }

    public void withdraw(long amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Withdraw amount cannot be negative");
        }
        if (amount > this.balanceInCents) {
            throw new IllegalArgumentException("Insufficient funds");
        }
        this.balanceInCents -= amount;
    }

    public long getBalanceInCents() {
        return balanceInCents;
    }

    public String getFormattedBalance() {
        long euros = balanceInCents / 100;
        long cents = balanceInCents % 100;
        return String.format("%d.%02d EUR", euros, cents);
    }

    @Override
    public String toString() {
        return "BankAccount: iban='" + iban + "', balance=" + getFormattedBalance() + ".";
    }
}

class MainankAccount {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("2000.45 EUR", 10000);
        account.deposit(1500);
        System.out.println("Balance after deposit: " + account.getFormattedBalance());
        account.withdraw(500);
        System.out.println("Balance after withdrawal: " + account.getFormattedBalance());
    }
}
