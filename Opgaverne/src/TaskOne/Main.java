package TaskOne;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Customer C1 = new Customer("Linus","Molgaard","lmol");
        Customer C2 = new Customer("Nikoo","Mars","nars");
        Customer C3 = new Customer("Tess","Sett","test");

        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(C1);
        customers.add(C2);
        customers.add(C3);
        printCustomers(customers);

    }
    public static void printCustomers(ArrayList<Customer> d){
        for(Customer i: d){
            System.out.println(i);

        }
    }
}
