package lesson2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Information {

    private List<String> nickname;
    private Set<String> mail;
    private Map<String, String> userMail;

    public List<String> getNickname() {
        return nickname;
    }

    public void setNickname(List<String> nickname) {
        this.nickname = nickname;
    }

    public Set<String> getMail() {
        return mail;
    }

    public void setMail(Set<String> mail) {
        this.mail = mail;
    }

    public Map<String, String> getUserMail() {
        return userMail;
    }

    public void setUserMail(Map<String, String> userMail) {
        this.userMail = userMail;
    }

    public Information() {
        this.nickname = new ArrayList<>();
        this.mail = new HashSet<>();
        this.userMail = new HashMap<>();
    }

    @Override
    public String toString() {
        return "Information{" +
                "nickname: " + nickname + "\n" +
                "mail: " + mail + "\n" +
                "userMail: " + userMail + "\n" +
                '}';
    }
}
