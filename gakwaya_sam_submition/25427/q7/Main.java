package _25427.q7;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    private static final String ID = "25427";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {
            System.out.println(ID + " === REAL ESTATE MANAGEMENT SYSTEM ===");

            System.out.print(ID + " Agency ID: "); int id = sc.nextInt(); sc.nextLine();
            System.out.print(ID + " Agency Name: "); String aName = sc.nextLine();
            System.out.print(ID + " Location: "); String loc = sc.nextLine();
            System.out.print(ID + " Phone: "); String phone = sc.nextLine();

            System.out.print(ID + " Agent Name: "); String agName = sc.nextLine();
            System.out.print(ID + " Email: "); String email = sc.nextLine();
            System.out.print(ID + " License No: "); String license = sc.nextLine();

            System.out.print(ID + " Property Code: "); String pCode = sc.nextLine();
            System.out.print(ID + " Property Type: "); String pType = sc.nextLine();
            System.out.print(ID + " Price: "); double price = sc.nextDouble(); sc.nextLine();

            System.out.print(ID + " Seller Name: "); String sName = sc.nextLine();
            System.out.print(ID + " Buyer Name: "); String bName = sc.nextLine();
            System.out.print(ID + " Buyer Email: "); String bEmail = sc.nextLine();

            System.out.print(ID + " Agreement Date: "); String aDate = sc.nextLine();
            System.out.print(ID + " Terms: "); String terms = sc.nextLine();

            System.out.print(ID + " Payment Amount: "); double pay = sc.nextDouble(); sc.nextLine();
            System.out.print(ID + " Payment Date: "); String pDate = sc.nextLine();

            System.out.print(ID + " Commission Rate (%): "); double rate = sc.nextDouble();

            RealEstateRecord record = new RealEstateRecord(
                    id, sdf.format(new Date()), sdf.format(new Date()), aName, loc, phone,
                    agName, email, license, pCode, pType, price, aDate, terms, pay, pDate, rate
            );

            record.displayRecord();

        } catch (RealEstateDataException e) {
            System.out.println(ID + " Validation Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
