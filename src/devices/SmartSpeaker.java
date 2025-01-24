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

public class SmartSpeaker extends UtilityDevices{
    public SmartSpeaker(double price) {
        super(price, "Multi-functional");

    }
    @Override
    public String deviceFunctionality() {
        return "Audio assistance";
    }

    @Override
    public void operate() {
        System.out.println("Operate by using voice command ");
    }

    @Override
    public void maintain(){
        System.out.println("Maintain by clean exterior and update the firmware");
    }

    @Override
    public String toString() {
        return "SmartSpeaker";
    }
}


