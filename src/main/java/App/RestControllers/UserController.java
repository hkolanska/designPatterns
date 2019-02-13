package App.RestControllers;


import App.DAO.impl.ProductDAOImpl;
import App.DAO.impl.UserDAOimpl;
import App.Model.Product;
import App.Model.User;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import serverPush.Logic.Facade;
import serverPush.Model.notification;
import serverPush.Model.piggy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.LinkedList;
import java.util.Random;

@RestController
public class UserController {
    ProductDAOImpl productDAO = new ProductDAOImpl();
    UserDAOimpl userDAO = new UserDAOimpl();
    Facade facade = new Facade();

    @RequestMapping("/refresh")
    public JSONObject refresh(@RequestParam(value = "nick") String nick) {
        JSONArray ja = new JSONArray();
        LinkedList<Product> products = productDAO.getProducts();
        for (int i=0;i<products.size();i++){
            JSONObject json = new JSONObject();
            json.put("name",products.get(i).getName());
            json.put("price",products.get(i).getPrice());
            ja.add(json);
        }
        User user = userDAO.getUserFromNick(nick);
        piggy notifications = facade.sendResponseToUser(user);
        JSONObject json =notifications.getReturnStatement();
        System.out.println();
        json.put("products",ja);
        return json;
    }

    @RequestMapping("/setRandomRandom")
    public JSONObject random(@RequestParam(value = "nick") String nick) {
        int number = new Random().nextInt(productDAO.getProducts().size());
        productDAO.getProducts().get(number).setPrice(new Random().nextInt(100)+new Random().nextInt(100)*0.01);
        JSONObject json = refresh(nick);
        User user =userDAO.getUserFromNick(nick);
        LinkedList<User> recivers = userDAO.getRecivers(nick);
        facade.addNotification(facade.createNewNotification(productDAO.getProducts().get(number), userDAO.getUserFromNick(nick),recivers));
        return json;
    }
    @RequestMapping("/getUsers")
    public JSONObject getUsers() {
        System.out.println(userDAO.toString());
        LinkedList<User> users = userDAO.getUsers();
        JSONObject json;
        JSONArray ja = new JSONArray();
        for (int i=0;i<users.size();i++){
            if(users.get(i).getInApp()==false){
            json = new JSONObject();
            json.put("name",users.get(i).getNickname());
            ja.add(json);}
        }
        json = new JSONObject();
        json.put("users",ja);
        return json;
    }
    @RequestMapping("/login")
    public JSONObject login(@RequestParam(value = "nick") String nick) {
        userDAO.changeStatus(nick);
        System.out.println(userDAO.toString());
        JSONObject json = refresh(nick);
        return json;
    }


}
