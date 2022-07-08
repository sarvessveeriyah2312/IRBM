/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package irbm;
import java.util.Scanner;


public class TaxReportingMain {

  
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //Declarations
            Income icm = new Income();
            Exemption exmp = new Exemption();
            TaxPayer payee = new TaxPayer("Pravenan", "CA20016","30 June 2022","Individual");
            
            //Inputs
            System.out.println("<< INCOME >>");
            System.out.print("Employment Salary: RM ");
            double empsalary = input.nextDouble();
            icm.setEmploymentSalary(empsalary);
            System.out.print("Rental Income: RM ");
            double rentalincome = input.nextDouble();
            icm.setRentalIncome(rentalincome);
            System.out.print("Others Income: RM ");
            double othersincome = input.nextDouble();
            icm.setOthersIncome(othersincome);
            System.out.println("");
            System.out.println("*EXEMPTION*");
            System.out.print("Donation: RM ");
            double donation = input.nextDouble();
            exmp.setDonation(donation);
            System.out.print("Monthly Tax Deduction: RM ");
            double monthtax = input.nextDouble();
            exmp.setMonthly_tax_deduction(monthtax);
            System.out.print("Takaful/Insurance: RM ");
            double ins = input.nextDouble();
            exmp.setInsurance(ins);
            System.out.print("EPF: RM ");
            double epf = input.nextDouble();
            exmp.setEpf(epf);
            System.out.print("Zakat Fitrah: RM ");
            double zakat = input.nextDouble();
            
            //Dispalys
            System.out.println("*TAX SUMMARY*");
            System.out.println("Tax Payer Name: " +payee.getName());
            System.out.println("Tax Number: " +payee.getTaxNo());
            System.out.println("Tax Submission Date: " +payee.getSubmittionDate());
            System.out.println("Total Annual Income: RM " +payee.calculateTotalIncome());
            System.out.println("Total Annual Exemption: RM " +payee.calculateTotalExemption());
            System.out.println("Taxable Amount: RM " +payee.calculateTaxableIncome());
            System.out.println("Income Tax Amount: RM" +payee.calculateIncomeTaxAmount());
            System.out.println("Amount of Tax Charged: RM " +payee.amountOfTaxCharged());
            System.out.println("Amount of (Tax to be Paid) or (Refund with '-' symbol): RM " +payee.taxToBePaid());
                
    }
    
}


