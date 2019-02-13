package serverPush.Model;

import lombok.Getter;
import lombok.Setter;
import App.Model.User;

import java.util.LinkedList;

public class notification {
    @Getter @Setter
    private String body;
    @Getter @Setter
    private LinkedList<User>toSend;

    public notification(String body, LinkedList<User> toSend) {
        this.body = body;
        this.toSend = toSend;
    }
    public void removeUserFromToSend(User user){
        toSend.remove(user);

    }
}
