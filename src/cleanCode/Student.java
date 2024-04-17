package cleanCode;

public class Student {
    private int studentId;
    private String studentName;
    private float[] arrMark = new float[3];
    private boolean gender;

    public Student() {
    }

    public Student(int studentId, String studentName, float[] arrMark, boolean gender) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.arrMark = arrMark;
        this.gender = gender;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public float[] getArrMark() {
        return arrMark;
    }

    public void setArrMark(float[] arrMark) {
        this.arrMark = arrMark;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public float getAvg() {
        float avg;
        int sum = 0;
        for (float element : this.arrMark) {
            sum += element;
        }
        avg = sum / 3F;
        return avg;
    }
    public String toString(){
        return "Mã sinh viên: " + this.studentId + " - Tên học sinh: " + this.studentName
                + " - Điểm trung bình: " + this.getAvg() + " - Giới tính: " + (this.gender? "Nam":"Nữ");
    }
}
