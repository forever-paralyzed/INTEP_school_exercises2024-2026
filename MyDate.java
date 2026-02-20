package sass;


public class MyDate {

    private int year;
    private int month;
    private int day;

   
    public MyDate(int year, int month, int day) {
        this.year = year;
    
        if(month >= 1 && month <= 12){
            this.month = month;
        } else {
            throw new IllegalArgumentException("Invalid month");
        }
    
        if(day >= 1 && day <= 31){
            this.day = day;
        } else {
            throw new IllegalArgumentException("Invalid day");
        }
    }

   
    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
        
    }

    public int getDay() {
        return day;
    }
}