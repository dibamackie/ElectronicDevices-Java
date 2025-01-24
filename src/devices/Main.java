/**********************************************
 Workshop #1
 Course:APD545 - Semester Winter
 Last Name: Makki
 First Name: Diba
 ID: 144420189
 Section: NAA
 This assignment represents my own work in accordance with Seneca Academic Policy.
 Signature
 Date:Jan 22, 2025
 **********************************************/
package devices;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        ElectronicDevice[] devices = {
                new SmartPhone(699.0),
                new Tablet(499.0),
                new GamingCansole(399.0),
                new SmartTv(799.0),
                new SmartSpeaker(149.0),
        };

        Scanner scanner = new Scanner(System.in);

        //output of the prices
        System.out.println("--: Requirement 1 :--");
        for (ElectronicDevice device : devices) {
            System.out.print("Enter the price for " + device + ": ");
            double price = scanner.nextDouble();
            device.price = price; //whatever the price is update it
        }

        ElectronicDevice mostExpensiveDevice = Collections.max(Arrays.asList(devices));
        System.out.println("\n --: Requirement 2 :--");
        System.out.println("The most expensive device is " + mostExpensiveDevice);
        System.out.println(mostExpensiveDevice + "'s cost is: $" + mostExpensiveDevice.getPrice());
        System.out.print(mostExpensiveDevice + " is operated: ");
        mostExpensiveDevice.operate();
        System.out.print(mostExpensiveDevice + " maintenance: ");
        mostExpensiveDevice.maintain();
        System.out.println(mostExpensiveDevice + " function type: " + mostExpensiveDevice.getFunctionType());
        // mostExpensiveDevice.getFunctionType();


        //sort and print it
        System.out.println("\n--: Requirement 3 :--");
        Arrays.sort(devices);
        Collections.reverse(Arrays.asList(devices)); //to get in descending order
        System.out.println("Devices in Descending Order of Price: ");
        for (ElectronicDevice device : devices) {
            System.out.println(device);
        }
        // Filter by category
        System.out.println("\n--: Requirement 4 :--");
        System.out.print("Enter a category (CommunicationDevices, EntertainmentDevices, UtilityDevices): ");
        String category = scanner.next();
        System.out.println("\nFunctionality in " + category + ":");
        for (ElectronicDevice device : devices) {
            if (category.equalsIgnoreCase("CommunicationDevices") && device instanceof CommunicationDevices) {
                System.out.println(device + ": " + device.deviceFunctionality());
            } else if (category.equalsIgnoreCase("EntertainmentDevices") && device instanceof EntertainmentDevices) {
                System.out.println(device + ": " + device.deviceFunctionality());
            } else if (category.equalsIgnoreCase("UtilityDevices") && device instanceof UtilityDevices) {
                System.out.println(device + ": " + device.deviceFunctionality());
            }
        }

        scanner.close();
    }
}


