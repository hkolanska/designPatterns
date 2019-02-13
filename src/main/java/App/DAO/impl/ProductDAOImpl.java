package App.DAO.impl;

import App.DAO.ProductDAO;
import App.DAO.UserDAO;
import App.Model.Product;
import lombok.Getter;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.sql.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ProductDAOImpl implements ProductDAO {
    @Getter
    private LinkedList<Product> products=new LinkedList<>();

    public ProductDAOImpl(){
        BufferedReader file=null;
        try {
            file =new BufferedReader (new FileReader(new File("D:\\MOJEPRYWATNE\\0nauka\\semestr5\\Wzorce\\Server-push\\othfiles\\products.txt")));
            String line;
            while ((line = file.readLine())!=null){
                String[] pr =line.split(" ");
                products.add(new Product(pr[0],Double.valueOf(pr[1])));
            }
        }
        catch(Exception e){e.printStackTrace();}


    }


}
