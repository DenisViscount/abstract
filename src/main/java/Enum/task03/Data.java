package Enum.task03;

import java.util.Random;

public class Data {
    private int year;
    private Month month;
    private int day;
    private DayOfWeek dayOfWeek;

    public Data() {
        getData();
    }

    @Override
    public String toString() {
        return "Data{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                ", dayOfWeek=" + dayOfWeek +
                '}';
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Month getMonth() {
        return month;
    }

    public void setMonth(Month month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public DayOfWeek getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(DayOfWeek dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    Random random = new Random();
    private void getData(){
        year = random.nextInt(2023 - 2000 + 1) + 2000;
        System.out.println(year);
        Month [] months = Month.values();
        month = months[random.nextInt(months.length)];
        System.out.println(month);
        day = random.nextInt(30) +1;
        System.out.println(day);
        DayOfWeek [] dayOfWeeks = DayOfWeek.values();
        dayOfWeek = dayOfWeeks[random.nextInt(dayOfWeeks.length)];
        System.out.println(dayOfWeek);

    }



}
