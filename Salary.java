import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;


public class Salary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the monthly salary: ");
        double monthlySalary = sc.nextDouble();

        System.out.print("Enter the birth date (YYYY-MM-DD): ");
        String birthDateStr = sc.next();
        LocalDate birthDate = LocalDate.parse(birthDateStr);

        // Calculate age
        LocalDate currentDate = LocalDate.now();
        int age = Period.between(birthDate, currentDate).getYears();

        // Check if age is between 18 and 55
        if (age < 18) {
            System.out.println("*****************************");
            System.out.println("Invalid age. Age should be more than 18 years.");
            System.out.println("*****************************");

        }

        else if(age > 55){
            System.out.println("*****************************");
            System.out.println("Invalid age. Age should be less than 55 years.");
            System.out.println("*****************************");
        }


        else if (age >= 18 && age <= 55) {
            // Check if salary is between 4500 and 6500
            if (monthlySalary >= 4500 && monthlySalary <= 6500) {
                // Calculate DA, TA, HRA, and PF
                double da = 0.02 * monthlySalary;
                double ta = 0.01 * monthlySalary;
                double hra = 0.03 * monthlySalary;
                double pf = 0.005 * monthlySalary;

                // Calculate annual salary
                double annualSalary = 12 * monthlySalary;

                // Check if annual salary is greater than 10000
                if (annualSalary > 10000) {
                    annualSalary -= 1000; // Deduct professional tax
                }

                // Calculate retirement date
                LocalDate retirementDate = birthDate.plusYears(55);

                // Print the calculated values
                System.out.println("Age: " + age);
                System.out.println("Dearness Allowance : " + da);
                System.out.println("Travelling Allowance : " + ta);
                System.out.println("House Rent Allowance : " + hra);
                System.out.println("Provident Fund: " + pf);
                System.out.println("Annual Salary: " + annualSalary);
                System.out.println("Retirement Date: " + retirementDate);
            } else {
                System.out.println("Invalid salary. Monthly Salary should be between 4500 and 6500 Rs.");
            }
        } else {
            System.out.println("Invalid age. Age should be between 18 and 55 years.");
        }

        sc.close();
    }
}
