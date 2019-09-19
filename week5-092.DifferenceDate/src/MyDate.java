public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString() {

        return this.day + "." + this.month + "." + this.year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }

    public int differenceInYears(MyDate comparedDate){

        if (this.earlier(comparedDate)) {
            return differenceWhenThisEarlier(comparedDate);
        }

        int minusOneYear = 0;
        if (this.month < comparedDate.month) {
            minusOneYear = 1;
        } else if (this.month == comparedDate.month && this.day < comparedDate.day) {
            minusOneYear = 1;
        }

        return this.year - comparedDate.year - minusOneYear;
    }

    private int differenceWhenThisEarlier(MyDate compared) {

        int minusOneYear = 0;

        if (compared.month < this.month) {
            minusOneYear = 1;
        } else if (compared.month == this.month && compared.day < this.day) {
            minusOneYear = 1;
        }

        return compared.year - this.year - minusOneYear;
    }
}
