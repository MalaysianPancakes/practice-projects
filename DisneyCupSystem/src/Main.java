
/*
------------- Main Class: Customer.java -------------
<NAME>
<NETID>
------------- Main Class: Customer.java -------------
 */

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;


public class Main {

    enum drinkType {    // might use it...
        SODA,
        TEA,
        FRUIT
    }

    public void printMainMenu() {
        System.out.println("-------- Welcome --------\n");
        System.out.println("1. Regular Customer");
        System.out.println("2. Preferred Customer");
        System.out.println("3. Orders History\n");
    }

    public void printDrinkOption() {
        System.out.println("-------- Welcome --------\n");
        System.out.println("1. Soda");
        System.out.println("2. Tea");
        System.out.println("3. Fruit \n");
    }

    public String getMenuOptionName(int optionNumber) {
        String drink = "";
        if(optionNumber == 1) {
            drink = "SODA";
        }
        if(optionNumber == 2) {
            drink = "TEA";
        }
        if(optionNumber == 3) {
            drink = "FRUIT";
        }
        return drink;
    }

    public void createCustomerFile(String fileName) {
        File customerFile = new File(fileName + ".txt");
    }

    public void writeToCustomerFile(String fileName) {
        try {
            File customerFile = new File(fileName + ".txt");
            Scanner myReader = new Scanner(customerFile);
            while (myReader.hasNextLine()) {    // write to file
                String customerInfo = myReader.nextLine();
            }

            myReader.close();
        } catch(FileNotFoundException e) {
            System.out.println("An error has occurred.");
        }
    }

    /* Clears the terminal screen */
    public void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void main(String[] args) {

        Main obj = new Main();

        obj.printMainMenu();

        /* Choose menu item and read user input */
        Scanner pickMenuOption = new Scanner(System.in);
        System.out.println("Input: ");
        int optionChoice = pickMenuOption.nextInt();

        String fileFlag = "fileType";   // set a flag to keep track of what customer option was chosen
        if(optionChoice == 1) {
            //obj.createCustomerFile("regCustomerFile");
            fileFlag = "regCustomerFile";
        }
        if(optionChoice == 2) {
            //obj.createCustomerFile("goldCustomerFile");
            fileFlag = "goldCustomerFile";
        }
        if(optionChoice == 3) {
            //obj.createCustomerFile("platCustomerFile");
            fileFlag = "platCustomerFile";
        }
        System.out.println("fileFlag checker: " + fileFlag + "\n");

        /* ask for drink order */
        obj.clearScreen();
        obj.printDrinkOption();
        pickMenuOption = new Scanner(System.in);
        System.out.println("Drink Input: ");
        optionChoice = pickMenuOption.nextInt();
        /* print the drink chosen */
        String printDrink = obj.getMenuOptionName(optionChoice);
        System.out.println("Drink chosen: " + printDrink + "\n");
        /*
            - add item into file
            - read item from file into array
        */

        // can also use scanner to scanner into file then read file to output to array
        Scanner customerInfo = new Scanner(System.in);
        System.out.println("Customer Info Input: ");
        String customerLast = customerInfo.nextLine();
        String customerFirst = customerInfo.nextLine();
        String customerID = customerInfo.nextLine();
        int customerSpent = customerInfo.nextInt();
        /* print the customer's information */
        //System.out.println(customerFirst);

        Customer newCustomer = new Customer(customerLast, customerFirst, customerID, customerSpent);
        /*
            - read file and input last, first, guest id, price
            - add variables to array
        */
        System.out.println(newCustomer.getLastName()); // sample
        System.out.println(newCustomer.getFirstName()); // sample
        System.out.println(newCustomer.getCustomerInfo());  // <- write this into file




//        Gold newGoldCustomer = new Gold(10, "Adams", "John", "jea", 150);
//        Platinum newPlatinumCustomer = new Platinum(20, "Cat", "Mochi", "mtc", 500);


        /* write orders to file */
//        if(flag == 1) {
//            System.out.println("\nFlag is 1 ");
//            // obj.writeToCustomerFile("regular_customer");
//        }
//        if(flag == 2) {
//            obj.writeToCustomerFile("gold_customer");
//        }
//        if(flag == 3) {
//            obj.writeToCustomerFile("platinum_customer");
//        }


    }   // end main
}   // end class
