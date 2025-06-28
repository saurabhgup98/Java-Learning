package AdapterDesignPattern.Adaptee;

public class WeighMachinesForBabies implements WeightMachine{
    @Override
    public double getWeightInPound() {
        return 20;
    }
}
