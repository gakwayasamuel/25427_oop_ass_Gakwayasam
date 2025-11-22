package _25427.q8;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    private static final String ID = "25427";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {
            System.out.println(ID + " === LIBRARY MANAGEMENT SYSTEM ===");

            System.out.print(ID + " Library ID: "); int id = sc.nextInt(); sc.nextLine();
            System.out.print(ID + " Library Name: "); String libName = sc.nextLine();
            System.out.print(ID + " Location: "); String loc = sc.nextLine();
            System.out.print(ID + " Phone: "); String phone = sc.nextLine();

            System.out.print(ID + " Section Name: "); String secName = sc.nextLine();
            System.out.print(ID + " Section Code: "); String secCode = sc.nextLine();

            System.out.print(ID + " Book Title: "); String title = sc.nextLine();
            System.out.print(ID + " Author: "); String author = sc.nextLine();
            System.out.print(ID + " ISBN: "); String isbn = sc.nextLine();

            System.out.print(ID + " Member Name: "); String memName = sc.nextLine();
            System.out.print(ID + " Member ID: "); int memId = sc.nextInt(); sc.nextLine();
            System.out.print(ID + " Contact: "); String contact = sc.nextLine();

            System.out.print(ID + " Borrow Date: "); String bDate = sc.nextLine();
            System.out.print(ID + " Return Date: "); String rDate = sc.nextLine();

            System.out.print(ID + " Fine per Day: "); double fineRate = sc.nextDouble();
            System.out.print(ID + " Days Late: "); int daysLate = sc.nextInt(); sc.nextLine();

            System.out.print(ID + " Payment Date: "); String pDate = sc.nextLine();
            System.out.print(ID + " Payment Mode: "); String mode = sc.nextLine();

            double totalFine = fineRate * daysLate;

            LibraryRecord record = new LibraryRecord(
                    id, sdf.format(new Date()), sdf.format(new Date()), libName, loc, phone,
                    secName, secCode, title, author, isbn, bDate, rDate,
                    fineRate, daysLate, pDate, mode, totalFine
            );

            record.displayRecord();

        } catch (LibraryDataException e) {
            System.out.println(ID + " Validation Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println(ID + " Input Error: Check your data.");
        } finally {
            sc.close();
        }
    }
}
