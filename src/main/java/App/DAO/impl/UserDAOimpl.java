package App.DAO.impl;

import App.DAO.UserDAO;
import App.Model.User;
import lombok.Getter;

import javax.sql.DataSource;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.sql.*;
import java.util.LinkedList;

public class UserDAOimpl implements UserDAO {
    @Getter
    private LinkedList<User> users = new LinkedList<>();
    public UserDAOimpl(){
    BufferedReader file=null;
        try {
            file =new BufferedReader (new FileReader(new File("D:\\MOJEPRYWATNE\\0nauka\\semestr5\\Wzorce\\Server-push\\othfiles\\users.txt")));
            String line;
            while ((line = file.readLine())!=null){
                String[] pr =line.split(" ");
                users.add(new User(pr[0],Boolean.valueOf(pr[1])));
            }
        }
        catch(Exception e){e.printStackTrace();}


    }
    public void changeStatus(String nickname){
        for(int i=0;i<users.size();i++){
            if(users.get(i).getNickname().equals(nickname)){
                users.get(i).setInApp(true);
            }
        }
    }

    @Override
    public String toString() {
        String u = "";
        for(int i=0;i<users.size();i++)
            u+=users.get(i).toString();
        return "UserDAOimpl{" +
                "users=" + u +
                '}';
    }
    public User getUserFromNick(String nick){
        for (int i=0;i<users.size();i++){
            if (users.get(i).getNickname().equals(nick))
                return users.get(i);
        }
        return null;
    }
    public LinkedList<User> getRecivers(String nick){
        LinkedList<User> recivers=new LinkedList<>();
        for (int i=0;i<users.size();i++){
            if (users.get(i).getNickname().equals(nick))
                continue;
            else{
                recivers.add(users.get(i));
            }
        }
        return recivers;
    }
}
