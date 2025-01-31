public class BankAccount {
    public static void main(String[] args){
        double balance = 2175.37;               // Bob current balance is $2175.37
        balance -= 302.50;                      // Bob withdrew $302.50
        balance += 50.03;                       // Bob deposited $50.03
        balance = (balance / 2) + 20.00;      // Bob withdrew half of his current balance, then deposited $20.00.
        balance--;                              // Bob withdrew $1.
        balance *= 2;                           // Bob deposited his paycheck that doubled his current balance.
        balance++;                              // Bob deposited $1   

        // the %.2f syntax tells Java to return balance with 2 decimal places 
        // (.2) in decimal representation of a floating-point number (f) from the start of the format specifier (%).
        System.out.printf("This is Bob's balance: %.2f\n", balance);   // reference for "%.2f", to get 2 decimal digits: https://stackoverflow.com/questions/2538787/how-to-print-a-float-with-2-decimal-places-in-java
        // we can also use (float) balance but it varies on the decimal places from above calculations
    }
}
