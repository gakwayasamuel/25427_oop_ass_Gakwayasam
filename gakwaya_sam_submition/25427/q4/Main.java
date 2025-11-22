package _25427.q4;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    private static final String ID = "25427";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {
            System.out.println(ID + " === HOTEL RESERVATION SYSTEM ===");

            System.out.print(ID + " Hotel ID: "); int id = sc.nextInt(); sc.nextLine();
            System.out.print(ID + " Hotel Name: "); String hName = sc.nextLine();
            System.out.print(ID + " Address: "); String addr = sc.nextLine();
            System.out.print(ID + " Phone: "); String phone = sc.nextLine();
            System.out.print(ID + " Email: "); String email = sc.nextLine();

            System.out.print(ID + " Room Number: "); String roomNo = sc.nextLine();
            System.out.print(ID + " Room Type: "); String roomType = sc.nextLine();
            System.out.print(ID + " Price/Night: "); double price = sc.nextDouble(); sc.nextLine();

            System.out.print(ID + " Customer Name: "); String cName = sc.nextLine();
            System.out.print(ID + " Customer Email: "); String cEmail = sc.nextLine();
            System.out.print(ID + " Contact: "); String contact = sc.nextLine();

            System.out.print(ID + " Booking Date (dd/MM/yyyy): "); String bDate = sc.nextLine();
            System.out.print(ID + " Check-in Date: "); String inDate = sc.nextLine();
            System.out.print(ID + " Check-out Date: "); String outDate = sc.nextLine();

            System.out.print(ID + " Service Name: "); String service = sc.nextLine();
            System.out.print(ID + " Service Cost: "); double sCost = sc.nextDouble(); sc.nextLine();

            System.out.print(ID + " Payment Method: "); String method = sc.nextLine();
            System.out.print(ID + " Payment Date: "); String pDate = sc.nextLine();

            System.out.print(ID + " Room Charge (total): "); double rCharge = sc.nextDouble();
            System.out.print(ID + " Service Charge (total): "); double sCharge = sc.nextDouble();
            System.out.print(ID + " Rating (1-5): "); int rating = sc.nextInt(); sc.nextLine();
            System.out.print(ID + " Comments: "); String comments = sc.nextLine();

            ReservationRecord record = new ReservationRecord(
                    id, sdf.format(new Date()), sdf.format(new Date()), hName, addr, phone, email,
                    roomNo, roomType, price, cName, cEmail, contact, bDate, inDate, outDate,
                    service, sCost, method, pDate, rCharge, sCharge, rating, comments
            );

            record.displayRecord();

        } catch (HotelDataException e) {
            System.out.println(ID + " Validation Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println(ID + " Input Error: Check your data format.");
        } finally {
            sc.close();
        }
    }
}
