/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package irbm;


public class Income {
    private double employmentSalary;
    private double rentalIncome;
    private double othersIncome;

    //Getter Setter
    public double getEmploymentSalary() {
        return employmentSalary;
    }

    public void setEmploymentSalary(double employmentSalary) {
        this.employmentSalary = employmentSalary;
    }

    public double getRentalIncome() {
        return rentalIncome;
    }

    public void setRentalIncome(double rentalIncome) {
        this.rentalIncome = rentalIncome;
    }

    public double getOthersIncome() {
        return othersIncome;
    }

    public void setOthersIncome(double othersIncome) {
        this.othersIncome = othersIncome;
    }
}
