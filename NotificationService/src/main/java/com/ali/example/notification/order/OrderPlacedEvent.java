//package com.ali.example.notification.order;
//
//
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//public class OrderPlacedEvent {
//
//    private String orderNumber;
//    private String email;
//
//    public String getOrderNumber() {
//        return orderNumber;
//    }
//
//    public void setOrderNumber(String orderNumber) {
//        this.orderNumber = orderNumber;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//}
package com.ali.example.notification.order;

public class OrderPlacedEvent {
    private String orderNumber;
    private String email;

    // Constructors
    public OrderPlacedEvent() {}

    public OrderPlacedEvent(String orderNumber, String email) {
        this.orderNumber = orderNumber;
        this.email = email;
    }

    // Getters/Setters
    public String getOrderNumber() { return orderNumber; }
    public void setOrderNumber(String orderNumber) { this.orderNumber = orderNumber; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
}