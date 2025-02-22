package baitap71;
import java.util.*;

public class test71 {
    public static void main(String[] args) {
        Customer customer = new Customer("Alice");
        customer.setMember(true);
        customer.setMemberType("Premium");

        Visit visit = new Visit("Alice", new Date());

        visit.setServiceExpense(100);
        visit.setProductExpense(50);

        double serviceDiscount = visit.getServiceExpense() * DiscountRate.getServiceDiscountRate(customer.getMemberType());
        double productDiscount = visit.getProductExpense() * DiscountRate.getProductDiscountRate(customer.getMemberType());

        double totalExpense = visit.getServiceExpense() + visit.getProductExpense() - serviceDiscount - productDiscount;

        System.out.println("Customer: " + customer.getName());
        System.out.println("Member Type: " + customer.getMemberType());
        System.out.println("Service Expense (before discount): $" + visit.getServiceExpense());
        System.out.println("Product Expense (before discount): $" + visit.getProductExpense());
        System.out.println("Service Discount: $" + serviceDiscount);
        System.out.println("Product Discount: $" + productDiscount);
        System.out.println("Total Expense (after discount): $" + totalExpense);
    }
}
