package com.designpatterns._01_creational._02_factorymethod._02_after;

public interface ShipFactory {
    default Ship orderShip(String name, String email) {
        validate(name, email);
        prepareFor(name);
        Ship ship = createShip();
        sendEmailTo(email, ship);
        return ship;
    }

    Ship createShip();

    void sendEmailTo(String email, Ship ship);

    void validate(String name, String email);

    void prepareFor(String name);
}
