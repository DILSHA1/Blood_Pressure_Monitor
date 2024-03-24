package model;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

public class Tester {

    int id;
    String name;
    int yob;
    int systolic;
    int diastolic;
    Scanner scanner = new Scanner(System.in);
    List<BloodPressure> bloodPressureRecords = new ArrayList<>();

    public void displayMenu() {

        int choice = 0;
        System.out.println("");
        System.out.println("....Menu....");
        System.out.println("(01) Create a record.");
        System.out.println("(02) Show blood pressure data for all users.");
        System.out.println("(03) Show blood pressure data for selected user.");
        System.out.println("(04) Delete All.");
        System.out.println("(05) Exit.");
        System.out.print("Enter a number (Ex : 1/2/3/4/5) : ");
        System.out.println("");
//        choice = scanner.nextInt();
        if (scanner.hasNextInt()) {
            choice = scanner.nextInt();
        } else {
            System.out.println("\"" + scanner.next() + "\" is invalid Option");
            displayMenu();
        }

        switch (choice) {
            case 0:
                System.out.println("...Please select a option...");
                displayMenu();
                break;
            case 1:
                if (bloodPressureRecords.size() < 5) {
                    create();
                } else {
                    System.out.println("---- Maximum user records have been reached. Please delete some records and try again. ----");
                }
                displayMenu();
                break;
            case 2:
                index();
                displayMenu();
                break;
            case 3:
                System.out.print("Enter user id : ");
                if (scanner.hasNextInt()) {
                    view(scanner.nextInt());
                } else {
                    System.out.println("\"" + scanner.next() + "\" is invalid user id");
                }
                displayMenu();
                break;
            case 4:
                System.out.print("Confirm to delete all records (Y/N) : ");
                if (scanner.next().equalsIgnoreCase("y")) {
                    delete();
                }
                displayMenu();
                break;
            case 5:
                exit();
                break;
            default:
                throw new AssertionError();
        }

    }

    public void create() {
        System.out.print("Enter user id (Ex : 1/2/3/...) : ");
        int checkId = 0;
        if (scanner.hasNextInt()) {
            checkId = scanner.nextInt();
        } else {
            System.out.println("\"" + scanner.next() + "\" is invalid user id");
            displayMenu();
        }

        for (BloodPressure bloodPressureRecord : bloodPressureRecords) {
            bloodPressureRecord.getId();
            if (bloodPressureRecord.getId() == checkId) {
                System.out.println(".... This user id already exist ....");
                displayMenu();
            }
        }
        if (checkId != 0) {
            id = checkId;
        } else {
            System.out.println("user id cannot be \"0\"");
            displayMenu();
        }

        System.out.print("Enter name : ");
        name = scanner.next();

        System.out.print("Enter year of birth : ");
        if (scanner.hasNextInt()) {
            int currentYear = Calendar.getInstance().get(Calendar.YEAR);
            int birthYear = scanner.nextInt();
            if (birthYear >= (currentYear - 64) && birthYear <= currentYear) {
                yob = birthYear;
            } else {
                System.out.println("Invalid birth year. Please enter a year between " + (currentYear - 64) + " and " + currentYear + ".");
                displayMenu();
            }
        } else {
            System.out.println("\"" + scanner.next() + "\" is Invalid input. Please enter a valid year.");
            displayMenu();
        }

        System.out.print("Enter Systolic blood pressure : ");
        if (scanner.hasNextInt()) {
            systolic = scanner.nextInt();
        } else {
            System.out.println("\"" + scanner.next() + "\" is Invalid input. Please enter a valid value.");
            displayMenu();
        }

        System.out.print("Enter diastolic blood pressure : ");
        if (scanner.hasNextInt()) {
            diastolic = scanner.nextInt();
        } else {
            System.out.println("\"" + scanner.next() + "\" is Invalid input. Please enter a valid value.");
            displayMenu();
        }

        BloodPressure bloodPressure = new BloodPressure(id, name, yob, systolic, diastolic);
        bloodPressureRecords.add(bloodPressure);

        System.out.println(".... New record added successfully ....");
        displayMenu();
    }

    public void index() {
        for (BloodPressure bloodPressureRecord : bloodPressureRecords) {
            bloodPressureRecord.display();
        }
        displayMenu();
    }

    public void view(int id) {
        boolean isRecord = false;
        for (BloodPressure bloodPressureRecord : bloodPressureRecords) {
            if (bloodPressureRecord.getId() == id) {
                isRecord = true;
                bloodPressureRecord.display();
            }
        }
        if (!isRecord) {
            System.out.println(".... Record not found ....");
        }
        displayMenu();
    }

    public void delete() {
        bloodPressureRecords.clear();
        System.out.println("All records deleted successfully!");
    }

    public void exit() {
        System.out.println(".... Good bye! ....");
        System.exit(0);
    }

    public static void main(String[] args) {
        Tester tester = new Tester();
        System.out.println("Hi welcome to Blood PressureMonitor Monitor ... !");
        tester.displayMenu();
    }
}
