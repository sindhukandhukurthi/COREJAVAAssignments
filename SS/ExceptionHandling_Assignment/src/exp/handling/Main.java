package exp.handling;

import java.util.Scanner;

class InsufficientBalanceException extends Exception {
   
	
	public InsufficientBalanceException(String message) {
        super(message);
    }
}

class IllegalBankTransactionException extends Exception {
    
	

	public IllegalBankTransactionException(String message) {
        super(message);
    }
}

class SavingAccount {
    private long id;
    private double balance;

    public SavingAccount(long id, double balance) {
        this.setId(id);
        this.balance = balance;
    }

    public double withdraw(double amount) throws InsufficientBalanceException, IllegalBankTransactionException {
        if (amount < 0) {
            throw new IllegalBankTransactionException("Illegal withdrawal amount: " + amount);
        }

        if (amount > balance || balance == 0) {
            throw new InsufficientBalanceException("Insufficient balance for withdrawal: " + balance);
        }

        balance -= amount;
        return amount;
    }

    public double deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
        return balance;
    }

    public double getBalance() {
        return balance;
    }

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
}

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Enter your account ID: ");
			long accountId = scanner.nextLong();
			System.out.print("Enter your initial balance: ");
			double initialBalance = scanner.nextDouble();

			SavingAccount savingAccount = new SavingAccount(accountId, initialBalance);

			try {
			    System.out.print("Enter the withdrawal amount: ");
			    double withdrawalAmount = scanner.nextDouble();

			    double withdrawnAmount = savingAccount.withdraw(withdrawalAmount);
			    System.out.println("Withdrawn: " + withdrawnAmount);
			    System.out.println("Remaining balance: " + savingAccount.getBalance());
			} catch (InsufficientBalanceException e) {
			    System.out.println("Error: " + e.getMessage());
			} catch (IllegalBankTransactionException e) {
			    System.out.println("Error: " + e.getMessage());
			}
		}
    }
   
}
