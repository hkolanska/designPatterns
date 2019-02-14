package App.DAO.impl;

import App.Model.ObserverImpl;
import App.Model.Product;
import App.RestControllers.UserController;
import lombok.Getter;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.LinkedList;

public class ProductImpl  {
    @Getter
    private LinkedList<App.Model.Product> products=new LinkedList<>();

    public ProductImpl(){
        BufferedReader file=null;
        try {
            file =new BufferedReader (new FileReader(new File("D:\\MOJEPRYWATNE\\0nauka\\semestr5\\Wzorce\\Server-push\\othfiles\\products.txt")));
            String line;
            while ((line = file.readLine())!=null){
                String[] pr =line.split(" ");
                Product product = new Product(pr[0],Double.valueOf(pr[1]));
                products.add(product);
            }
        }
        catch(Exception e){e.printStackTrace();}


    }
    public void updateObserver(ObserverImpl o){
        for(int i=0;i<products.size();i++){
            products.get(i).attach(o);
        }
    }


}
