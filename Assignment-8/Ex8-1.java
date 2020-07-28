/*Q1. In this challenge, simulate a banking system. Create the Account and Transaction classes.

1. The Account class has a data member int balance, initially assigned to zero. The class should implement the following three methods:

String deposit(int money) to add money to the balance. This method should return a string that describes the deposit transaction, i.e., "Depositing $money".
String withdraw(int money) to subtract money from the balance. This method should return a string that describes the withdraw transaction, i.e., "Withdrawing $money". Note that, if there is insufficient balance to successfully withdraw the desired amount, then the balance should not be adjusted, and the returned string should be "Withdrawing $money (Insufficient Balance)".
int getBalance() to return the account balance.
2. The Transaction class has two data members Account account and List transactions. The class should implement the following three methods:

void deposit(int money) to invoke the deposit method in the Account class. This should add the transaction message to the transactions list.
void withdraw(int money) to invoke the withdraw method in the Account class. This should add the transaction message to the transactions list.
List getTransaction() to return the transactions.*/


import java.util.*;
class Account {
    int balance=0;

    public String deposit(int money)
	{
        balance= balance+money;
        return "Depositing"+money;
    }

    public String withdraw(int money)
	{
        if(balance<money)
		{
            return "Withdraw"+money+" (Insufficient Balance)";
        } else
		{
        balance=balance-money;
            return "Withdraw"+money;
        }
    }
     public int getBalance()
	 {
        return balance;
    }
}

class Transaction
 {
    Account acc = new Account();
    List<String> transactions = new ArrayList<>();

    public Transaction(Account account)
	{
        this.acc = acc;
    }
public void deposit(int money)
{
        transactions.add(acc.deposit(money));
    }

    public void withdraw(int money)
	{
        transactions.add(acc.withdraw(money));
    }

    public List<String> getTransaction()
	{
        return transactions;
    }
}
class TransactionRunnable implements Runnable 
{
    private static final SecureRandom RANDOM_GENERATOR = new SecureRandom();
    private final Transaction transaction;
    private final int transactionsCount;
    
    public TransactionRunnable(Transaction transaction, int transactionsCount) 
	{
        this.transaction = transaction;
        this.transactionsCount = transactionsCount;
    }
    public void run() 
	{
        for (int i = 0; i < this.transactionsCount; i++)
		{
            int transactionType = RANDOM_GENERATOR.nextInt() % 2;
            int money = RANDOM_GENERATOR.nextInt(100) + 1;

            if (transactionType == 0) 
			{
                this.transaction.deposit(money);
             }
			 else 
			 {
                this.transaction.withdraw(money);
            }
        }
    }
}

public class Ex8-1
{
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final Account ACCOUNT = new Account();
    private static final Transaction TRANSACTION = new Transaction(ACCOUNT);
    
    public static void main(String[] args) throws InterruptedException {
        int threadsCount = Integer.parseInt(SCANNER.nextLine());
        Thread[] threads = new Thread[threadsCount];
         int expectedTransactionsCount = 0;
        for (int i = 0; i < threadsCount; i++) {
            int transactionsCount = Integer.parseInt(SCANNER.nextLine());
            expectedTransactionsCount += transactionsCount;
            
            threads[i] = new Thread(new TransactionRunnable(TRANSACTION, transactionsCount));
        }
        
        for (int i = 0; i < threadsCount; i++) {
            threads[i].start();
        }
        
        for (int i = 0; i < threadsCount; i++) {
            threads[i].join();
        }
        
        List<String> transactions = TRANSACTION.getTransaction();
          if (transactions.size() != expectedTransactionsCount) {
            System.out.println("Wrong Answer");
        } else {
            boolean correct = true;
            for (String transaction: transactions) {
                if (transaction == null) {
                    correct = false;
                    
                    break;
                }
            }
            
            if (!correct) {
                System.out.println("Wrong Answer");
            } else {
                int balance = ACCOUNT.getBalance();
             if (balance < 0) {
                    System.out.println("Wrong Answer");
                } else {
                    for (String transaction: transactions) {
                        System.out.println(transaction);
                    }

                    System.out.println("Balance " + balance);
                }
            }
        }
    }
}
