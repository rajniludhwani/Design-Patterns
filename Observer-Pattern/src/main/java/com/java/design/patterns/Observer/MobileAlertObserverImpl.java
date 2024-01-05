package com.java.design.patterns.Observer;

import com.java.design.patterns.Observable.StocksObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver {
    String userName;
    StocksObservable observable;

    public MobileAlertObserverImpl(String userName, StocksObservable observable) {
        this.userName = userName;
        this.observable = observable;
    }

    @Override
    public void update() {
        sendMsgOnMobile(userName, "product is in stock hurry up");
    }

    private void sendMsgOnMobile(String userName, String msg) {
        System.out.println("Mail sent to: "+ userName);
    }
}
