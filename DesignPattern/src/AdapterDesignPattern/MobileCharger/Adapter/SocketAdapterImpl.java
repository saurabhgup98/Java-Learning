package AdapterDesignPattern.MobileCharger.Adapter;

import AdapterDesignPattern.MobileCharger.Adaptee.Socket;
import AdapterDesignPattern.MobileCharger.Volt;

import java.time.chrono.MinguoDate;

public class SocketAdapterImpl implements SocketAdapter{

    private final Socket socket;

    public SocketAdapterImpl() {
        this.socket = new Socket();
    }

    @Override
    public Volt get120Volts() {
        return socket.getVolts();
    }

    @Override
    public Volt get12Volts() {
        return convertVolt(socket.getVolts(), 10);
    }

    @Override
    public Volt get3Volts() {
        return convertVolt(socket.getVolts(), 40);
    }

    private Volt convertVolt(Volt v, int divisor){
        return new Volt(v.getVolts() / divisor);
    }
}
