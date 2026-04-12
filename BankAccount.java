public class BankAccount{
    private int accountNumber;
    private double balance;

    public void setAccountNumber(int accountNumber){
        this.accountNumber=accountNumber;
    }
    public void setBalance(double balance){
        this.balance=balance;
    }
    public int getAccountNumber(){
        return accountNumber;
    }

    public double getBalance(){
        return balance;
    }

    public static void main(String[] args){

        BankAccount acc = new BankAccount();
        acc.setAccountNumber(656968);
        acc.setBalance(745.46);
        
        System.out.println("account number :"+ acc.getAccountNumber());
        System.out.println("balance :" + acc.getBalance());    }
}