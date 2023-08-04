/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aolej
 */
public class Debt {
    private double balance;
    private double intrestRate;
    
    public Debt (double initilBalance, double initialIntrestRate) {
        this.balance = initilBalance;
        this.intrestRate = initialIntrestRate;
    }
    
    public void printBalance() {
        System.out.println(this.balance);
    }
    
    public void waitOneYear() {
        this.balance *= this.intrestRate;
    }
}
