package serverPush.Model;

import lombok.Getter;
import org.json.simple.JSONObject;

public class piggy {
    @Getter
    private JSONObject returnStatement;

    public piggy(JSONObject returnStatement) {
        this.returnStatement = returnStatement;
    }
}
