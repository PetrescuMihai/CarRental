package ro.jademy.carrental;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // Q: this is the main entry point of our program. What should we do here?

        Customer c1 = new Customer("Popa", "Andrei");
        Customer c2 = new Customer("Tanase", "Aurel");
        Customer c3 = new Customer("Popescu", "Dana");
        ArrayList<Customer> customerArrayList = new ArrayList<>();

        Salesman s1 = new Salesman("Movilescu", "George");
        Salesman s2 = new Salesman("Mateescu", "Virgil");
        ArrayList<Salesman>salesmanList = new ArrayList<>();


    }
}
