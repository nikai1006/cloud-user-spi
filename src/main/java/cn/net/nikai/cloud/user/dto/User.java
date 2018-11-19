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
     * @required TRUE
     */
    private Long id;
    /**
     * <pre>
     *     名字
     * </pre>
     */
    private String name;
    /**
     * age
     */
    private Integer age;

    /**
     * 用户卡片
     */
    private List<Card> cards;

    /**
     * <pre>
     *     用户的朋友
     * </pre>
     */
    private Map<String,Friend> friends;

    /**
     * 家人
     */
    private List<User> family;

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

    public List<User> getFamily() {
        return family;
    }

    public void setFamily(List<User> family) {
        this.family = family;
    }

    @Override
    public String toString() {
        return "User{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", age=" + age +
            ", cards=" + cards +
            ", friends=" + friends +
            ", family=" + family +
            '}';
    }
}