package A06OOPs.EncapAbstract;

public class TestATM {
    public static void main(String[] args) {
        ATM atm = new ATM("Om", 200000);
        atm.showBalance();

        // here i am changing my balance by my own but once we make this fields private we cannot change the values
//        atm.balance = 500000;
//        atm.showBalance();
    }
}

// Abstraction means hiding internal details and showing only the necessary information to the user.
// The user (in TestATM) just calls: atm.showBalance();
// The user doesn’t know how the balance is stored, validated, or fetched — only sees the result.
// Here i have achieved partially abstraction but using abstract class and interface we can achieve fully abstraction