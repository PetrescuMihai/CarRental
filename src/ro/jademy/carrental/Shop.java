package ro.jademy.carrental;

import ro.jademy.carrental.cars.Car;
import ro.jademy.carrental.users.Customer;
import ro.jademy.carrental.users.Person;
import ro.jademy.carrental.users.Salesman;

import java.util.ArrayList;

public class Shop {
    // Q: what fields and methods should this class contain?

    private ArrayList<Customer> customerList = new ArrayList<>();
    private ArrayList<Salesman> salesmanList = new ArrayList<>();
    private ArrayList<Car> carsList = new ArrayList<>();


    public Shop(ArrayList<Salesman> salesmenList, ArrayList<Car> carsList) {
        this.salesmanList.addAll(salesmenList);
        this.carsList.addAll(carsList);
    }


    public boolean login(String username, String password) {

        // TODO: implement a basic user login

        return false;
    }

    public void showMenu() {

        System.out.println(" -----------------------------------------------");
        System.out.println("|    Welcome to the Jademy Car Rental Service   |");
        System.out.println(" -----------------------------------------------");
        System.out.println();
        System.out.println("                    MAIN MENU                   ");
        System.out.println("1. List all cars");
        System.out.println("2. List available cars");
        System.out.println("3. List rented cars");
        System.out.println("4. Check income");
        System.out.println("5. Logout");
        System.out.println("6. Exit");
    }

    public void showListMenuOptions() {

        System.out.println("Select an action from below:");
        System.out.println("1. Filter by make");
        System.out.println("2. Filter by model");
        System.out.println("3. Filter by budget");
        // TODO: add additional filter methods based on car specs

        System.out.println("4. Back to previous menu");

    }

    public void calculatePrice(int numberOfDays) {
        // TODO: apply a discount to the base price of a car based on the number of rental days
        // TODO: document the implemented discount algorithm

        // TODO: for a more difficult algorithm, change this method to include date intervals and take into account
        //       weekdays and national holidays in which the discount should be smaller

        // Q: what should be the return type of this method?
    }
}
