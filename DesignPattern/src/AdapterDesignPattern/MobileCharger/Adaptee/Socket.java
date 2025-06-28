package AdapterDesignPattern.MobileCharger.Adaptee;

import AdapterDesignPattern.MobileCharger.Volt;

public class Socket {
    // Here we want that Socket should only return 120 as value for volts inside the Socket
    // So we cannot allow any constructor or setter as it will return fixed value

    public Volt getVolts(){
        return new Volt(120);
    }
}
