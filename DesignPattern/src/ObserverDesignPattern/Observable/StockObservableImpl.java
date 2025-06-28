package ObserverDesignPattern.Observable;

import ObserverDesignPattern.Observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class StockObservableImpl implements StockObservable{
    //  we need the list of Observers to add / or Db where we can add list of observer
    List<NotificationAlertObserver> observerList = new ArrayList<>();

    // Let's create the current quantity of stock to be 0 so when add we can update that Iphone in stock
    private int stock;

    @Override
    public void add(NotificationAlertObserver observer) {
        observerList.add(observer);
    }

    @Override
    public void remove(NotificationAlertObserver observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (var observer: observerList){
            // Each observer has update so call the Update which will notify all the Users/Observers
            observer.update();
        }
    }

    @Override
    public void setStock(int quantity) {
        if (stock == 0){
            notifyObservers();
        }
    }
}