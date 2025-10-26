package OOPs.EncapAbstract;

public class ATM {

    private String accountHolderName;
    private int balance;

    ATM(String name, int bal) {
        this.accountHolderName = name;
        this.balance = bal;
    }

    void showBalance() {
        System.out.println("Your current bal is " + balance);
    }

    public static void main(String[] args) {
        ATM atm = new ATM("Om", 200000);
        atm.showBalance();
    }
}


// here we achieved the encapsulation by binding the data in single unit
// like inside class we are writing fields and methods which means wrapping data
// This is encapsulation → you have wrapped both data + behavior together and controlled access to the data.

