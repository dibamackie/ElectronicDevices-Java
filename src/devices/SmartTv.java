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

public class SmartTv extends EntertainmentDevices {
    public SmartTv(double price) {
        super(price, "Visual entertainment");
    }

    @Override
    public String deviceFunctionality() {
        return "Streaming and media viewing"; // Provide the specific functionality for SmartTV
    }

    @Override
    public void operate() {
        System.out.println("Operate by using remote control.");
    }

    @Override
    public void maintain() {
        System.out.println("Clean screen and update firmware.");
    }

    @Override
    public String toString() {
        return "SmartTV";
    }
}
