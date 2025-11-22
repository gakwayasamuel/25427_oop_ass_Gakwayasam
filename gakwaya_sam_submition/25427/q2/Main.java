package _25427.q2;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    private static final String ID = "25427";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {
            System.out.println(ID + " === SCHOOL MANAGEMENT SYSTEM ===");
            System.out.print(ID + " Enter School ID: "); int id = sc.nextInt(); sc.nextLine();
            System.out.print(ID + " School Name: "); String sName = sc.nextLine();
            System.out.print(ID + " Address: "); String addr = sc.nextLine();
            System.out.print(ID + " Phone: "); String phone = sc.nextLine();
            System.out.print(ID + " Email: "); String email = sc.nextLine();

            System.out.print(ID + " Student Name: "); String stuName = sc.nextLine();
            System.out.print(ID + " Roll Number: "); int roll = sc.nextInt(); sc.nextLine();
            System.out.print(ID + " Grade: "); String grade = sc.nextLine();
            System.out.print(ID + " Contact: "); String contact = sc.nextLine();

            System.out.print(ID + " Course Name: "); String cName = sc.nextLine();
            System.out.print(ID + " Course Code: "); String cCode = sc.nextLine();
            System.out.print(ID + " Credit Hours: "); int credits = sc.nextInt(); sc.nextLine();

            System.out.print(ID + " Exam Name: "); String eName = sc.nextLine();
            System.out.print(ID + " Max Marks: "); double maxM = sc.nextDouble(); sc.nextLine();
            System.out.print(ID + " Exam Date (dd/MM/yyyy): "); String eDate = sc.nextLine();
            System.out.print(ID + " Obtained Marks: "); double obtM = sc.nextDouble(); sc.nextLine();
            System.out.print(ID + " Remarks: "); String remarks = sc.nextLine();

            System.out.print(ID + " Tuition Fee: "); double tFee = sc.nextDouble();
            System.out.print(ID + " Exam Fee: "); double eFee = sc.nextDouble();

            StudentRecord record = new StudentRecord(
                    id, sdf.format(new Date()), sdf.format(new Date()), sName, addr, phone, email,
                    stuName, roll, grade, contact, cName, cCode, credits,
                    eName, maxM, eDate, obtM, remarks, tFee, eFee
            );

            record.displayRecord();

        } catch (SchoolDataException e) {
            System.out.println(ID + " Validation Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println(ID + " Input Error: Please enter valid data.");
        } finally {
            sc.close();
        }
    }
}
