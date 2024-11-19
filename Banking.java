import java.util.Random;

public class Banking {
    public static void quickSort(Account[] accounts, int low, int high) {
        if (low < high) {
            int pi = partition(accounts, low, high);
            quickSort(accounts, low, pi - 1);
            quickSort(accounts, pi + 1, high);
        }
    }

    public static int partition(Account[] accounts, int low, int high) {
        int pivot = accounts[high].balance;
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (accounts[j].balance > pivot) {
                i++;
                Account temp = accounts[i];
                accounts[i] = accounts[j];
                accounts[j] = temp;
            }
        }
        Account temp = accounts[i + 1];
        accounts[i + 1] = accounts[high];
        accounts[high] = temp;
        return i + 1;
    }

    public static void main(String[] args) {
        Account[] accounts = new Account[5];
        Random rand = new Random();
        for (int i = 0; i < accounts.length; i++) {
            int accountNo = rand.nextInt(130, 99999);
            int balance = rand.nextInt(0, 100001);
            accounts[i] = new Account(accountNo, balance);
        }
        quickSort(accounts, 0, accounts.length - 1);
        for (Account account : accounts) {
            System.out.println("Account No: " + account.accountNo + " Balance: " + account.balance);
        }
    }
}
