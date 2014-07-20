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
public class SavingAccount {
   static double annualInterestRate;
   private double savingsBalance;
   
   public void setSavingsBalance(double b){
       this.savingsBalance = b;
   }
   public double getSavingsBalance(){
       return this.savingsBalance;
   }
   
   //Tính lãi hàng tháng
   public void calculateMonthlyInterest(){
       double TienLai1Thang = (savingsBalance*SavingAccount.annualInterestRate)/12;
       savingsBalance += TienLai1Thang;
       System.out.println("Tiền lãi của một tháng: "+TienLai1Thang);
       System.out.println("Số dư tài khoản: "+savingsBalance+"\n");
       System.out.println("---------------------------------------");
   }
   
   //Thay đổi giá trị của 
   public static double modifyInterestRate(double a){
       SavingAccount.annualInterestRate =a;
       return a;
   }
}
