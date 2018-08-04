package cn.net.nikai.cloud.user.dto;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * User dto
 *
 * @author nikai
 */
public class User implements Serializable {

    private static final long serialVersionUID = 4944653477783174720L;
    /**
     * id primary key
     */
    private long id;
    /**
     * name
     */
    private String name;
    /**
     * age
     */
    private Integer age;

    /**
     * @dataType List<cn.net.nikai.cloud.user.dto.Card:卡片>:卡片信息
     */
    private List<Card> cards;

    /**
     * @dataType Map<String:标签, cn.net.nikai.cloud.user.dto.Friend:朋友信息>:朋友
     */
    private Map<String,Friend> friends;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public List<Card> getCards() {
        return cards;
    }

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }

    public Map<String, Friend> getFriends() {
        return friends;
    }

    public void setFriends(Map<String, Friend> friends) {
        this.friends = friends;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", cards=" + cards +
                ", friends=" + friends +
                '}';
    }
}