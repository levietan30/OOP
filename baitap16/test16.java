package baitap16;

public class test16 {
    public static void main(String[] args) {
        Account a1=new Account("A101","Tan Ah Teck",88);
        System.out.println(a1);
        Account a2=new Account("A102","Kumar");
        System.out.println(a2);
        System.out.println("ID:"+a1.getId());
        System.out.println("name:"+a1.getName());
        System.out.println("balance:"+a1.getBalance());
        a1.credit(100);
        System.out.println(a1);
        a1.debit(50);
        System.out.println(a1);
        a1.debit(500);
        System.out.println(a1);
        a1.transferTo(a2,100);
        System.out.println(a1);
        System.out.println(a2);
    }
}

