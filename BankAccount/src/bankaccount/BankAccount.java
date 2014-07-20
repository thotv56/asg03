/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bankaccount;

/**
 *
 * @author GRU-PC
 */
public class BankAccount {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SavingAccount sever1 = new SavingAccount();
        SavingAccount sever2 = new SavingAccount();
        sever1.setSavingsBalance(2000);
        sever2.setSavingsBalance(3000);
        
        //So du voi lai xuat 4%
        SavingAccount.modifyInterestRate(0.04);
        sever1.calculateMonthlyInterest();
        sever2.calculateMonthlyInterest();
        //So du voi lai xuat 5%
        SavingAccount.modifyInterestRate(0.05);
        sever1.calculateMonthlyInterest();
        sever2.calculateMonthlyInterest();
    }
    
}
