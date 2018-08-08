package levelup;

public class Date {
    private String year, month, day;

    public Date(String year, String month, String day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    @Override
    public String toString() {
        return this.day + "/" + this.month + "/" + year;
    }
}
