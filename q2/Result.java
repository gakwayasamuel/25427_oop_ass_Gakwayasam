package _25427.q2;

class Result extends Exam {
    private double obtainedMarks;
    private String remarks;

    public Result(int id, String createdDate, String updatedDate, String schoolName,
                  String address, String phoneNumber, String email, String studentName,
                  int rollNumber, String grade, String contactNumber, String courseName,
                  String courseCode, int creditHours, String examName,
                  double maxMarks, String examDate, double obtainedMarks, String remarks)
            throws SchoolDataException {
        super(id, createdDate, updatedDate, schoolName, address, phoneNumber, email,
                studentName, rollNumber, grade, contactNumber, courseName, courseCode, creditHours,
                examName, maxMarks, examDate);
        if (obtainedMarks < 0) throw new SchoolDataException("Obtained marks cannot be negative");
        if (remarks == null || remarks.trim().isEmpty()) throw new SchoolDataException("Remarks required");
        this.obtainedMarks = obtainedMarks;
        this.remarks = remarks;
    }

    public double getObtainedMarks() { return obtainedMarks; }
    public String getRemarks() { return remarks; }

    public double calculateAverageMarks() {
        return (obtainedMarks / getMaxMarks()) * 100;
    }
}
