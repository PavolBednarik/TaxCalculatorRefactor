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
    
    public static void main(String[] args) {
    
    }
    
}
