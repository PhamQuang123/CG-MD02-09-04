package tdd;

public class NextDayCaculator {
//    private int day;
//    private int month;
//    private int year;
//
//    public NextDayCaculator() {
//    }
//
//    public int getDay() {
//        return day;
//    }
//
//    public void setDay(int day) {
//        this.day = day;
//    }
//
//    public int getMonth() {
//        return month;
//    }
//
//    public void setMonth(int month) {
//        this.month = month;
//    }
//
//    public int getYear() {
//        return year;
//    }
//
//    public void setYear(int year) {
//        this.year = year;
//    }
    public String getDataTest(int day, int month, int year){
        if (day == 0){
            return "Data error";
        }
        return day + "/" + month + "/" + year;
    }
}
