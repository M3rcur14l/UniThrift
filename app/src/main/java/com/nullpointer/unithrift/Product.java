package com.nullpointer.unithrift;

/**
 * Created by antonello on 07/11/15.
 */
public class Product {

    private String id;
    private String transactionId;
    private String sellerId;
    private String buyerId;
    private String description;
    private String date;
    private String price;

    public Product(String id, String transactionId, String sellerId, String buyerId, String description, String price) {
        this.id = id;
        this.transactionId = transactionId;
        this.sellerId = sellerId;
        this.buyerId = buyerId;
        this.description = description;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public String getSellerId() {
        return sellerId;
    }

    public String getBuyerId() {
        return buyerId;
    }

    public String getDescription() {
        return description;
    }

    public String getPrice() {
        return price;
    }

    public String getDate() {
        return date;
    }
}
