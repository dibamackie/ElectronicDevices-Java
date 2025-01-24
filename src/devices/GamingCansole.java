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

public class GamingCansole extends EntertainmentDevices  {
    public GamingCansole(double price) {
        super(price, "Interactive-entertainment");

    }
    @Override
    public String deviceFunctionality(){
        return "Interactive entertainment";
    }

    @Override
    public void operate() {
        System.out.println("Operate by using the game controller");
    }

    @Override
    public void maintain(){
        System.out.println("it performs with clean vents and requires software updates");
    }

    @Override
    public String toString() {
        return "GamingCansole";
    }
}

