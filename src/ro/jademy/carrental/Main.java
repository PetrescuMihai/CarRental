package ro.jademy.carrental;

import ro.jademy.carrental.cars.*;
import ro.jademy.carrental.users.Customer;
import ro.jademy.carrental.users.Salesman;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // Q: this is the main entry point of our program. What should we do here?

        Customer c1 = new Customer("Popa", "Andrei");
        Customer c2 = new Customer("Tanase", "Aurel");
        Customer c3 = new Customer("Popescu", "Dana");
        ArrayList<Customer> customerList = new ArrayList<>();
        customerList.add(c1);
        customerList.add(c2);
        customerList.add(c3);


        Salesman s1 = new Salesman("Movilescu", "George");
        Salesman s2 = new Salesman("Mateescu", "Virgil");
        ArrayList<Salesman> salesmanList = new ArrayList<>();
        salesmanList.add(s1);
        salesmanList.add(s2);


        Car a1 = new Dacia("Logan", 2011, "Sedan",5,"Alb", 5000, new Engine("Benzina", "Manual",1600));
        Car a2 = new Dacia("Logan", 2016,"Hatchback",5, "Rosu", 8000, new Engine("Diesel","Manua", 1500));
        Car a3 = new Ford("Focus", 2018, "SUV", 5, "Maro", 12000, new Engine("Diesel", "Automatic", 2000));
        Car a4 = new Suzuky("Vitara",2018, "Sedan", 5, "Albastru", 8000, new Engine("Benzina", "Manual", 1600));
        Car a5 = new Renault("Megane", 2014, "coupe", 3, "Gri", 14000, new Engine("Benzina", "Automatic", 1600));
        ArrayList<Car> carsList = new ArrayList<>();
        carsList.add(a1);
        carsList.add(a2);
        carsList.add(a3);
        carsList.add(a4);
        carsList.add(a5);

        Shop rentalShop = new Shop(salesmanList, carsList);

        // login
        // citim de la tastatura un user si un pass si comparam cu credentialele salesmanilor din shop.



    }
}
