package ObserverDesignPattern;

import ObserverDesignPattern.Observable.IPhoneObservableImpl;
import ObserverDesignPattern.Observable.LaptopStockObservable;
import ObserverDesignPattern.Observable.StockObservable;
import ObserverDesignPattern.Observer.EmailAlertObserver;
import ObserverDesignPattern.Observer.MobileAlertObserver;

public class Main {
    public static void main(String[] args) {
        StockObservable iPhoneStockObservable = new IPhoneObservableImpl();
        StockObservable laptopStockObservable = new LaptopStockObservable();
        var Observer1Email = new EmailAlertObserver("obs1@mail.com", "iphone");
        var Observer1Mobile = new MobileAlertObserver(987876766, "iPhone");
        var Observer2Email = new EmailAlertObserver("obs2@mail.com", "Laptop");
        var observer2Mobile = new MobileAlertObserver(887877878, "Laptop");
        iPhoneStockObservable.add(Observer1Email);
        laptopStockObservable.add(Observer2Email);
        iPhoneStockObservable.add(Observer1Mobile);
        laptopStockObservable.add(observer2Mobile);
        iPhoneStockObservable.setStock(10);
        laptopStockObservable.setStock(20);
    }
}
