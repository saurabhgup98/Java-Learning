package AdapterDesignPattern.MobileCharger.Adapter;

import AdapterDesignPattern.MobileCharger.Volt;

public interface SocketAdapter {
    Volt get120Volts();
    Volt get12Volts();
    Volt get3Volts();
}
