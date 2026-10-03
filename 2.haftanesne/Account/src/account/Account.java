package account;
import java.util.Date;

public class Account {
private int id=0;
private double balance=0; 
private double annualInterestRate=0;
private Date dateCreated;

Account(){
   dateCreated = new Date();
}
Account(int id, double balance) {
    this.id=id;
    this.balance=balance;
    dateCreated = new Date();
}
public int getId(){
    return id;
}
public void setId(int id){
    this.id=id;
}
public double getBalance(){
    return balance;
}
public void setBalance(double balance){
    this.balance=balance;
}
public double getAnnualInterestRate(){
 return annualInterestRate;   
}
public void setAnnualInterestRate(double annualInterestRate){
    this.annualInterestRate=annualInterestRate;
}
public Date getDateCreated(){
    return dateCreated;
}
public double getMonthlyInterestRate(){
    return annualInterestRate / 100 / 12;
}
public double getMonthlyInterest(){
    return balance * getMonthlyInterestRate();
}
public void withdraw(double amount) {
balance = balance - amount;
}
public void deposit(double amount){
    balance=balance+amount;
}
public static void main(String[] args){
    Account account = new Account(1122, 20000);
    account.setAnnualInterestRate(4.5);
    account.withdraw(2500);
    account.deposit(3000);
    System.out.println(account.getBalance());
    System.out.println(account.getMonthlyInterest());
    System.out.println(account.getDateCreated());
}
}