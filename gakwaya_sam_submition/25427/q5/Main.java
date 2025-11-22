package _25427.q5;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    private static final String ID = "25427";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {
            System.out.println(ID + " === VEHICLE RENTAL SYSTEM ===");

            System.out.print(ID + " Company ID: "); int id = sc.nextInt(); sc.nextLine();
            System.out.print(ID + " Company Name: "); String cName = sc.nextLine();
            System.out.print(ID + " Address: "); String addr = sc.nextLine();
            System.out.print(ID + " Phone: "); String phone = sc.nextLine();

            System.out.print(ID + " Branch Name: "); String bName = sc.nextLine();
            System.out.print(ID + " Location Code: "); String locCode = sc.nextLine();

            System.out.print(ID + " Vehicle Type: "); String vType = sc.nextLine();
            System.out.print(ID + " Registration No: "); String reg = sc.nextLine();
            System.out.print(ID + " Daily Rate: "); double rate = sc.nextDouble(); sc.nextLine();

            System.out.print(ID + " Customer Name: "); String custName = sc.nextLine();
            System.out.print(ID + " License Number: "); String license = sc.nextLine();
            System.out.print(ID + " Contact: "); String contact = sc.nextLine();

            System.out.print(ID + " Rental Date (dd/MM/yyyy): "); String rDate = sc.nextLine();
            System.out.print(ID + " Return Date: "); String retDate = sc.nextLine();
            System.out.print(ID + " Rental Days: "); int days = sc.nextInt();

            System.out.print(ID + " Rental Charge: "); double rCharge = sc.nextDouble();
            System.out.print(ID + " Penalty Charge: "); double pCharge = sc.nextDouble(); sc.nextLine();

            System.out.print(ID + " Payment Mode: "); String mode = sc.nextLine();
            System.out.print(ID + " Transaction ID: "); String txId = sc.nextLine();
            System.out.print(ID + " Total Charge: "); double total = sc.nextDouble();

            RentalRecord record = new RentalRecord(
                    id, sdf.format(new Date()), sdf.format(new Date()), cName, addr, phone,
                    bName, locCode, vType, reg, rate, rDate, retDate, days,
                    rCharge, pCharge, mode, txId, total
            );

            record.displayRecord();

        } catch (RentalDataException e) {
            System.out.println(ID + " Validation Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println(ID + " Input Error: Check your data.");
        } finally {
            sc.close();
        }
    }
}