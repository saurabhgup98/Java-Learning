package ObserverDesignPattern.Observer;

import ObserverDesignPattern.Observable.StockObservable;

public class EmailAlertObserver implements NotificationAlertObserver{

    private final String emailId;
    private final String item;

    public EmailAlertObserver(String emailId, String item){
        this.item = item;
        this.emailId = emailId;
    }

    @Override
    public void update() {
        System.out.println("Email send to emailId:: " + emailId + " Message is :: " + item + " is in Stock");
    }
}
