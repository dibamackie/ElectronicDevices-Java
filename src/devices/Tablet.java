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

public class Tablet extends CommunicationDevices {
    public Tablet(double price) {
            super(price, "Multi-functional");

        }
        @Override
        public String deviceFunctionality() {
            return "Larger screen communication";
        }

        @Override
        public void operate() {
            System.out.println("Operate by using the touchscreen");
        }

        @Override
        public void maintain(){
            System.out.println("it performs regular software updates");
        }

        @Override
        public String toString() {
            return "Tablet";
        }
    }
