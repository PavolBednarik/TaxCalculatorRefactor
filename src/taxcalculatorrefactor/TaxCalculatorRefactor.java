/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taxcalculatorrefactor;

import java.util.Scanner;

/**
 *
 * @author pavol
 */
public class TaxCalculatorRefactor {
    public static double userInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your salary:");
        while (!sc.hasNextDouble()){
            System.out.println("Invalid input, please enter value in numbers.");
            sc.next();
            System.out.println("Enter your salary");
        }
        double income =sc.nextDouble();
        sc.close();
        return income;
    }

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
      double income = userInput();
        double paye = payeTax(income);
        double usc = uscTax(income);
        double prsi = prsiTax(income);
        System.out.println("Your tax due is: " + paye + prsi + usc);
        System.out.println("Your tax due is: " + (paye + prsi + usc));
    }
    
}
