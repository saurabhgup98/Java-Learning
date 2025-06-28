package AdapterDesignPattern.MobileCharger;

import AdapterDesignPattern.MobileCharger.Adaptee.Socket;
import AdapterDesignPattern.MobileCharger.Adapter.SocketAdapterImpl;

public class SocketMain {
    public static void main(String[] args) {
        var soket = new SocketAdapterImpl();

        var v3Socket = soket.get3Volts();
        System.out.println(v3Socket.getVolts());
    }
}
