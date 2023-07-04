package cn.net.nikai.cloud.user.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonView;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.Example;
import io.swagger.annotations.ExampleProperty;
import io.swagger.annotations.Extension;
import io.swagger.annotations.ExtensionProperty;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * User dto
 *
 * @author nikai
 * @unignore
 */
@ApiModel(value = "测试用户模型", parent = Void.class, description = "该注解用于测试通用注解的解析", subTypes = {Long.class, Wife.class,
    Order.class})
public class User implements Serializable {

    private static final long serialVersionUID = 4944653477783174720L;
    /**
     * id primary key
     *
     * @required TRUE
     */
    @JsonView({String.class, Long.class})
    private Long id;
    /**
     * <pre>
     *     名字
     * </pre>
     *
     * @min 2
     * @max 20
     */
    @Type(String.class)
    @ApiModelProperty(extensions = {
        @Extension(properties = {@ExtensionProperty(name = "passwd", value = "hello-nikai"),
            @ExtensionProperty(name = "username", value = "admin")})})
    private String name;

    /**
     * 生日
     *
     * @required
     */
    @JsonFormat(shape = Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date birthday;
    /**
     * 年龄
     *
     * @required
     * @min 18
     * @max 150
     */
    @JsonSubTypes({
        @Type(Integer.class),
        @Type(Long.class),
        @Type(Short.class)
    })
    private Integer age;

    /**
     * 邮箱
     *
     * @format email
     */
    private String email;

    /**
     * 用户卡片
     *
     * @min 0
     * @max 30
     */
    @ApiModelProperty(value = "用户的很多卡", name = "cards")
    private List<Card> cards;

    /**
     * <pre>
     *     用户的朋友
     * </pre>
     *
     * @format key uuid
     */
    @ApiModelProperty(value = "用户的朋友", name = "friends", example = "{hello}")
    private Map<String, Friend> friends;

    /**
     * 家人
     */
    @ApiModelProperty(value = "用户的家人,用户属性", name = "family", example = "{world}", required = true)
    private List<User> family;

    /**
     * 老婆
     */
    @ApiModelProperty(value = "用户的老婆", name = "wife", readOnly = true)
    private Wife wife;

    public User() {
    }

    public User(Long id, String name, Integer age, String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
    }

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

    public Wife getWife() {
        return wife;
    }

    public void setWife(Wife wife) {
        this.wife = wife;
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
            ", wife=" + wife +
            '}';
    }
}