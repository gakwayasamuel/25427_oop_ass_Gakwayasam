package _25427.q9;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    private static final String ID = "25427";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {
            System.out.println(ID + " === AIRLINE TICKETING SYSTEM ===");

            System.out.print(ID + " Airline ID: "); int id = sc.nextInt(); sc.nextLine();
            System.out.print(ID + " Airline Name: "); String aName = sc.nextLine();
            System.out.print(ID + " Address: "); String addr = sc.nextLine();
            System.out.print(ID + " Email: "); String email = sc.nextLine();

            System.out.print(ID + " Flight Number: "); String fNo = sc.nextLine();
            System.out.print(ID + " Destination: "); String dest = sc.nextLine();
            System.out.print(ID + " Departure Time: "); String dep = sc.nextLine();

            System.out.print(ID + " Passenger Name: "); String pName = sc.nextLine();
            System.out.print(ID + " Passport: "); String pass = sc.nextLine();
            System.out.print(ID + " Nationality: "); String nat = sc.nextLine();

            System.out.print(ID + " Seat Number: "); String seat = sc.nextLine();
            System.out.print(ID + " Seat Type (Economy/Business): "); String type = sc.nextLine();

            System.out.print(ID + " Ticket Number: "); String tNo = sc.nextLine();
            System.out.print(ID + " Price: "); double price = sc.nextDouble();

            System.out.print(ID + " Baggage Weight: "); double weight = sc.nextDouble();
            System.out.print(ID + " Baggage Fee: "); double fee = sc.nextDouble(); sc.nextLine();

            System.out.print(ID + " Payment Date: "); String pDate = sc.nextLine();
            System.out.print(ID + " Payment Mode: "); String mode = sc.nextLine();

            double total = price + fee;

            TicketRecord record = new TicketRecord(
                    id, sdf.format(new Date()), sdf.format(new Date()), aName, addr, email,
                    fNo, dest, dep, pName, pass, nat, seat, type, tNo, price, weight, fee, pDate, mode, total
            );

            record.displayRecord();

        } catch (AirlineDataException e) {
            System.out.println(ID + " Validation Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
