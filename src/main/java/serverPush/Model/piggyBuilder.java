package serverPush.Model;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.util.LinkedList;

public class piggyBuilder {
    private LinkedList<String> notificationContent=new LinkedList<>();


    public piggyBuilder() {
    }

    public void addNot(notification not){
        notificationContent.add(not.getBody());
    }
    public piggy build(){
        JSONObject returnStatement = new JSONObject();
        JSONArray ja = new JSONArray();
        for(int i=0;i<notificationContent.size();i++){
            returnStatement.put("message",notificationContent.get(i));
            ja.add(returnStatement);
        }
        returnStatement = new JSONObject();
        returnStatement.put("messages",ja);

        return new piggy(returnStatement);
    }

}
