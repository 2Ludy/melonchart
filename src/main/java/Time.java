public class Time {
    String year;
    String time;

    public Time(String year, String time) {
        this.year = year;
        this.time = time;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return year + " " + time + " 기준 TOP 100 차트";
    }
}
