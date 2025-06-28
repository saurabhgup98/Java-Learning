package ObserverDesignPattern.Observable;

import ObserverDesignPattern.Observer.NotificationAlertObserver;

public interface StockObservable {
    // First we need to register the Observer
    public void add(NotificationAlertObserver observer);

    // we also need method to remove the Observer
    public void remove(NotificationAlertObserver observer);

    // we need the Notify method to notify all the observers
    public void notifyObservers();

    // when we add the stock or set then only we have to notify and hence use setter
    public void setStock(int quantity);

}
