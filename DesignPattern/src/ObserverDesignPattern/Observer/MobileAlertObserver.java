package ObserverDesignPattern.Observer;

public class MobileAlertObserver implements NotificationAlertObserver{

    private final int mobile;
    private final String item;

    public MobileAlertObserver(int mobile, String item) {
        this.mobile = mobile;
        this.item = item;
    }

    @Override
    public void update() {
        System.out.println("The Notification send to mobile number:: " + mobile +
                " and Message is:: " + item + " is in stock, Hurry Up!");
    }
}
