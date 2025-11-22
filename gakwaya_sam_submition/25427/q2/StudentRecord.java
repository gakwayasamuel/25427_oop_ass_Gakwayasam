package _25427.q2;

final class StudentRecord extends Fee {
    public StudentRecord(int id, String createdDate, String updatedDate, String schoolName,
                         String address, String phoneNumber, String email, String studentName,
                         int rollNumber, String grade, String contactNumber, String courseName,
                         String courseCode, int creditHours, String examName,
                         double maxMarks, String examDate, double obtainedMarks, String remarks,
                         double tuitionFee, double examFee) throws SchoolDataException {
        super(id, createdDate, updatedDate, schoolName, address, phoneNumber, email,
                studentName, rollNumber, grade, contactNumber, courseName, courseCode, creditHours,
                examName, maxMarks, examDate, obtainedMarks, remarks, tuitionFee, examFee);
    }

    public void displayRecord() {
        String ID = "25427";
        System.out.println(ID + " === STUDENT RECORD ===");
        System.out.println(ID + " School   : " + getSchoolName() + " | Address: " + getAddress());
        System.out.println(ID + " Student  : " + getStudentName() + " | Roll No: " + getRollNumber() + " | Grade: " + getGrade());
        System.out.println(ID + " Course   : " + getCourseName() + " (" + getCourseCode() + ") | Credits: " + getCreditHours());
        System.out.println(ID + " Exam     : " + getExamName() + " | Max Marks: " + getMaxMarks() + " | Date: " + getExamDate());
        System.out.println(ID + " Obtained : " + getObtainedMarks() + " | Percentage: " + String.format("%.2f", calculateAverageMarks()) + "%");
        System.out.println(ID + " Remarks  : " + getRemarks());
        System.out.println(ID);
        System.out.println(ID + " --- FEE DETAILS ---");
        System.out.println(ID + " Tuition Fee : " + getTuitionFee());
        System.out.println(ID + " Exam Fee    : " + getExamFee());
        System.out.println(ID + " TOTAL FEE   : " + getTotalFee());
        System.out.println(ID + " =====================");
    }
}
