public class BankAccount {
    private int id;
    private double balance;
    private String password;
    
    public BankAccount (double balance, int id, String password) {
	this.id = id;
	this.balance = balance;
	this.password = password;
    }
    
    public void setPassword (String password) {
	this.password = password;
    }
    
    public boolean withdraw (double amount) {
	if (amount > balance) return false;
	balance -= amount;
	return true;
    }
    
    public boolean  deposit (double amount) {
	if (amount>0){
	this.balance += amount;
	return true;}
	return false;
    }
    
    public String getPassword () {
	return this.password;
    }
    
    public double getBalance () {
	return this.balance;
    }
    
    public int getId () {
	return this.id;
    }
    
    public String toString () {
	String value = "Bank ID: " + this.id + "\nBalance: " + this.balance;
	return value;
    }
    
}
