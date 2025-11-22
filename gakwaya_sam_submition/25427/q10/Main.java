package _25427.q10;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    private static final String ID = "25427";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {
            System.out.println(ID + " === ONLINE SHOPPING SYSTEM ===");

            System.out.print(ID + " Store ID: "); int id = sc.nextInt(); sc.nextLine();
            System.out.print(ID + " Store Name: "); String sName = sc.nextLine();
            System.out.print(ID + " Address: "); String addr = sc.nextLine();
            System.out.print(ID + " Email: "); String email = sc.nextLine();

            System.out.print(ID + " Category Name: "); String catName = sc.nextLine();
            System.out.print(ID + " Category Code: "); String catCode = sc.nextLine();

            System.out.print(ID + " Product Name: "); String pName = sc.nextLine();
            System.out.print(ID + " Product Code: "); String pCode = sc.nextLine();
            System.out.print(ID + " Price: "); double price = sc.nextDouble(); sc.nextLine();

            System.out.print(ID + " Customer Name: "); String cName = sc.nextLine();
            System.out.print(ID + " Contact: "); String contact = sc.nextLine();
            System.out.print(ID + " Customer Address: "); String cAddr = sc.nextLine();

            System.out.print(ID + " Order Date: "); String oDate = sc.nextLine();
            System.out.print(ID + " Order ID: "); String oId = sc.nextLine();

            System.out.print(ID + " Payment Method: "); String payMethod = sc.nextLine();
            System.out.print(ID + " Payment Status: "); String payStatus = sc.nextLine();

            System.out.print(ID + " Shipping Address: "); String shipAddr = sc.nextLine();
            System.out.print(ID + " Shipping Cost: "); double shipCost = sc.nextDouble();

            double total = price + shipCost;

            OrderRecord record = new OrderRecord(
                    id, sdf.format(new Date()), sdf.format(new Date()), sName, addr, email,
                    catName, catCode, pName, pCode, price, oDate, oId, payMethod, payStatus,
                    shipAddr, shipCost, total
            );

            record.displayRecord();

        } catch (ShoppingDataException e) {
            System.out.println(ID + " Validation Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
