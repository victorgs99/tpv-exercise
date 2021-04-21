package oop.inheritance.core;
import oop.inheritance.data.Card;


public interface TPVCardSwipper {
    Card readCard();
    void showMessage(int x, int y, String message);
}
