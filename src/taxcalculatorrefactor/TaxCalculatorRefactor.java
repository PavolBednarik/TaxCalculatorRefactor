/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taxcalculatorrefactor;

/**
 *
 * @author pavol
 */
public class TaxCalculatorRefactor {

    public static double prsiTax(double income){
    double prsi = income * 0.04;
    return prsi;
    }   
    public static double payeTax (double income){
    double paye = 0;
    if (income > 40000){
        paye += 40000 * 0.2;
        paye += (income - 40000) * 0.4;
        return paye;
    } else {
        paye = income * 0.2;
        return paye;
    }
    }
     // Usc Tax calculation
    public static double uscTax (double income){
    double usc = 0;
    
    if (income < 12012) {
        usc = income * 0.005;
    } else  {
        usc += 12012 * 0.005;
        income -= 12012;
    } 
    if(income < 10908) {
        usc += income * 0.02;
    } else {
        usc += 10908 * 0.02;
        income -= 10908;
    }
    if (income < 47198) {
        usc += income * 0.04;
    } else {
        usc += 47198 * 0.04;
        income -= 47198;
        usc += income * 0.08;
    }
    return usc;
    }
    public static void main(String[] args) {
    
    }
    
}
