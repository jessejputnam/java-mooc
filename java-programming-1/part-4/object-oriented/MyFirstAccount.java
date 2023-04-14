/*
 * Write a program that creates an account with a balance of 100.0, deposits 20.0 in it, and finally prints the balance. NB! Perform all the operations in this exact order.
 */

public class MyFirstAccount {
    public static void main(String[] args) {
        Account myAccount = new Account("Jesse's Account", 100.0);
        myAccount.deposit(20.0);
        System.out.println(myAccount.saldo());
    }
}