//package tasks;
//
//public class BankAccount {
//    private int accountNumber;
//    private int balance;
//
//    public BankAccount(int accountNumber,int balance){
//        this.accountNumber=accountNumber;
//        this.balance=balance;
//    }
//
//    public int getAccountNumber() {
//        return accountNumber;
//    }
//
//    public void setAccountNumber(int accountNumber) {
//        this.accountNumber = accountNumber;
//    }
//
//    public int getBalance() {
//        return balance;
//    }
//
//    public void setBalance(int balance) {
//        this.balance = balance;
//    }
//
//
//    public void Deposit(int deposit){
//        balance+=deposit;
//    }
//    public String Withdraw(double withdraw){
//        if(balance<withdraw){
//            return "Insufficient Funds";
//        }
//        else {
//            balance-=withdraw;
//            return "Successfully withdrawn ";
//        }
//    }
//}
