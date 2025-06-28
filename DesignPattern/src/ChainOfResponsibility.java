abstract class DenominationHandler{
    protected DenominationHandler next;

    public void setNext(DenominationHandler next){
        this.next = next;
    }

    public void dispense(int amount){
        if(next != null){
            next.dispense(amount);
        }
    }
}

// 2000 Note Handler
class TwoThousandHandler extends DenominationHandler {
    public void dispense(int amount) {
        if (amount >= 2000) {
            int count = amount / 2000;
            int remainder = amount % 2000;
            System.out.println("Dispensing " + count + " x ₹2000 notes");
            if (remainder != 0 && next != null) {
                next.dispense(remainder);
            }
        } else {
            super.dispense(amount);
        }
    }
}

class FiveHundredHandler extends DenominationHandler {
    public void dispense(int amount) {
        if (amount >= 500) {
            int count = amount / 500;
            int remainder = amount % 500;
            System.out.println("Dispensing " + count + " x ₹500 notes");
            if (remainder != 0 && next != null) {
                next.dispense(remainder);
            }
        } else {
            super.dispense(amount);
        }
    }
}

class Dispenser{

}

public class ChainOfResponsibility {
    public static void main(String[] args) {
        var twoThousandHandler = new TwoThousandHandler();
        var fiveHundredHandler = new FiveHundredHandler();
        twoThousandHandler.setNext(fiveHundredHandler);

        twoThousandHandler.dispense(500);

    }
}
