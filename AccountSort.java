public class AccountSort {
    public static void QuickSort(QuickSort[] accounts, int low, int high) {
        if (low < high) {
            int pi = partition(accounts, low, high);
            QuickSort(accounts, low, pi - 1);
            QuickSort(accounts, pi + 1, high);
        }
    }

    public static int partition(QuickSort[] accounts, int low, int high) {
        int pivot = accounts[high].balance;
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (accounts[j].balance > pivot) {
                i++;
                QuickSort temp = accounts[i];
                accounts[i] = accounts[j];
                accounts[j] = temp;
            }
        }
        QuickSort temp = accounts[i + 1];
        accounts[i + 1] = accounts[high];
        accounts[high] = temp;
        return i + 1;
    }

    public static void main(String[] args) {
        QuickSort[] accounts = {
                new QuickSort(3547, 28000),
                new QuickSort(130, 120),
                new QuickSort(145, 500),
                new QuickSort(1122, 15000)
        };
        QuickSort(accounts, 0, accounts.length - 1);
        for (QuickSort account : accounts) {
            System.out.println("Account No: " + account.accountno + " Balance: " + account.balance);
        }
    }
}

class QuickSort {
    int accountno;
    int balance;

    QuickSort(int accountno, int balance) {
        this.accountno = accountno;
        this.balance = balance;
    }
}
