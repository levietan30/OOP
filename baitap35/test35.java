package baitap35;

public class test35 {
    public static void main(String[] args) {
        MyDate date=new MyDate(2024,2,20);
        System.out.println("Current date: "+date);
        System.out.println("Next day: " + date.nextDay());
        System.out.println("Next month: " + date.nextMonth());
        System.out.println("Previous year: " + date.previousYear());
    }
}
