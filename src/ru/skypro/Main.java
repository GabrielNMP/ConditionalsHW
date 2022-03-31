package ru.skypro;

public class Main {

    public static void main(String[] args) {
	//
    // Task 1
        System.out.println(" Task 1. Answers.");
        int clientOs = 1;
        if ( clientOs == 0 ) {
            System.out.println(" You can instal the iOS version of app by the link. ");
        } else {
            System.out.println(" You can instal the Android version of app by the link.");
        }

     // Task 2.
        System.out.println("_________________");
        System.out.println(" Task 2. Answers.");
        int clientOs2 = 1;
        int clientDeviceYear = 2017;
        if ( clientOs2 == 0 && clientDeviceYear >= 2015 ) {
            System.out.println(" You can instal the iOS version of app by the link. ");
        }
        if ( clientOs2 == 0 && clientDeviceYear < 2015 ) {
            System.out.println(" You can instal the LITE iOS version of app by the link. ");
        }
        if ( clientOs2 != 0 && clientDeviceYear >= 2015 ) {
            System.out.println(" You can instal the Android version of app by the link.");
        }
        if ( clientOs2 != 0 && clientDeviceYear < 2015 ) {
            System.out.println(" You can instal the LITE Android version of app by the link.");
        }

// Task 3.
        System.out.println("_________________");
        System.out.println( " Task 3. Answers.");
        int year = 2021;
        if (year % 4 == 0 && year / 100 != 0 || year % 400 == 0) {
            System.out.println( year + " year is a leap year. ");
        }
        else {
            System.out.println(year + " year isn't a leap year. ");
        }

// Task 4.
        System.out.println("_________________");
        System.out.println( " Task 4. Answers.");
        int deliveryDistance = 95;
        int days = 0;
        int daysDelivery = 0;
        if (deliveryDistance < 20) {
            int daysDelivery1 = days + 1;
            System.out.println(" It takes " + daysDelivery1 + "  day.");
        } else {
            if (deliveryDistance >= 20 && deliveryDistance < 60) {
                int daysDelivery2 = days + 2;
                System.out.println(" It takes " + daysDelivery2 + " days.");

            } else {
                int daysDelivery3 = days + 3;
                System.out.println(" It takes " + daysDelivery3 + " days."); }
        }

// Task 5.
        System.out.println("_________________");
        System.out.println( " Task 5. Answers.");

        int monthNumber = 12;

        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println(" It is a winter month! ");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println(" It is a spring month!");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(" It is a summer month!");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(" it is a fall month!");
                break;
            default:
                System.out.println(" There is no such month!");
        }

    }
}
