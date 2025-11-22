package _25427.q1;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    private static final String STUDENT_ID = "25427";  // Your ID here

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {
            System.out.println("Enter Hospital & Patient Details:");
            System.out.print("Hospital ID: "); int id = sc.nextInt(); sc.nextLine();
            System.out.print("Hospital Name: "); String hName = sc.nextLine();
            System.out.print("Address: "); String addr = sc.nextLine();
            System.out.print("Phone: "); String hPhone = sc.nextLine();
            System.out.print("Email: "); String hEmail = sc.nextLine();

            System.out.print("Patient Name: "); String pName = sc.nextLine();
            System.out.print("Age: "); int age = sc.nextInt(); sc.nextLine();
            System.out.print("Gender (Male/Female/Other): "); String gender = sc.nextLine();
            System.out.print("Contact: "); String contact = sc.nextLine();

            System.out.print("Admission Date (dd/MM/yyyy): "); String admDate = sc.nextLine();
            System.out.print("Room Number: "); String room = sc.nextLine();
            System.out.print("Room Charges: "); double roomCh = sc.nextDouble(); sc.nextLine();

            System.out.print("Diagnosis: "); String diag = sc.nextLine();
            System.out.print("Treatment Given: "); String treat = sc.nextLine();
            System.out.print("Treatment Cost: "); double treatC = sc.nextDouble();

            System.out.print("Doctor Fee: "); double docFee = sc.nextDouble();
            System.out.print("Medicine Cost: "); double medC = sc.nextDouble();

            HospitalRecord record = new HospitalRecord(
                    id, sdf.format(new Date()), sdf.format(new Date()), hName, addr, hPhone, hEmail,
                    pName, age, gender, contact, admDate, room, roomCh, diag, treat, treatC, docFee, medC
            );


            System.out.println(STUDENT_ID + " === HOSPITAL RECORD ===");
            System.out.println(STUDENT_ID + " Hospital: " + record.getHospitalName() + " | Address: " + record.getAddress());
            System.out.println(STUDENT_ID + " Patient: " + record.getPatientName() + " | Age: " + record.getAge() + " | Gender: " + record.getGender());
            System.out.println(STUDENT_ID + " Admission Date: " + record.getAdmissionDate() + " | Room: " + record.getRoomNumber());
            System.out.println(STUDENT_ID);
            System.out.println(STUDENT_ID + " --- CHARGES ---");
            System.out.println(STUDENT_ID + " Room Charges     : " + record.getRoomCharges());
            System.out.println(STUDENT_ID + " Treatment Cost   : " + ((Treatment)record).getTreatmentCost());
            System.out.println(STUDENT_ID + " Doctor Fee       : " + record.getDoctorFee());
            System.out.println(STUDENT_ID + " Medicine Cost    : " + record.getMedicineCost());
            System.out.println(STUDENT_ID + " TOTAL BILL       : " + record.generateBill());
            System.out.println(STUDENT_ID + " =======================");

        } catch (HospitalDataException e) {
            System.out.println(STUDENT_ID + " Validation Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println(STUDENT_ID + " Input Error: Please enter valid data.");
        } finally {
            sc.close();
        }
    }
}
