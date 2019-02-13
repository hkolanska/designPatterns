package serverPush.Logic;

import App.Model.Product;
import App.Model.User;
import serverPush.Model.notification;
import serverPush.Model.notificationBuilder;
import serverPush.Model.piggy;
import serverPush.Model.piggyBuilder;
import java.util.LinkedList;

public class Facade {
    private LinkedList<notification> notifications=new LinkedList<>();

    public piggy sendResponseToUser(User user) {

        piggyBuilder notsToSend=new piggyBuilder();
        for (int i=0;i<notifications.size();i++){
            for (int j=0;j<notifications.get(i).getToSend().size();j++){
                if(notifications.get(i).getToSend().get(j).equals(user)){
                    notsToSend.addNot(notifications.get(i));
                    notifications.get(i).removeUserFromToSend(user);
                }
            }
        }
        return notsToSend.build();
    }

    public notification createNewNotification(String name,double price,User user,LinkedList<User> toSend){
        notificationBuilder notB = new notificationBuilder();
        notB.addText(user.getNickname().toString());
        notB.addText(" changed price of ");
        notB.addText(name);
        notB.addText(". The new price is ");
        notB.addText(Double.toString(price));
        notB.setToSend(toSend);
        return notB.build();
    }
    public void addNotification(notification not){
        notifications.add(not);
    }


}
