package App.Model;

import lombok.Getter;
import lombok.Setter;

public class Product {
    @Getter
    private String name;
    @Getter @Setter
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

}
