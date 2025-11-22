package _25427.q2;

class Fee extends Result {
    private double tuitionFee;
    private double examFee;

    public Fee(int id, String createdDate, String updatedDate, String schoolName,
               String address, String phoneNumber, String email, String studentName,
               int rollNumber, String grade, String contactNumber, String courseName,
               String courseCode, int creditHours, String examName,
               double maxMarks, String examDate, double obtainedMarks, String remarks,
               double tuitionFee, double examFee) throws SchoolDataException {
        super(id, createdDate, updatedDate, schoolName, address, phoneNumber, email,
                studentName, rollNumber, grade, contactNumber, courseName, courseCode, creditHours,
                examName, maxMarks, examDate, obtainedMarks, remarks);
        if (tuitionFee <= 0) throw new SchoolDataException("Tuition fee must be > 0");
        if (examFee <= 0) throw new SchoolDataException("Exam fee must be > 0");
        this.tuitionFee = tuitionFee;
        this.examFee = examFee;
    }

    public double getTuitionFee() { return tuitionFee; }
    public double getExamFee() { return examFee; }
    public double getTotalFee() { return tuitionFee + examFee; }
}
