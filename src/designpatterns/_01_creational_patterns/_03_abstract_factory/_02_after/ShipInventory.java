package designpatterns._01_creational_patterns._03_abstract_factory._02_after;

public class ShipInventory {

    public static void main(String[] args) {
        ShipFactory shipFactory = new WhiteshipFactory(new WhitePartsProFactory());
        shipFactory.createShip();
    }
}
