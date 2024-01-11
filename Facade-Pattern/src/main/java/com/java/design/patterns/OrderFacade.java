package com.java.design.patterns;

public class OrderFacade {
    ProductDao productDao;
    Invoice invoice;
    Payment payment;
    SendNotification sendNotification;

    public OrderFacade() {
        this.productDao = new ProductDao();
        this.invoice = new Invoice();
        this.payment = new Payment();
        this.sendNotification = new SendNotification();
    }

    public void createOrder() {
        Product product = productDao.getProduct(121);
        payment.makePayment();
        invoice.generateInvoice();
        sendNotification.sendNotification();
    }
}
