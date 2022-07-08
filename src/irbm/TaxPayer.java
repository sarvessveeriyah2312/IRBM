/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package irbm;

import static irbm.EzHasil.INDIVIDUAL_EXEMPTION;



public class TaxPayer extends EFiling
{
    protected String name;
    protected String taxNo;
    private Income income;
    private Exemption exemption;
    private double taxRebate;
    
    TaxPayer(String name, String taxNo, String submittionDate, String assessmentType)
    {
        this.name = name;
        this.taxNo = taxNo;
        this.submittionDate = submittionDate;
        this.assessmentType = assessmentType;
    }
    
    public double calculateTotalIncome()
    {
        return (income.getEmploymentSalary() + income.getRentalIncome() + income.getOthersIncome());
    }
    
    public double calculateTotalExemption()
    {
        return (exemption.getDonation() + exemption.getInsurance() + exemption.getEpf());
    }
    
    public double calculateTaxableIncome()
    {
        return (calculateTotalIncome() - (calculateTotalExemption() + INDIVIDUAL_EXEMPTION));
    }
    
    public String getTaxNo()
    {
        return taxNo;
    }
    
    public Income getIncome()
    {
        return income;
    }
    
    public Exemption getExemption()
    {
        return exemption;
    }
    
    public double calculateIncomeTaxAmount()
    {
        double incometaxamount;
        double basetax;
        int taxrate;
        double chargeableincome;
        
        if(calculateTaxableIncome() < 5000)
        {
            basetax = 0;
            taxrate = 0;
            chargeableincome = 0;            
        }
        else if(calculateTaxableIncome() < 20000)
        {
            basetax = 0;
            taxrate = 1;
            chargeableincome = 5000;            
        }
        else if(calculateTaxableIncome() < 35000)
        {
            basetax = 150;
            taxrate = 3;
            chargeableincome = 20000;            
        }
        else 
        {
            basetax = 600;
            taxrate = 5;
            chargeableincome = 35000;            
        }
        
        incometaxamount = basetax + ((calculateTaxableIncome() - chargeableincome)*(taxrate/100));
        
        return (incometaxamount);
    }
    
    public void setTaxRebate(double taxRebate)
    {
        this.taxRebate = taxRebate;
    } 
    
    public double amountOfTaxCharged()
    {
        return (calculateIncomeTaxAmount() - taxRebate);
    }
    
    public double taxToBePaid()
    {
        return (amountOfTaxCharged() - exemption.getMonthly_tax_deduction());
    }
    
    public String getName()
    {
        return name;
    }
}