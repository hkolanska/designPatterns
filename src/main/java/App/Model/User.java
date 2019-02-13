package App.Model;

import lombok.Getter;
import lombok.Setter;


public class User {
    @Getter @Setter
    private String nickname;
    @Getter @Setter
    private Boolean inApp;

    public User(String nick,Boolean inApp) {
        this.nickname=nick;
        this.inApp=inApp;
    }

    @Override
    public String toString() {
        return "User{" +
                "nickname='" + nickname + '\'' +
                ", inApp=" + inApp +
                '}';
    }
}
