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
        JSONObject json;
        JSONArray ja = new JSONArray();
        for(int i=0;i<notificationContent.size();i++){
            json = new JSONObject();
            json.put("message",notificationContent.get(i));
            ja.add(json);
            System.out.println(ja);
            System.out.println(ja.toString());
        }
        JSONObject returnStatement = new JSONObject();
        returnStatement.put("messages",ja);
        System.out.println(returnStatement);
        System.out.println(returnStatement.toString());
        return new piggy(returnStatement);
    }

}
