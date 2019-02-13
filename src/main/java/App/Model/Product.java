package App.Model;

import App.RestControllers.UserController;
import lombok.Getter;
import lombok.Setter;
import serverPush.Logic.Facade;

import java.util.LinkedList;

public class Product  implements Subject{
    @Getter
    private String name;
    @Getter @Setter
    private double price;
    private LinkedList<UserController> observers;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public void attach(Observer o) {

    }

    @Override
    public void detach(Observer o) {

    }

    public void changePrice(Double price, String name){
        this.price = price;
        notifyObservers(name);
    }

    @Override
    public void notifyObservers(String nick) {
        for (int i=0;i<observers.size();i++){
            observers.get(i).update(name,price,nick);
        }

    }
}
