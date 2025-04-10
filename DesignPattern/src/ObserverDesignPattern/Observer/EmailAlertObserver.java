package ObserverDesignPattern.Observer;

import ObserverDesignPattern.Observable.StocksObservable;

public class EmailAlertObserver implements NotificationAlertObserver{
    String emailId;
    StocksObservable stocksObservable;

    public EmailAlertObserver(String emailId, StocksObservable observable){
        this.stocksObservable = observable;
        this.emailId = emailId;
    }

    @Override
    public void update() {
        sendMail(emailId,"Product is in Stock Hurry Up");
    }

    public void sendMail(String emailId,String msg){
        System.out.println("Email sent to :: " + emailId);
    }
}
