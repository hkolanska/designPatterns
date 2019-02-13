package serverPush.Model;

import App.Model.User;
import lombok.Getter;
import lombok.Setter;
import java.util.LinkedList;

public class notificationBuilder {
    @Getter @Setter
    private String body="";
    @Getter @Setter
    private LinkedList<User> toSend=new LinkedList<>();

    public notificationBuilder(String body, LinkedList<User> toSend) {
        this.body = body;
        this.toSend = toSend;
    }

    public notificationBuilder() {
    }

    public void addReciver(User reciver){
        this.toSend.add(reciver);
    }

    public void addText(String text){
        this.body=body+text;
    }

    public notification build(){
        return new notification(this.body,this.toSend);
    }

}
