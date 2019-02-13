package App.DAO.impl;

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
                products.add(new App.Model.Product(pr[0],Double.valueOf(pr[1])));
            }
        }
        catch(Exception e){e.printStackTrace();}


    }


}
