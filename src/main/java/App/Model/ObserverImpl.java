package App.Model;

import App.DAO.impl.ProductImpl;
import App.DAO.impl.UserDAOimpl;
import serverPush.Logic.Facade;

import java.util.LinkedList;

public class ObserverImpl implements Observer {
    UserDAOimpl userDAO;
    Facade facade;
    ProductImpl productDAO;

    public ObserverImpl(    UserDAOimpl userDAO, Facade facade,  ProductImpl productDAO) {
        this.productDAO = productDAO;
        this.facade = facade;
        this.userDAO = userDAO;
    }
    public void beObserver(){
        productDAO.updateObserver(this);
    }

    @Override
    public void update(String nameP, Double priceP, String nick) {
        LinkedList<User> recivers = userDAO.getRecivers(nick);
        facade.addNotification(facade.createNewNotification(nameP,priceP, userDAO.getUserFromNick(nick), recivers));
    }

}
