package cn.net.nikai.cloud.user.dto;

import io.swagger.annotations.ApiModel;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * cloud-user-spi cn.net.nikai.cloud.user.dto
 *
 * @author: nikai
 * @Description:
 * @Date: Create in 17:56 2018/8/4
 * @Modified By:
 * @unignore
 */
@ApiModel(value = "朋友", description = "朋友实体定义", parent = User.class)
public class Friend implements Serializable {

    private static final long serialVersionUID = -1510197852310149126L;

    /**
     * 编号
     *
     * @required TRUE
     * @unique AUTO_INCREMENT
     */
    private Integer id;


    /**
     * 姓名
     */
    private String name;

    /**
     * 家庭住址
     */
    private String address;

    /**
     * 生日
     */
    private Date brithday;

    /**
     * 老婆
     */
    private User wife;

    /**
     * 个人邮箱
     *
     * @email
     * @min 5
     * @max 200
     * @fomat email
     */
    private String email;

    /**
     * 朋友
     */
    private List<Friend> friends;

    public Friend() {
    }

    public Friend(Integer id, String name, String address, Date brithday, String email) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.brithday = brithday;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getBrithday() {
        return brithday;
    }

    public void setBrithday(Date brithday) {
        this.brithday = brithday;
    }

    public User getWife() {
        return wife;
    }

    public void setWife(User wife) {
        this.wife = wife;
    }

    public List<Friend> getFriends() {
        return friends;
    }

    public void setFriends(List<Friend> friends) {
        this.friends = friends;
    }

    @Override
    public String toString() {
        return "Friend{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", address='" + address + '\'' +
            ", brithday=" + brithday +
            ", wife=" + wife +
            ", friends=" + friends +
            '}';
    }
}
