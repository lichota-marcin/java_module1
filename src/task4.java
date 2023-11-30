import java.io.PrintStream;

public class task4 {
    public task4() {
    }

    public static void main(String[] args) {
        User[] users = new User[]{new User(1, "Ron", "Swanson"), new User(2, "Leslie", "Whatever")};
        Account[] accounts = new Account[]{new Account(1, 500, users[0]), new Account(2, 250, users[1])};
        AccountServiceImpl service = new AccountServiceImpl(accounts);
        service.findAccountByOwnerId(1);
        service.countAccountsWithBalanceGreaterThan(150);
    }

    static class User {
        private long id;
        private String firstName;
        private String lastName;

        public User(long id, String firstName, String lastName) {
            this.id = id;
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public long getId() {
            return this.id;
        }

        public String getFirstName() {
            return this.firstName;
        }

        public String getLastName() {
            return this.lastName;
        }
    }

    static class Account {
        private long id;
        private long balance;
        private User owner;

        public Account(long id, long balance, User owner) {
            this.id = id;
            this.balance = balance;
            this.owner = owner;
        }

        public long getId() {
            return this.id;
        }

        public long getBalance() {
            return this.balance;
        }

        public User getOwner() {
            return this.owner;
        }
    }

    static class AccountServiceImpl implements AccountService {
        private Account[] accounts;

        public AccountServiceImpl(Account[] accounts) {
            this.accounts = accounts;
        }

        public Account findAccountByOwnerId(long id) {
            for(int i = 0; i < this.accounts.length; i++) {
                if (this.accounts[i].getId() == id) {
                    System.out.println("This account belongs to " + this.accounts[i].getOwner().getFirstName() + " " +
                            this.accounts[i].getOwner().getLastName());
                    return this.accounts[i];
                }
            }

            return null;
        }

        public long countAccountsWithBalanceGreaterThan(long value) {
            long counter = 0;

            for(int i = 0; i < this.accounts.length; i++) {
                if (this.accounts[i].getBalance() > value) {
                    counter++;
                }
            }

            if (counter == 0) {
                System.out.println("There are no accounts with balance greater then " + value);
            } else if (counter == 1) {
                System.out.println("There is " + counter + " account with balance greater then " + value);
            } else {
                System.out.println("There are " + counter + " accounts with balance greater then " + value);
            }

            return counter;
        }
    }

    interface AccountService {
        Account findAccountByOwnerId(long var1);

        long countAccountsWithBalanceGreaterThan(long var1);
    }
}
