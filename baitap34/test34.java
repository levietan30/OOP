package baitap34;

public class test34 {
    public static void main(String[] args) {
        MyTime time = new MyTime(23, 59, 59);
        System.out.println("Current time: " + time);
        System.out.println("Next second: " + time.nextSecond());
        System.out.println("Next minute: " + time.nextMinute());
        System.out.println("Previous hour: " + time.previousHour());
    }
}
