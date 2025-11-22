package _25427.q6;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    private static final String ID = "25427";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {
            System.out.println(ID + " === BANKING SYSTEM ===");

            System.out.print(ID + " Bank ID: "); int id = sc.nextInt(); sc.nextLine();
            System.out.print(ID + " Bank Name: "); String bName = sc.nextLine();
            System.out.print(ID + " Branch Code: "); String bCode = sc.nextLine();
            System.out.print(ID + " Address: "); String addr = sc.nextLine();

            System.out.print(ID + " Account Number: "); String accNo = sc.nextLine();
            System.out.print(ID + " Account Type: "); String accType = sc.nextLine();
            System.out.print(ID + " Balance: "); double bal = sc.nextDouble(); sc.nextLine();

            System.out.print(ID + " Customer Name: "); String cName = sc.nextLine();
            System.out.print(ID + " Email: "); String email = sc.nextLine();
            System.out.print(ID + " Phone: "); String phone = sc.nextLine();

            System.out.print(ID + " Transaction ID: "); String txId = sc.nextLine();
            System.out.print(ID + " Transaction Type: "); String txType = sc.nextLine();
            System.out.print(ID + " Amount: "); double amt = sc.nextDouble();

            System.out.print(ID + " Loan Amount: "); double loan = sc.nextDouble();
            System.out.print(ID + " Interest Rate (%): "); double rate = sc.nextDouble();
            System.out.print(ID + " Duration (years): "); int dur = sc.nextInt(); sc.nextLine();

            System.out.print(ID + " Payment Amount: "); double pay = sc.nextDouble(); sc.nextLine();
            System.out.print(ID + " Payment Date (dd/MM/yyyy): "); String pDate = sc.nextLine();

            AccountRecord record = new AccountRecord(
                    id, sdf.format(new Date()), sdf.format(new Date()), bName, bCode, addr,
                    accNo, accType, bal, cName, email, phone, txId, txType, amt,
                    loan, rate, dur, pay, pDate
            );

            record.displayRecord();

        } catch (BankDataException e) {
            System.out.println(ID + " Validation Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println(ID + " Input Error: Please enter valid data.");
        } finally {
            sc.close();
        }
    }
}