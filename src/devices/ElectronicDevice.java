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

public abstract class ElectronicDevice implements IDeviceOperable, IDeviceMaintanable, Comparable<ElectronicDevice>{

    protected double price;
    protected String functionType;

    public ElectronicDevice(double price, String functionType) {
        this.price = price;
        this.functionType = functionType;
    }

    public double getPrice() {
        return price;
    }

    public String getFunctionType() {
        return functionType;
    }
    public abstract String deviceFunctionality();

    @Override
    public int compareTo(ElectronicDevice other) {
        return Double.compare(this.getPrice(), other.getPrice());
    }

    @Override
    public abstract String toString(); // IDK why we need this ??

}
