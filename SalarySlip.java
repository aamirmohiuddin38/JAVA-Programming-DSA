//Program to generate Salary Slip of an Employee
import java.util.Scanner;
public class SalarySlip {
    public static void main(String args[]){
        System.out.println("\033\143");
        System.out.println("Java | Programming");
        System.out.println("---------------------------------");
        System.out.println("Salary Slip of an Employee...\n");
        Scanner input = new Scanner(System.in);

        //Declaring variables
        float basic, da, hra, conveyance, medical, gross;
        float esic, pf, netPreTax, tds, finalSalary;

        System.out.print("Enter Basic: \t| ");
        basic = input.nextFloat();

        //!calculations
        da = 0.1f * basic; //10% of basic
        hra = 0.5f * basic + da; //50% of basic + da
        conveyance = 1600; //fixed
        medical = 1250; //fixed
        gross = basic + da + hra + conveyance + medical;

        //!deductions
        esic = 0.0475f * gross; //4.75% of gross
        pf = 0.12f * basic; //12% of gross
        netPreTax = gross - esic - pf;
        tds = 0.05f * netPreTax;
        finalSalary = netPreTax - tds;

        //!display
        System.out.println("\n\t---------------------------------");
        System.out.println("\t Basic Salary: \t | "+ String.format("%9.2f", basic));
        System.out.println("\t---------------------------------");
        System.out.println("\t HRA: \t\t | "+ String.format("%9.2f", hra));
        System.out.println("\t DA: \t\t | "+ String.format("%9.2f", da));
        System.out.println("\t Conveyance: \t | "+ String.format("%9.2f", conveyance));
        System.out.println("\t Medical: \t | "+ String.format("%9.2f", medical));
        System.out.println("\t Gross: \t | "+ String.format("%9.2f", gross));
        System.out.println("\t ESIC: \t\t | "+ String.format("%9.2f", esic));
        System.out.println("\t Net PreTax: \t | "+ String.format("%9.2f", netPreTax));
        System.out.println("\t PF: \t\t | "+ String.format("%9.2f", pf));
        System.out.println("\t TDS: \t\t | "+ String.format("%9.2f", tds));
        System.out.println("\t---------------------------------");
        System.out.println("\t Final Salary: \t | "+ String.format("%9.2f", finalSalary));
        System.out.println("\t---------------------------------");

        System.out.println("\n");
        input.close();
    }
}
