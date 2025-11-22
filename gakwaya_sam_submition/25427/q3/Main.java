package _25427.q3;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    private static final String ID = "25427";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {
            System.out.println(ID + " === EMPLOYEE PAYROLL SYSTEM ===");

            System.out.print(ID + " Company ID: "); int id = sc.nextInt(); sc.nextLine();
            System.out.print(ID + " Company Name: "); String cName = sc.nextLine();
            System.out.print(ID + " Address: "); String addr = sc.nextLine();
            System.out.print(ID + " Phone: "); String phone = sc.nextLine();
            System.out.print(ID + " Email: "); String email = sc.nextLine();

            System.out.print(ID + " Employee Name: "); String eName = sc.nextLine();
            System.out.print(ID + " Employee ID: "); int eId = sc.nextInt(); sc.nextLine();
            System.out.print(ID + " Designation: "); String desig = sc.nextLine();
            System.out.print(ID + " Contact: "); String contact = sc.nextLine();

            System.out.print(ID + " Total Working Days: "); int totalD = sc.nextInt();
            System.out.print(ID + " Present Days: "); int presentD = sc.nextInt();
            System.out.print(ID + " Leave Days: "); int leaveD = sc.nextInt();

            System.out.print(ID + " Housing Allowance: "); double hAllow = sc.nextDouble();
            System.out.print(ID + " Transport Allowance: "); double tAllow = sc.nextDouble();
            System.out.print(ID + " Tax Deduction: "); double tax = sc.nextDouble();
            System.out.print(ID + " Loan Deduction: "); double loan = sc.nextDouble();
            System.out.print(ID + " Basic Salary: "); double basic = sc.nextDouble();

            PayrollRecord record = new PayrollRecord(
                    id, sdf.format(new Date()), sdf.format(new Date()), cName, addr, phone, email,
                    eName, eId, desig, contact, totalD, presentD, leaveD,
                    hAllow, tAllow, tax, loan, basic
            );

            record.displayPayroll();

        } catch (PayrollDataException e) {
            System.out.println(ID + " Validation Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println(ID + " Input Error: Please enter valid data.");
        } finally {
            sc.close();
        }
    }
}
