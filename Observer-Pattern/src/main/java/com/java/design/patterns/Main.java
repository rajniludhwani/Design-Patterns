package com.java.design.patterns;

import com.java.design.patterns.Observable.IphoneObservableImpl;
import com.java.design.patterns.Observable.StocksObservable;
import com.java.design.patterns.Observer.EmailAlertObserverImpl;
import com.java.design.patterns.Observer.MobileAlertObserverImpl;
import com.java.design.patterns.Observer.NotificationAlertObserver;

public class Main {
    public static void main(String[] args) {
        StocksObservable iphoneStockObservable = new IphoneObservableImpl();
        NotificationAlertObserver observer1 = new EmailAlertObserverImpl("xyz1@gmail.com", iphoneStockObservable);
        NotificationAlertObserver observer2 = new EmailAlertObserverImpl("xyz2@gmail.com", iphoneStockObservable);
        NotificationAlertObserver observer3 = new MobileAlertObserverImpl("xyz_username", iphoneStockObservable);

        iphoneStockObservable.add(observer1);
        iphoneStockObservable.add(observer2);
        iphoneStockObservable.add(observer3);
        iphoneStockObservable.setStockCount(10);
        System.out.println("---------------------------");
        iphoneStockObservable.setStockCount(20);
    }
}