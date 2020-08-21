
// 19BCE0758
// R NARAYAN
import java.util.Scanner;

class Account {
    double balance;

    Account(double balance) {
        if (balance > 0) {
            this.balance = balance;
        } else {
            System.out.println("Invalid");
        }
    }

    void credit(double money) {
        this.balance += money;
        System.out.println("Success! New balance is " + this.balance);
    }

    void debit(double money) {
        if (money <= this.balance) {
            this.balance -= money;
            System.out.println("Success! New balance is " + this.balance);
        } else {
            System.out.println("Insufficient Funds");
        }
    }
}

class SavingsAccount extends Account {
    double intrestRate;

    SavingsAccount(double balance, double intrestRate) {
        super(balance);
        this.intrestRate = intrestRate;
    }

    public double calculateIntrest() {
        System.out.println("Success intrest rate is " + this.intrestRate);
        return this.intrestRate * this.balance;
    }
}

class checkingAccount extends Account {
    double transactionFee;

    checkingAccount(double bal, double tf) {
        super(bal);
        this.transactionFee = tf;
    }

    void credit(double money) {
        this.balance += money;
        this.balance -= this.transactionFee;
        System.out.println("Success! New balance is " + this.balance);
    }

    void debit(double money) {
        if (money <= this.balance + this.transactionFee) {
            this.balance -= money;
            this.balance -= this.transactionFee;

            System.out.println("Success! New balance is " + this.balance);
        } else {
            System.out.println("Insufficient Funds");
        }
    }

}

public class Inheritance2 {
    public static void main(String args[]) {
        SavingsAccount savings = new SavingsAccount(200, 5);
        savings.credit(savings.calculateIntrest());
        savings.debit(25);
        checkingAccount check = new checkingAccount(200, 5);
        check.credit(100);
        check.debit(25);
    }
}