package TaskOne;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Customer C1 = new Customer("Linus","Molgaard","lmol");
        Customer C2 = new Customer("Nikoo","Mars","nars");
        Customer C3 = new Customer("Tess","Sett","test");
        //1.e  creating arraylist type Customer and adding the instances to the list
        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(C1);
        customers.add(C2);
        customers.add(C3);
        printCustomers(customers);

    }
    //1.f creating method to print out hte customers in the customers arraylist
    public static void printCustomers(ArrayList<Customer> d){
        for(Customer i: d){
            System.out.println(i);

        }
    }
}
